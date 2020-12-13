/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.code;

/**
 *
 * @author fatin
 */
public class Student { 
    private int id;
    private String Username;
    private String Email;
    private String Full_name;
    private int Phone;
    private String Address;

 

    Student(int id, String Username, String Email, String Full_name, int Phone, String Address) {
        this.id = id;
        this.Username = Username;
        this.Email = Email;
        this.Full_name = Full_name;
        this.Phone = Phone;
        this.Address = Address;
        
    }

    Student() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getFull_name() {
        return Full_name;
    }

    public void setFull_name(String Full_name) {
        this.Full_name = Full_name;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    public void giveInformation(){
        RoomBook rb=new RoomBook();
        rb.showInformation();
        
    }
    
    public void payment(){
        RoomBook rb1=new RoomBook();
        rb1.showInformation();
    }

    
}
