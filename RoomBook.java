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
public class RoomBook {
    private int id;
    private String Room_No;
    private int Floor;
    private String Room_Type;
    private int Ammount;
    private String Time;

    public RoomBook(int id, String Room_No, int Floor, String Room_Type, int Ammount, String Time) {
        this.id = id;
        this.Room_No = Room_No;
        this.Floor = Floor;
        this.Room_Type = Room_Type;
        this.Ammount = Ammount;
        this.Time = Time;
    }

    RoomBook() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoom_No() {
        return Room_No;
    }

    public void setRoom_No(String Room_No) {
        this.Room_No = Room_No;
    }

    public int getFloor() {
        return Floor;
    }

    public void setFloor(int Floor) {
        this.Floor = Floor;
    }

    public String getRoom_Type() {
        return Room_Type;
    }

    public void setRoom_Type(String Room_Type) {
        this.Room_Type = Room_Type;
    }

    public int getAmmount() {
        return Ammount;
    }

    public void setAmmount(int Ammount) {
        this.Ammount = Ammount;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }
    
    public void showInformation(){
      Student s=new Student();
      Admin a=new Admin();
      s.giveInformation();
      s.payment();
      a.checkInformation();
    }
}
