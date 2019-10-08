<<<<<<< HEAD
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
public class Pelanggan1841720189Rhea {
    private String user;
    private PS1841720189Rhea ps;
    private Server1841720189Rhea server;
    private int jam;

    public void setUser(String user){
    this.user = user;
    }
    public String getUser(){
    return user;
    }
    public void setPs(PS1841720189Rhea ps){
    this.ps = ps;
    }
    public PS1841720189Rhea getPs(){
    return ps;
    }
    public void setServer(Server1841720189Rhea server){
    this.server = server;
    }
    public Server1841720189Rhea getServer(){
    return server;
    }
    public void setJam(int jam){
    this.jam = jam;
    }
    public int getJam(){
    return jam;
    }
    public int hitungTotalRentalPs(){
   
    return ps.hitungBayarRentalPs(jam) ;
    }
    public void info(){
    System.out.println("Nama User : " + user);
    System.out.println("Jumlah Jam Rental : " + jam + "Jam");
   }

}
=======
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
public class Pelanggan1841720189Rhea {
    private String user;
    private PS1841720189Rhea ps;
    private Server1841720189Rhea server;
    private int jam;

    public void setUser(String user){
    this.user = user;
    }
    public String getUser(){
    return user;
    }
    public void setPs(PS1841720189Rhea ps){
    this.ps = ps;
    }
    public PS1841720189Rhea getPs(){
    return ps;
    }
    public void setServer(Server1841720189Rhea server){
    this.server = server;
    }
    public Server1841720189Rhea getServer(){
    return server;
    }
    public void setJam(int jam){
    this.jam = jam;
    }
    public int getJam(){
    return jam;
    }
    public int hitungTotalRentalPs(){
   
    return ps.hitungBayarRentalPs(jam) ;
    }
    public void info(){
    System.out.println("Nama User : " + user);
    System.out.println("Jumlah Jam Rental : " + jam + "Jam");
   }

}
>>>>>>> e6f490339cdcfb93b8afb99123306c795de842a0
