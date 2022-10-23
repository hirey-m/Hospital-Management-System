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
    
    private VitalSigns vital;
    private String date;
    private Patient patientName;
    private Doctor doctorName;

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

    public Patient getPatientName() {
        return patientName;
    }

    public void setPatientName(Patient patientName) {
        this.patientName = patientName;
    }

    public Doctor getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(Doctor doctorName) {
        this.doctorName = doctorName;
    }
    
    
}
