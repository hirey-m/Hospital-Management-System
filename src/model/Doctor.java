/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author manavhirey
 */
public class Doctor extends Person{
    
    private String empId;
    private String dateOfJoining;
    private Hospital nameHospital;
    private String specialization;
    
    public Doctor(long ssn, String name, String gender, String dob, long phoneNo, String email, House address, String username, String password,String empId, String dateOfJoining, Hospital nameHospital, UserRole role){
        super(ssn,name,gender,dob,phoneNo,email,address,username,password,role);
        this.setRole(UserRole.DOCTOR);
        this.empId = empId;
        this.dateOfJoining = dateOfJoining;
        this.nameHospital = nameHospital;
        this.specialization = specialization;
        
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Hospital getNameHospital() {
        return nameHospital;
    }

    public void setNameHospital(Hospital nameHospital) {
        this.nameHospital = nameHospital;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    
    
    
}
