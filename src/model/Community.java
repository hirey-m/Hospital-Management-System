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
public class Community {
    
    private ArrayList<House> county;
    
    public Community(){
        this.county = new ArrayList<House>();
    }

    public ArrayList<House> getCounty() {
        return county;
    }

    public void setCounty(ArrayList<House> county) {
        this.county = county;
    }
    
    
}
