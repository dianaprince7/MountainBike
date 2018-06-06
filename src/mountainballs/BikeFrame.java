/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountainballs;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *This class constructs a frame with ball component and buttons 
 * @author charu
 */
public class BikeFrame extends JFrame{
    private BikeComponent comp;
    //public static final int STEPS = 10000;
    //public static final int DELAY = 3;
   
    /**
     * Constructs the frame with component for showing the bouncing bike and 
     * start and close button
     */
    
    public BikeFrame()
    {
        setTitle("MountainBike");
        comp = new BikeComponent();
        add(comp, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel, "Start", new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                addBikes();
            }
        });
        addButton(buttonPanel, "Close", new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                System.exit(0);
            }
        });
        
        add(buttonPanel, BorderLayout.SOUTH);
        pack();  
    }
    
    /**
     * Add a button to the container
     */
    public void addButton(Container c, String title, ActionListener listener)
    {
        JButton button = new JButton(title);
        c.add(button);
        button.addActionListener(listener);
    }
    /**
     * ADDS  a bouncing ball to the panel 
     */
    
    public void addBikes()
    {
        bikes b = new bikes();
        comp.add(b);
        
        Runnable r = new BikesRunnable(b, comp);
        Thread t = new Thread(r);
        t.start();
    }
    
   
}
