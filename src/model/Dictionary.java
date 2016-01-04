/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author EdwardLeonardi
 */
public class Dictionary {
    private ArrayList<String> dictionary;
    
    public Dictionary(ArrayList<String> dictionary)
    {
        this.dictionary = dictionary;
        System.out.println(this.dictionary.size());
    }
}
