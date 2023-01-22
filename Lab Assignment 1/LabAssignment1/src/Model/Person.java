/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author shreyamalapaka
 */
public class Person {
    
    long nuid;
    String firstName;
    String lastName;
    String clgName;
    
    Contact oContact;
    Contact pContact;
    
    Address currAddress;
    Address permAddress;
    
    
    
    
    //Constructors
    public Person(){
       
        this.firstName = "";
        this.lastName = "";
        this.clgName = "";
        
        this.oContact = new Contact();
        this.pContact = new Contact();
        
        this.currAddress = new Address();
        this.permAddress = new Address();
    }
    
    //Getters and Setters

    public long getNuid() {
        return nuid;
    }

    public void setNuid(long nuid) {
        this.nuid = nuid;
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

    public String getClgName() {
        return clgName;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
    }

    public Contact getoContact() {
        return oContact;
    }

    public void setoContact(Contact oContact) {
        this.oContact = oContact;
    }

    public Contact getpContact() {
        return pContact;
    }

    public void setpContact(Contact pContact) {
        this.pContact = pContact;
    }

    public Address getCurrAddress() {
        return currAddress;
    }

    public void setCurrAddress(Address currAddress) {
        this.currAddress = currAddress;
    }

    public Address getPermAddress() {
        return permAddress;
    }

    public void setPermAddress(Address permAddress) {
        this.permAddress = permAddress;
    }
    
    



  
    
   
}
