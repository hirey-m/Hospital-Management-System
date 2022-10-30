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
public class CommunityDirectory {
    
    private ArrayList<Community> DirectoryCom;

    public CommunityDirectory() {
        this.DirectoryCom = new ArrayList<>();
    }

    public ArrayList<Community> getDirectoryCom() {
        return DirectoryCom;
    }

    public void setDirectoryCom(ArrayList<Community> DirectoryCom) {
        this.DirectoryCom = DirectoryCom;
    }    
    
}
