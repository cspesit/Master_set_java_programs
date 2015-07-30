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
public class InvokingMain {
    public static void main(String args[])
    {
        Shape circleInst  = new Shape();
        circleInst.setRadius(7);
        System.out.println (circleInst.
                getArea(circleInst.getRadius()));
        
        Shape rectInst  = new Shape();
        rectInst.setLength(7);
        rectInst.setWidth(8);
        System.out.println
        (rectInst.getArea(rectInst.getLength(),
                rectInst.getWidth()));
        
        
        
        
    }
    
}
