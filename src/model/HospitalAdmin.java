/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author manavhirey
 */
public class HospitalAdmin extends Person{

    public HospitalAdmin(long ssn, String name, String gender, String dob, long phoneNo, String email, House address, String username, String password, UserRole role) {
        super(ssn, name, gender, dob, phoneNo, email, address, username, password, SystemAdmin.UserRole.HOS_ADMIN);
    }
    
}
