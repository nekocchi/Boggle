/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.*;

/**
 *
 * @author EdwardLeonardi
 */
public class Driver
{
    public static void main(String[] args)
    {
        Board b = new Board(4,4);
        ReadFile rf = new ReadFile();
        Dictionary d = new Dictionary(rf.getDictionary());
        d.searchWord(new Word("abalones"));
        
//        b.printBoard();
    }
}
