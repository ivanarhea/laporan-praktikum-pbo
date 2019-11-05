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
public class MainTugas1841720189Rhea {
    public static void main(String[] args) {
        WalkingZombie1841720189Rhea wz = new WalkingZombie1841720189Rhea(100,1) {};
        JumpingZombie1841720189Rhea jz = new JumpingZombie1841720189Rhea(100,2) {};
        Barrier1841720189Rhea b = new Barrier1841720189Rhea(100);
        Plant1841720189Rhea p = new Plant1841720189Rhea();
        
        System.out.println(""+ wz.getZombieInfo());
        System.out.println(""+ jz.getZombieInfo());
        System.out.println(""+ b.getBarrierInfoRhea());
        System.out.println("-------------------------");
        
        for(int i = 0; i < 4; i++){
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
         
        System.out.println(""+ wz.getZombieInfo());
        System.out.println(""+ jz.getZombieInfo());
        System.out.println(""+ b.getBarrierInfoRhea());
    }
}
    
