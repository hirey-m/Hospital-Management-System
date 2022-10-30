/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author manavhirey
 */
public class Encounter {
    
    private String appointmentID;
    private VitalSigns vital;
    private String date;
    private String time;
    private Person personName;
    private Doctor doctorName;

    public Encounter(String appointmentID, VitalSigns vital, String date, String time,Person personName, Doctor doctorName) {
        this.appointmentID = appointmentID;
        this.vital = vital;
        this.date = date;
        this.time = time;
        this.personName = personName;
        this.doctorName = doctorName;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public VitalSigns getVital() {
        return vital;
    }

    public void setVital(VitalSigns vital) {
        this.vital = vital;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    

    public Person getPersonName() {
        return personName;
    }

    public void setPersonName(Person personName) {
        this.personName = personName;
    }

    public Doctor getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(Doctor doctorName) {
        this.doctorName = doctorName;
    }
    
    
}
