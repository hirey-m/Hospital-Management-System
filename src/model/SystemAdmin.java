/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author manavhirey
 */
public class SystemAdmin extends Person {
    
    private String adminId;
    
    public SystemAdmin(long ssn, String name, String dob, long phoneNo, String email, House address, String username, String password, String adminId) {
        super(ssn, name, dob, phoneNo, email, address, username, password);
        this.setRole(UserRole.SYS_ADMIN);
        this.adminId = adminId;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
    
    
    
}
