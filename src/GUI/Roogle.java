package GUI;

import controller.GeneticAlgo;
import controller.Main;


/**
 *
 * @author Jennie
 */
public class Roogle {
    public static Main main;
    public static GeneticAlgo ga;
    public static MyFrame frame;
    
    public static void main(String[] args) throws Exception {
        main = new Main();
        ga = new GeneticAlgo(16);
        GeneticAlgo.setParameter(100, 10, 2);
        ga.test2();
        
        frame = new MyFrame();  
        
        frame.setTitle("ROOGLE");
        
        frame.setVisible(true);
        
    }
    
    public static void newGame()
    {
        main = new Main();
        ga = new GeneticAlgo(16);
        GeneticAlgo.setParameter(100, 10, 10);
        ga.test2();
    }
    
    public static void bye()
    {
        frame.dispose();
    }
}
