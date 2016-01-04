/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author EdwardLeonardi
 */
public class ReadFile {
    private BufferedReader in;
    
    public ReadFile()
    {
        try
        {
            in = new BufferedReader(new FileReader("dictionary.txt"));
        }
        
        catch (FileNotFoundException ex)
        {
            
        }
    }
    
    public ArrayList<String> getDictionary()
    {
        ArrayList<String> dictionary = new ArrayList<>();
        
        try
        {
            while(in.ready())
            {
                dictionary.add(in.readLine());
            }
        }
        
        catch (IOException ex) 
        {
            
        }
        
        return dictionary;
    }
}
