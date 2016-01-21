/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Driver;
import controller.Main;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author EdwardLeonardi
 */
public class State {
    private int[] state;
    private Word word;
    private double f;
    private String foundWord;

    public State(int[] state) {
        this.state = state;
//        this.word = word;
        stateToWord();
//        System.out.println(word.getActual());
        setF(computeF());
    }
    
    private void stateToWord()
    {
        String board = Main.b.getBoard();
        String tempWord = "";
        
        for(int bom = 0; bom < state.length; bom++)
        {
            if(state[bom] == 1)
            {
                tempWord = tempWord + board.charAt(bom);
            }
        }
        
        word = new Word(tempWord);
    }

    public int[] getState() {
        return state;
    }

    public double getF() {
        return f;
    }
    
    private void setF(double f){
        this.f = f;
    }
    
    //Array of Integer to String
    public String arintToString()
    {
        int[] arint = Arrays.copyOf(state, state.length);
        String str = "";
        
        for(int a = 0; a < arint.length; a++)
        {
            str = str + Integer.toString(arint[a]);
        }
        
        return str;
    }
    
    /**
     * Computing the fitness of the state (How close to the goal)
     * Length of the char should be close enough to 16 (max length) and stated in the dictionary list
     */
    private double computeF() {
        double fitness = 0;
        int found;
        String longest = "";
        ArrayList<String> comlist;
        Combinations com = new Combinations(word.getSorted());
        comlist = com.getComstring();
        
        for(String single : comlist)
        {
            found = Main.d.searchWord(new Word(single));
            
            if(found >= 0)
            {
                if(longest.length() < Main.d.getDictionary().get(found).getActual().length())
                {
                    longest = Main.d.getDictionary().get(found).getActual();
                }
            }
        }
        
        fitness = longest.length();
        
        return fitness;
    }

    public void print(){
        System.out.println("---------------------------");
        System.out.println("FITNESS TEST");
        System.out.println("WORD : "+ word);
        System.out.println("Fitness : "+ f);
    }
    
    @Override
    public String toString(){
        String selected = "Selected [1] : ";
        String unselected = "Unselected [0] : ";
        
        for(int i = 0; i<state.length; i++){
            if(state[i] == 1)
                selected = selected + (i+1) + " ";
            else
                unselected = unselected + (i+1) + " ";
        }
        
        String string = selected + "\n" + unselected;
        
        string = "["+getF()+"]"+ "\n" + string;
        
        return string;
    }
}
