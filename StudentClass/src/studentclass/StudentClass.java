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
public class StudentClass {

   private int age;
   private String firstName;
   private String lastName;
   private char gender;
   private String telephone;
   private String email;
   
   
   public StudentClass(int age)
   {
       this.age = age;
   }
   
   public String toString()
   {
       return "Name = " + getFirstName()+" " + getLastName()
               + " \n Age = " +getAge()
               + "\n Email =  " + getEmail()
               + " \n telephone = " + getTelephone()
               + " \n gender = " + getGender();
   }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
   
    
    
}// End Student Class
