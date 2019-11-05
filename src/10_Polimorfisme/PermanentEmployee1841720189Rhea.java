/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rhea Ivana
 */
public class PermanentEmployee1841720189Rhea extends Employee1841720189Rhea implements Payable1841720189Rhea{
    private int salary;

    public PermanentEmployee1841720189Rhea(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmount() {
        return (int) (salary + 0.05 * salary);
    }
    
    @Override
    public String getEmployeeInfoRhea() {
        String info = super.getEmployeeInfoRhea() + "\n";
        info += "Registered as permanent employee with salary " + salary + "\n";
        return info;
    }
}
