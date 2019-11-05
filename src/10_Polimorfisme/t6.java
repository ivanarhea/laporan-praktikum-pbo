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

abstract class Zombie1841720189Rhea implements Destroyable1841720189Rhea {
    protected int health;
    protected int level;
    
    abstract void heal();
    
    @Override
    abstract public void destroyedRhea();
    
    public String getZombieInfo(){
        String info = "";
        info += "Health = " + health;
        info += "Level = " + level;
        return info;
    }
}
