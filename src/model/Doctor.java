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
    
    public Doctor(long ssn, String name, String dob, long phoneNo, String email, House address, String username, String password,String empId, String dateOfJoining, Hospital nameHospital){
        super(ssn,name,dob,phoneNo,email,address,username,password);
        this.setRole(UserRole.DOCTOR);
        this.empId = empId;
        this.dateOfJoining = dateOfJoining;
        this.nameHospital = nameHospital;
        
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
    
    
}
