/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bidang;

/**
 *
 * @author Asus
 */
public class PersegiPanjang implements MenghitungBidang{

    private double panjang, lebar;
    public double kelilingpp, luaspp;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public double getLebar() {
        return lebar;
    }

    @Override
    public double keliling() {
        kelilingpp = 2*(getPanjang()+getLebar());
        return kelilingpp;
    }

    @Override
    public double luas() {
        luaspp = getPanjang()*getLebar();
        return luaspp;
    }
    
}
