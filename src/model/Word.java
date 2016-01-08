/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author EdwardLeonardi
 */
public class Word {
    private String actual, sorted;
    
    public Word(String w) {
        this.actual = w;
        
        char[] temp = w.toCharArray();
        Arrays.sort(temp);
        
        this.sorted = new String(temp);
    }

    public static Comparator<Word> sortedComparator = new Comparator<Word>() {

        @Override
        public int compare(Word o1, Word o2) {
            return o1.getSorted().compareTo(o2.getSorted());
        }
    };
    
    public String getActual() {
        return actual;
    }

    public String getSorted() {
        return sorted;
    }
}
