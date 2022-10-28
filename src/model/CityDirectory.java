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
public class CityDirectory {
    
    private ArrayList<City> cityDir;

    public CityDirectory(ArrayList<City> cityDir) {
        this.cityDir = cityDir;
    }

    public ArrayList<City> getCityDir() {
        return cityDir;
    }

    public void setCityDir(ArrayList<City> cityDir) {
        this.cityDir = cityDir;
    }

   
    
    
}
