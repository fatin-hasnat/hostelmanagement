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
public class Admin {
    private int id;
    private String Name;
    private String Email;
    private int  Phone;



    Admin(int id, String Name, String Email, int Phone) {
        this.id = id;
        this.Name = Name;
        this.Email = Email;
        this.Phone = Phone;
    }

    Admin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }
    
    public void checkInformation(){
    RoomBook rb2=new RoomBook();
    rb2.showInformation();
    }

   
    
}
