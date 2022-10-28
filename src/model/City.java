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
    private ArrayList<Community> city;

    public City(ArrayList<Community> city) {
        this.city = city;
    }

    public ArrayList<Community> getCity() {
        return city;
    }

    public void setCity(ArrayList<Community> city) {
        this.city = city;
    }
    
}
