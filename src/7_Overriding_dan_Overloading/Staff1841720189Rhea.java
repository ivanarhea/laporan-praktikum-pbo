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
public class Staff1841720189Rhea extends Karyawan1841720189Rhea {
    private int mLembur;
    private double mGajiLembur;

    public void setmLemburRhea(int mLembur) {
        this.mLembur = mLembur;
    }

    public int getmLemburRhea() {
        return mLembur;
    }

    public void setmGajiLemburRhea(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }

    public double getmGajiLemburRhea() {
        return mGajiLembur;
    }

    double getmGajiRhea(int lembur, double gajiLembur) {
        return super.getmGajiRhea() + lembur * gajiLembur;
    }

    @Override
    public double getmGajiRhea() {
        return super.getmGajiRhea() + mLembur * mGajiLembur;
    }

    void lihatInfoEla() {
        System.out.println("NIP : "+this.getmNipRhea());
        System.out.println("Nama : "+this.getmNamaRhea());
        System.out.println("Golongan : "+this.getmGolonganRhea());
        System.out.println("Jml Lembur : "+this.getmLemburRhea());
        System.out.printf("Gaji Lembur :%.0f\n",this.getmGajiLemburRhea());
        System.out.printf("Gaji :%.0f\n",this.getmGajiRhea());
    }
}
