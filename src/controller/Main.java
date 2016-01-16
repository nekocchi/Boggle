/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.*;

/**
 *
 * @author EdwardLeonardi
 */
public class Main {
    private Board b;
    private ReadFile rf;
    private Dictionary d;
    private ArrayList<State> population;
    private final int row, column, popSize;
    
    public Main() {
        this.row = 4;
        this.column = 4;
        this.popSize = 10;
        this.b = new Board(this.row, this.column);
        this.rf = new ReadFile();
        this.d = new Dictionary(this.rf.getDictionary());
        this.population = new ArrayList<>();
        
        //Genetic Algorithm
//        d.searchWord(new Word("abalones"));
    }
    
    public void GeneticAlgo()
    {
        
    }
    
    public void GeneratePopulation()
    {
        int uninserted = 0;
        boolean temp;
        int[] state = new int[this.row * this.column];
        
        for(int a = 0; a < this.popSize; a++)
        {
            for(int b = 0; b < (this.row * this.column); b++)
            {
                int rand = (int) Math.round(Math.random());
                
                state[b] = rand;
            }
            
            temp = addPopulation(state);
            
            //count the number of existing states in the population
            if(temp)
            {
                uninserted++;
            }
        }
        
        while(uninserted != 0)
        {
            for(int c = 0; c < uninserted; c++)
            {
                for(int b = 0; b < (this.row * this.column); b++)
                {
                    int rand = (int) Math.round(Math.random());

                    state[b] = rand;
                }
                
                temp = addPopulation(state);
                
                //if it is successfully added
                if(!temp)
                {
                    uninserted--;
                }
            }
        }
    }
    
    private boolean addPopulation(int[] state)
    {
        boolean inserted = false, exist = false, uninserted = false;
        State st;
        
        //create new object of state to generate fitness
        st = new State(state, null);
        
        for(int c = 0; c < population.size(); c++)
        {
            if(population.get(c).getF() > st.getF())
            {
                population.add(c, st);
                inserted = true;
                break;
            }
            
            //if it exist in the population
            if(population.get(c).arintToString().equals(st.arintToString()))
            {
                exist = true;
                uninserted = true;
            }
        }
        
        if(!inserted && !exist)
        {
            population.add(st);
        }
        
        return uninserted;
    }
    
    
    public int getRow(){
        return this.row;
    }
    
    public int getColumn(){
        return this.column;
    }
    
    public Dictionary getDictionary(){
        return this.d;
    }
    
    public void test(){
        population.add(new State(null, new Word("abalones")));
        population.get(0).print();
    }
    
}
