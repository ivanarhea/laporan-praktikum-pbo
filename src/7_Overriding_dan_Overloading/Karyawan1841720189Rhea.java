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
public class Karyawan1841720189Rhea {
    private String mNama;
    private String mNip;
    private String mGolongan;
    private double mGaji;

    public void setmNamaRhea(String mNama) {
        this.mNama = mNama;
    }

    public void setmNipRhea(String mNip) {
        this.mNip = mNip;
    }

    public void setmGolonganRhea(String mGolongan) {
        this.mGolongan = mGolongan;

        switch (mGolongan.charAt(0)) {
            case '1':
                this.mGaji = 5000000;
                break;
            case '2':
                this.mGaji = 3000000;
                break;
            case '3':
                this.mGaji = 2000000;
                break;
            case '4':
                this.mGaji = 1000000;
                break;
            case '5':
                this.mGaji = 750000;
                break;
        }
    }

    public void setmGajiRhea(double mGaji) {
        this.mGaji = mGaji;
    }

    public String getmNamaRhea() {
        return mNama;
    }

    public String getmNipRhea() {
        return mNip;
    }

    public String getmGolonganRhea() {
        return mGolongan;
    }

    public double getmGajiRhea() {
        return mGaji;
    }
}
