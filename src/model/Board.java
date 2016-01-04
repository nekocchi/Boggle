/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author EdwardLeonardi
 */
public class Board {
    private String[][] board;

    public Board(int row, int col) {
        board = new String[row][col];
        
        generateBoard();
    }
    
    public void generateBoard()
    {
        String characters = "bcdfghjklmnpqrstvwxyz";
        String vowels = "aiueo";
        
        int charactersLength = characters.length();
        int vowelsLength = vowels.length();
        double index, chance;
        
        for(int r = 0; r < board.length; r++)
        {
            for(int c = 0; c < board[0].length; c++)
            {
                chance = Math.round(Math.random() * 10);
                
                if((int) chance > 4)
                {
                    index = Math.random() * charactersLength;
                    board[r][c] = Character.toString(characters.charAt((int) index));
                }
                
                else
                {
                    index = Math.random() * vowelsLength;
                    board[r][c] = Character.toString(vowels.charAt((int) index));
                }
            }
        }
    }
    
    public void printBoard()
    {
        for(int r = 0; r < board.length; r++)
        {
            for(int c = 0; c < board[0].length; c++)
            {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }
}