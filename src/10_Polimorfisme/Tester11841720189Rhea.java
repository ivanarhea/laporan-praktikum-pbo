/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rhea Ivana
 */
public class Tester11841720189Rhea {
    public static void main(String[] args) {
        PermanentEmployee1841720189Rhea pEmp = new PermanentEmployee1841720189Rhea ("Dedik", 500);
        InternshipEmployee1841720189Rhea iEmp = new InternshipEmployee1841720189Rhea ("Sunarto", 5);
        ElectricityBill1841720189Rhea eBill = new ElectricityBill1841720189Rhea (5, "A-1");
        Employee1841720189Rhea e;
        Payable1841720189Rhea p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
}
