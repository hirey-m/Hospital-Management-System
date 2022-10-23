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
public class EncounterHistory {
    
    private ArrayList<Encounter> past;
    
    public EncounterHistory(){
        this.past = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getPast() {
        return past;
    }

    public void setPast(ArrayList<Encounter> past) {
        this.past = past;
    }
    
}
