/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruang;
import bidang.PersegiPanjang;

public class Balok extends PersegiPanjang implements MenghitungRuang{

    private double tinggi;
    public double luaspB, volB;

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double getTinggi() {
        return tinggi;
    }

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public double luas_perm() {
        luaspB = 2*(super.luaspp+super.getPanjang()*tinggi+super.getLebar()*tinggi);
        return luaspB;
    }

    @Override
    public double volume() {
        volB = super.luaspp*tinggi;
        return volB;
    }
    
}
