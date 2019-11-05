/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Rhea Ivana
 */
public class Barrier1841720189Rhea implements Destroyable1841720189Rhea {
    private int strength;
    
    Barrier1841720189Rhea(int strength){
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    @Override
    public void destroyedRhea(){
        strength = (int) (strength - (strength * 0.1));
        if(strength <= 0){
            System.out.println("Barrier Hancur!!");
        }
    }
    
    public String getBarrierInfoRhea(){
        String info = "";
        info += "Barrier Strength = " + strength;
        return info;
    }

}
