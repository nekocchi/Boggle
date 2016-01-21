package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jennie
 */
public final class MyFrame extends JFrame{
    
    //Variables declaration//
    private final int WIDTH = 960, HEIGHT = 960;
    private static Container contentPane;
    
    //Constructor//
    public MyFrame() throws IOException{
//        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/spectra_logo.png")).getImage());
        initializeFrame();
        drawContent(new MenuPanel());
    }
    
    //Other methods//
    private void initializeFrame(){
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        contentPane = this.getContentPane();
    }
    
    public static void drawContent(JPanel menuPanel) throws IOException{
        contentPane.removeAll();
        contentPane.setLayout(new BorderLayout());
        
        contentPane.add(menuPanel, BorderLayout.CENTER);
        contentPane.revalidate();
    }
}
