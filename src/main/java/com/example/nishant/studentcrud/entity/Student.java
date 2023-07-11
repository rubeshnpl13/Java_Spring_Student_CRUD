package com.example.nishant.studentcrud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_details")
public class Student {

    //define columns
    @Id
    @Column(name="studentID")
    private int id;

    @Column(name="fullName")
    private String fullName;

    @Column(name="gmail")
    private String gmail;

    @Column(name="address")
    private String address;

    @Column(name = "phone")
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", gmail='" + gmail + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
