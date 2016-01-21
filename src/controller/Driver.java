/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


/**
 *
 * @author EdwardLeonardi
 */
public class Driver
{   
    public static Main main;
    public static GeneticAlgo ga;
    
    public static void main(String[] args)
    {
        Driver.main = new Main();
        Driver.main.test();
        
        Driver.ga = new GeneticAlgo(16);
        GeneticAlgo.setParameter(100, 10, 1);
        ga.test2();
        
    }
}
