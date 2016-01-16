/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Driver;
import java.util.Arrays;

/**
 *
 * @author EdwardLeonardi
 */
public class State {
    private int[] state;
    private Word word;
    private double f;

    public State(int[] state, Word word) {
        this.state = state;
        this.word = word;
        setF(computeF());
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
        
        double result = 0;
        int isValid = 0;
        
        double maxLength = Driver.main.getRow() * Driver.main.getColumn();
        
        isValid = Driver.main.getDictionary().searchWord(word);
        if(isValid == -1){
            isValid = 0;
        }
        else{
            isValid = 1;
        }
        
        result = isValid * (maxLength - word.getActual().length());
        
        return result;
    }

    public void print(){
        System.out.println("---------------------------");
        System.out.println("FITNESS TEST");
        System.out.println("WORD : "+ word.getActual());
        System.out.println("Fitness : "+ f);
    }
}
