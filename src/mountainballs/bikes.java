/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountainballs;


import java.awt.geom.*;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author charu
 */
public class bikes {
    private static final int XSIZE = 50;
    private static final int YSIZE = 50;
    private double xPosition = 500; // position where the ball comes in 
    private double yPosition = 500;
    private double dx = 1; // how fast the ball goes
    private double dy = 1;
    
    /**
     * Moves the bike to the next position
     */
    public void moveBike(Rectangle2D bounds)
    {
        xPosition += dx;
        yPosition += dy;
        
       if(xPosition<bounds.getMinX())
       {
           xPosition = bounds.getMinX();
           dx = -dx;
       } 
       if(xPosition + XSIZE >= bounds.getMaxX())
       {
           xPosition = bounds.getMaxX() - XSIZE;
           dx = -dx;
           
       }
       if(yPosition<bounds.getMinY())
       {
           yPosition = bounds.getMinY();
           dy = -dy;
       } 
       if(yPosition + YSIZE >= bounds.getMaxY())
       {
           yPosition = bounds.getMaxX() - YSIZE;
           dy = -dy;
           
       }    }
       
      

    /**
     * Get the shape of the bike
     * @return
     */
     public Ellipse2D getShape() {
        return new Ellipse2D.Double(xPosition, yPosition, XSIZE, YSIZE);
    }
       
    
    
}
