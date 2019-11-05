/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rhea Ivana
 */
public class Tester41841720189Rhea {
    public static void main(String[] args) {
        Owner1841720189Rhea ow = new Owner1841720189Rhea();
        ElectricityBill1841720189Rhea eBill = new ElectricityBill1841720189Rhea(5, "R-1");
        ow.pay(eBill);
        System.out.println("-------------------------------");
        
        PermanentEmployee1841720189Rhea  pEmp = new PermanentEmployee1841720189Rhea ("Dedik", 500);
        ow.pay(eBill);
        System.out.println("-------------------------------");
        
        InternshipEmployee1841720189Rhea iEmp = new InternshipEmployee1841720189Rhea("Sunarto", 5);
        ow.showEmployess(iEmp);
        System.out.println("-------------------------------");
        ow.showEmployess(iEmp);
    }
}
