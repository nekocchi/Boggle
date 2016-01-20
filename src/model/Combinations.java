/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Jennie
 */
 public class Combinations {
    private StringBuilder output = new StringBuilder();
    private final String inputstring;
    private ArrayList<String> comstring = new ArrayList<>();
    
    public Combinations( final String str ){
        inputstring = str;
        combine();
    }
    
    public void combine() { combine( 0 ); }
    private void combine(int start ){
        for( int i = start; i < inputstring.length(); ++i ){
            output.append( inputstring.charAt(i) );
            System.out.println( output );
            comstring.add(output.toString());
            if ( i < inputstring.length() )
            combine( i + 1);
            output.setLength( output.length() - 1 );
        }
    }

    public ArrayList<String> getComstring() {
        return comstring;
    }
} 
