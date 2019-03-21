/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htl.mihalic.firstmavenproject;

/**
 *
 * @author Dominik
 */
public class Anlage {
    private double anschaffungswert;
    private int nutzungsdauer;
    private double buchwert;

    public Anlage(double anschaffungswert, int nutzungsdauer) {
        this.anschaffungswert = anschaffungswert;
        this.nutzungsdauer = nutzungsdauer;
    }
    
    public double jahresAfa(){
        return anschaffungswert / nutzungsdauer;
    }
    
    public void updateBuchwert(int jahreGenutzt){        
        buchwert += jahresAfa() * jahreGenutzt;
        if(buchwert >= anschaffungswert){
            buchwert = 1;
        }
    }

    public double getBuchwert() {
        return buchwert;
    }
    
    
}
