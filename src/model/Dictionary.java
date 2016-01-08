/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author EdwardLeonardi
 */
public class Dictionary {
    private ArrayList<Word> dictionary;
    
    public Dictionary(ArrayList<Word> dictionary)
    {
        this.dictionary = dictionary;
        sortDictionary();
//        System.out.println(this.dictionary.size());
    }
    
    public int searchWord(Word word)
    {
        Comparator<Word> c = new Comparator<Word>(){

//            @Override
//            public int compare(String o1, String o2) {
//                char[] t1 = o1.toCharArray();
//                char[] t2 = o2.toCharArray();
//                
//                Arrays.sort(t1);
//                Arrays.sort(t2);
//                
//                if(o2.equals("abalones"))
//                {
//                    System.out.print(t1);
//                    System.out.print(" ");
//                    System.out.println(t2);
//                }
//                
//                String p1 = new String(t1);
//                String p2 = new String(t2);
//                
//                return p1.compareTo(p2);
//            }  

            @Override
            public int compare(Word o1, Word o2) {
                return o1.getSorted().compareTo(o2.getSorted());
            }
        };
        
        int index = Collections.binarySearch(dictionary, word, c);
        
        System.out.println("Index: " + index);
        System.out.println("Word: " + this.dictionary.get(index).getActual());
        
        return index;
    }
    
    private void sortDictionary()
    {
        Collections.sort(dictionary, Word.sortedComparator);
    }
}
