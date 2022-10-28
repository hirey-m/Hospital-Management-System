/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author manavhirey
 */
public class SystemAdmin extends Person {
    
    private String adminId;
    
    public SystemAdmin(long ssn, String name, String dob, long phoneNo, String email, String address, String username, String password, String adminId) {
        super(ssn, name, dob, phoneNo, email, address, username, password);
        this.setRole(UserRole.SYS_ADMIN);
        this.adminId = adminId;
    }

    public static PatientDirectory patDir = new PatientDirectory(new ArrayList<Patient>());
    public static DoctorDirectory docDir = new DoctorDirectory(new ArrayList<Doctor>());
    public static CityDirectory cityDir = new CityDirectory(new ArrayList<City>());

    public static PatientDirectory getPatDir() {
        return patDir;
    }

    public static void setPatDir(PatientDirectory patDir) {
        SystemAdmin.patDir = patDir;
    }

    public static DoctorDirectory getDocDir() {
        return docDir;
    }

    public static void setDocDir(DoctorDirectory docDir) {
        SystemAdmin.docDir = docDir;
    }

    public static CityDirectory getCityDir() {
        return cityDir;
    }

    public static void setCityDir(CityDirectory cityDir) {
        SystemAdmin.cityDir = cityDir;
    }
   
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
    
    
    
}
