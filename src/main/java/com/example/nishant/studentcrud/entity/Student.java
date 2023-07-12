package com.example.nishant.studentcrud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "STUDENTDETAILS")
public class Student {

    //define columns

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String fullName;


    private String gmail;


    private String address;


    private String phone;


    public Student( String fullName, String gmail, String address, String phone) {
        this.fullName = fullName;
        this.gmail = gmail;
        this.address = address;
        this.phone = phone;
    }

    public Student(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
