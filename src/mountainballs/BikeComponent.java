/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountainballs;
import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *this class is the component that draws the ball
 * @author charu
 */
public class BikeComponent extends JPanel {
    private static final int DEFAULT_WIDTH = 450;
    private static final int DEFAULT_HEIGHT = 350;
    
    private java.util.List<bikes> bikes = new ArrayList<>();
    
    /**
     * Adding a bike to the component (frame)
     */
    public void add(bikes b)
    {
        bikes.add(b);
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); 
        Graphics2D g2 = (Graphics2D) g;
        for(bikes b : bikes)
        {
            g2.fill(b.getShape());
        }
    }
    
    public Dimension getPreferedSize()
    {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
