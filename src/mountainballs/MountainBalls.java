/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountainballs;

import java.awt.EventQueue;

/**
 *
 * @author charu
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MountainBalls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame frame = new BikeFrame();
                frame.setTitle("BounceThread");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
            
        });
    }
    
}
