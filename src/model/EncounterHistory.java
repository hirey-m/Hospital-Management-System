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
    
    private ArrayList<Encounter> pastList;
    
    public EncounterHistory(){
        this.pastList = new ArrayList<>();
    }

    public ArrayList<Encounter> getPastList() {
        return pastList;
    }

    public void setPastList(ArrayList<Encounter> pastList) {
        this.pastList = pastList;
    }
    
}
