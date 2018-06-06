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
 *
 * @author charu
 */
public class BikesRunnable implements Runnable{
    private bikes bike;
    private Component component;
    public static final int STEPS = 1000;
    public static final int DELAY = 5;
    
    public BikesRunnable(bikes bike, Component component)
    {
        this.bike = bike;
        this.component = component;
    }
    
    public void run()
    {
        try
        {
            for(int i=1; i<= STEPS; i++)
            {
                bike.moveBike(component.getBounds());
                component.repaint();
                Thread.sleep(DELAY);
            }
        }catch (InterruptedException e){}
    }
    
    
}
