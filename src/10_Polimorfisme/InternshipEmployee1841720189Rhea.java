/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rhea Ivana
 */
public class InternshipEmployee1841720189Rhea extends Employee1841720189Rhea {
    private int length;

    public InternshipEmployee1841720189Rhea(String name, int length) {
        this.length = length;
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    @Override
    public String getEmployeeInfoRhea() {
        String info = super.getEmployeeInfoRhea() + "\n";
        info += "Registered as intership employee for " + length + " month/s\n";
        return info;
    } 
}
