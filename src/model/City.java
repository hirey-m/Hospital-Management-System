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
public class City {
    private ArrayList<House> city;
    
    public City(){
        this.city = new ArrayList<Community>();
    }

    public ArrayList<House> getCity() {
        return city;
    }

    public void setCity(ArrayList<House> city) {
        this.city = city;
    }
    
}
