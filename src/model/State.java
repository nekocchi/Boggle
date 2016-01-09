/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;

/**
 *
 * @author EdwardLeonardi
 */
public class State {
    private int[] state;
    private double f;

    public State(int[] state) {
        this.state = state;
    }

    public int[] getState() {
        return state;
    }

    public double getF() {
        return f;
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
}
