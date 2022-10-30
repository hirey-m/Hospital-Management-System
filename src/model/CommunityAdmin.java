/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author manavhirey
 */
public class CommunityAdmin extends Person {
    private String adminId;
    private String dateOfJoining;
    
    public CommunityAdmin(long ssn, String name, String gender, String dob, long phoneNo, String email, House address, String username, String password, String adminId, String dateOfJoining, UserRole role) {
        super(ssn, name,gender, dob, phoneNo, email, address, username, password,role);
        this.setRole(UserRole.COM_ADMIN);
        this.adminId = adminId;
        this.dateOfJoining = dateOfJoining;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
    
}
