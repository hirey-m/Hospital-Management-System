/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.Person;

/**
 *
 * @author manavhirey
 */
public class SystemAdmin extends Person {
    
    private String adminId;

    public SystemAdmin(String adminId, long ssn, String name, String gender, String dob, long phoneNo, String email, String address, String username, String password, UserRole role) {
        super(ssn, name, gender, dob, phoneNo, email, address, username, password, UserRole.SYS_ADMIN);
        this.adminId = adminId;
    }

    
  
    
    public static PersonDirectory personDir = new PersonDirectory();
    public static PatientDirectory patDir = new PatientDirectory();
    public static DoctorDirectory docDir = new DoctorDirectory();
    public static CityDirectory cityDir = new CityDirectory();
    public static EncounterHistory encHistRef = new EncounterHistory();
    
   
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public static PersonDirectory getPersonDir() {
        return personDir;
    }

    public static void setPersonDir(PersonDirectory personDir) {
        SystemAdmin.personDir = personDir;
    }

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
}
