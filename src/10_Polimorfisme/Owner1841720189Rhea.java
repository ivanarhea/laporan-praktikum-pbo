/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rhea Ivana
 */
public class Owner1841720189Rhea {
    public void pay(Payable1841720189Rhea p) {
        System.out.println("Total Payment = " + p.getPaymentAmount());
        if(p instanceof ElectricityBill1841720189Rhea) {
            ElectricityBill1841720189Rhea eb = (ElectricityBill1841720189Rhea) p;
            System.out.println("" + eb.getBillInfo());
        } 
        else if (p instanceof PermanentEmployee1841720189Rhea) {
            PermanentEmployee1841720189Rhea pe = (PermanentEmployee1841720189Rhea) p;
            pe.getEmployeeInfoRhea();
            System.out.println("" + pe.getEmployeeInfoRhea());
        }
    }
    
    public void showEmployess(Employee1841720189Rhea e) {
        System.out.println("" + e.getEmployeeInfoRhea());
        if(e instanceof PermanentEmployee1841720189Rhea)
            System.out.println("You have to pay her/him monthly!!!");
        else
            System.out.println("No need to pay him/her : ");
    }
}
