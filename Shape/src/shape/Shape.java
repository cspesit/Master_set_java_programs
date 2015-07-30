/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shape;

/**
 *
 * @author vijay.dontharaju
 */
public class Shape {
   /// this is for Circle, Square and Rectangle
   private int radius;
   private int length;
   private int width;

   // calculate area of the circle
   public double getArea(int radius)
   {
       return 3.14*radius*radius;
   }
   // this will be useful for rectangle and square
   public double getArea(int length, int width)
   {
       return length*width;
   }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
   
   
    
}
