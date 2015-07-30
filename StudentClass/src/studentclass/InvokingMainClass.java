/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentclass;

/**
 *
 * @author vijay.dontharaju
 */
public class InvokingMainClass {
    
    public static void main(String args[])
    {
      
        StudentClass st1 = new StudentClass(32);
        System.out.println("Before assigning values");
        System.out.println (st1.toString());
        st1.setAge(17);
        st1.setFirstName("Alice");
        st1.setLastName("Sunday");
        st1.setGender('F');
        st1.setTelephone("235-252-5223");
        st1.setEmail("something@example.com");
        System.out.println("After assigning values");
        System.out.println (st1.toString());
        
        StudentClass st2 = new StudentClass(24);
        st2.setAge(23);
        st2.setFirstName("Vijay");
        st2.setLastName("Dontharaju");
        st2.setGender('M');
        st2.setTelephone("245-252-6874");
        st2.setEmail("vdonthaea@hccs.edu");
        System.out.println("After assigning values for st2");
        System.out.println (st2.toString());
        
        
    }// end main
    
    
}// end class
