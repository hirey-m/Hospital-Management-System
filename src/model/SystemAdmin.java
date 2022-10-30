/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.Person;
import model.Person.UserRole;

/**
 *
 * @author manavhirey
 */
public class SystemAdmin extends Person {
    
    private String adminId;

    public SystemAdmin(String adminId, long ssn, String name, String gender, String dob, long phoneNo, String email, House address, String username, String password, UserRole role) {
        super(ssn, name, gender, dob, phoneNo, email, address, username, password, UserRole.SYS_ADMIN);
        this.adminId = adminId;
    }
    
    public static HospitalDirectory hosDir = new HospitalDirectory();
    public static PersonDirectory personDir = new PersonDirectory();
    public static PatientDirectory patDir = new PatientDirectory();
    public static DoctorDirectory docDir = new DoctorDirectory();
    public static CityDirectory cityDir = new CityDirectory();
    public static EncounterHistory encHistRef = new EncounterHistory();
    
    static{
        personDir.getPersonList().add(new SystemAdmin("193290210", 193289821L, "Admin", "MALE", "12/01/2001", 178389210L, "admin@gmail.com", new House("Park Drive",21,02215L), "admin", "admin",UserRole.SYS_ADMIN));
        Patient p1 = new Patient(732838L, "manavhirey", "MALE", "12/01/2001", 178389210L, "manav@gmail.com", new House("Park Drive",21,02215L), "manav", "manav",UserRole.PATIENT);
        Doctor d1 = new Doctor("832782389", "Lilavati", "orthodontist", 873893932L, "People", "OTHER", "29/03/2001", 98278348993L, "doctor@lilavati", new House("Park Drive",21,02215L), "doctorsRox", "doctor", SystemAdmin.UserRole.DOCTOR);
        patDir.getPatientList().add(p1);
        personDir.getPersonList().add(p1);
        docDir.getDoctorList().add(d1);
        personDir.getPersonList().add(d1);
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public static HospitalDirectory getHosDir() {
        return hosDir;
    }

    public static void setHosDir(HospitalDirectory hosDir) {
        SystemAdmin.hosDir = hosDir;
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

    public static EncounterHistory getEncHistRef() {
        return encHistRef;
    }

    public static void setEncHistRef(EncounterHistory encHistRef) {
        SystemAdmin.encHistRef = encHistRef;
    }
   
    
}
