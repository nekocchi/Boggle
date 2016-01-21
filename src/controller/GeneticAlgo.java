
package controller;

import java.util.ArrayList;
import model.State;

/**
 *
 * @author Jennie
 */
public class GeneticAlgo {
    
    //Static Variables//
    public static int popSize;
    public static int recRate;
    public static int mutRate;

    public static void setParameter(int popSize, int recRate, int mutRate) {
        GeneticAlgo.popSize = popSize;
        GeneticAlgo.recRate = recRate;
        GeneticAlgo.mutRate = mutRate;
    }
    
    //Object Variables//
    private int maxLength;
    private ArrayList<State> curList;
    
    public GeneticAlgo(int maxLength) {
        this.maxLength = maxLength;
        this.curList = new ArrayList<>();
    }

    //Generate Population Randomly
    public void generateIndividual() {
        double temp;
        int[] state = new int[maxLength];

        for (int a = 0; a < maxLength; a++) {
            temp = Math.round(Math.random());
            state[a] = (int) temp;
        }

        insertChild(new State(state));
    }
    
    //Insert child to the curList
    public void insertChild(State st) {
        boolean inserted = false, exist = false;

        for (int m = 0; m < curList.size(); m++) {
            if (curList.get(m).getF() == st.getF()) {
                exist = true;
                break;
            }
        }

        if (!exist) {
            for (int c = 0; c < curList.size(); c++) {
                if (curList.get(c).getF() >= st.getF()) {
                    curList.add(c, st);
                    inserted = true;
                    break;
                }
            }

            if (!inserted) {
                curList.add(st);
            }
        }

        while (curList.size() > GeneticAlgo.popSize) {
            curList.remove(curList.size() - 1);
        }
    }
    
    //Mutate the child by random probability
    public int[] mutation(int[] child) {
        int chance, index;

        chance = (int) Math.round(Math.random() * (GeneticAlgo.mutRate - 1));
        index = (int) Math.round(Math.random() * (this.maxLength-1));

        if (chance == 1) {
            if (child[index] == 0) {
                child[index] = 1;
            } else if (child[index] == 1) {
                child[index] = 0;
            }
        }

        return child;
    }

    //Pilih Parent RANDOM
    public void crossover3() {
        int index1, index2;
        int BestIndex, WorstIndex;
        int random;
        int[] BestParent, WorstParent, child;

        index1 = (int) Math.round(Math.random() * (curList.size() - 1));
        index2 = (int) Math.round(Math.random() * (curList.size() - 1));
        
        if (index1 < index2) {
            BestIndex = index1;
            WorstIndex = index2;
        } else {
            BestIndex = index2;
            WorstIndex = index1;
        }
        
        BestParent = curList.get(BestIndex).getState();
        WorstParent = curList.get(WorstIndex).getState();

        for (int i = 0; i < maxLength; i++) {
            random = (int) Math.round(Math.random() * (GeneticAlgo.recRate - 1));
            if (random == 1) {
                WorstParent[i] = BestParent[i];
            }
        }
        
        child = mutation(WorstParent);

        insertChild(new State(child));
    }
    
    //--Run Genetic Algorithm--//
    public void runRandom() {
        
        curList.clear();
        
        int g = 0;

        //Generate population
        for (int z = 0; z < GeneticAlgo.popSize; z++) {
            generateIndividual();
        }
        while (true) {
            for (int z = 0; z < GeneticAlgo.popSize; z++) {
                crossover3();
            }
            g++;

            if (curList.get(0).getF() <= 6 || g >= 1000) {
                System.out.println("Total Search : " + g);
                System.out.println(curList.get(0).toString());
                break;
            }

        }
    }
    
    //--TEST--//
    public void test() {
        int[] arr = {1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0};
        
        State x = new State(arr);
        
        x.print();
    }
    public void test2(){
        runRandom();
    }

}
