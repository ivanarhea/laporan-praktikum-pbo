/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1;

/**
 *
 * @author Rhea Ivana
 */
public class Manager1841720189Rhea extends Karyawan1841720189Rhea{
    private double mTunjangan;
    private String mBagian;
    private Staff1841720189Rhea st[];

    public void setmTunjanganRhea(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public double getmTunjanganRhea() {
        return mTunjangan;
    }

    public void setmBagianRhea(String mBagian) {
        this.mBagian = mBagian;
    }

    public String getmBagianRhea() {
        return mBagian;
    }

    public void setStRhea(Staff1841720189Rhea[] st) {
        this.st = st;
    }

    void viewStaff1841720189Rhea() {
        int i;
        System.out.println("------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfoRhea();
        }
        System.out.println("------------");
    }

    void lihatInfoRhea() {
        System.out.println("Manager : " + this.getmBagianRhea());
        System.out.println("NIP : " + this.getmNipRhea());
        System.out.println("Nama : " + this.getmNamaRhea());
        System.out.println("Golongan : " + this.getmGolonganRhea());
        System.out.printf("Tunjangan :%.0f\n", this.getmTunjanganRhea());
        System.out.printf("Gaji : %.0f\n", this.getmGajiRhea());
        System.out.println("Bagian : " + this.getmBagianRhea());
        this.viewStaff1841720189Rhea();
    }

    double getGajiRhea() {
        return super.getmGajiRhea() + mTunjangan;
    }
}
