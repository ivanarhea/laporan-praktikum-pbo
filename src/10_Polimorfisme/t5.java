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
public abstract class WalkingZombie1841720189Rhea extends Zombie1841720189Rhea {
    WalkingZombie1841720189Rhea(int health, int level){
        super.health = health;
        super.level = level;
    }
    
    @Override
    public void heal() {
        switch (super.level) {
            case 1:
                super.health =  (super.health + (super.health * 20/100));
                break;
            case 2:
                super.health =  (super.health + (super.health * 30/100));
                break;
            case 3:
                super.health =  (super.health + (super.health * 40/100));
                break;
            default:
                break;
        }
    }
    
    @Override
    public void destroyedRhea(){
        super.health = (super.health - (super.health * 20/100));
        if(super.health <= 0){
            super.health = 0;
            System.out.println("Walking Zombie Telah Mati");
        }
    }
    
    @Override
    public String getZombieInfo(){
        String info = "";
        System.out.println("Walking Zombie Data");
        info += "Health = " + super.health+"\n";
        info += "Level = " + super.level+"\n";
        return info;
    }
}
