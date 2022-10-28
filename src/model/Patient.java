/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author manavhirey
 */
public class Patient extends Person{
    private int age;
    
    
    public Patient(long ssn, String name, String dob, long phoneNo, String email, String address, String username, String password, int age) {
        super(ssn, name, dob, phoneNo, email, address, username, password);
        this.setRole(UserRole.PATIENT);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
