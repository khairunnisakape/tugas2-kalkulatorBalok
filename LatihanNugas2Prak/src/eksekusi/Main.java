
package eksekusi;
import java.awt.*; //buat bikin GUI->Button
import java.awt.event.*; //deklarasi class event->ActionListener
import javax.swing.*;// tampilan pake swing, jframe
import bidang.*;
import ruang.*;

public class Main {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
    }
}

class Kalkulator extends JFrame implements ActionListener{
    private JLabel lJudul;
    private JLabel lPanjang, lLebar, lTinggi, lLuas, lKel, lLuasP, lVol;
    private JTextField tPanjang, tLebar, tTinggi;
    private JButton bHitung, bReset;
    
    public Kalkulator(){
        super("Praktikum PBO - Tugas 2");
        lJudul = new JLabel("Kalkulator Balok");
        lPanjang = new JLabel("Panjang");
        lLebar = new JLabel("Lebar");
        lTinggi = new JLabel("Tinggi");
        
        tPanjang = new JTextField();        
        tLebar = new JTextField();
        tTinggi = new JTextField();
        
        lLuas = new JLabel();
        lKel = new JLabel();
        lLuasP = new JLabel();
        lVol = new JLabel();
        
        bHitung = new JButton("Hitung");
        bReset = new JButton("Reset");
        
        add(lJudul);
        add(lPanjang);
        add(lLebar);
        add(lTinggi);
        add(lLuas);
        add(lKel);
        add(lLuasP);
        add(lVol);
        add(tPanjang);
        add(tLebar);
        add(tTinggi);
        add(bHitung);
        add(bReset);
        
        //setBounds(m,n,o,p)
        // m = posisi x, n = posisi y
        // o = panjang komponen, p = tinggi komponen
        
        lJudul.setBounds(200, 50,100,30);
        lPanjang.setBounds(20, 80, 70, 20);
        lLebar.setBounds(20, 100, 70, 20);
        lTinggi.setBounds(20, 120, 70, 20);
        tPanjang.setBounds(100, 80, 70, 20);
        tLebar.setBounds(100, 100, 70, 20);
        tTinggi.setBounds(100, 120, 70, 20);
        lKel.setBounds(20, 170, 300, 20);
        lLuas.setBounds(20, 200, 300, 20);
        lLuasP.setBounds(20, 230, 300, 20);
        lVol.setBounds(20, 260, 300, 20);
        bHitung.setBounds(120, 290, 90, 25);
        bReset.setBounds(220, 290, 90, 25);
        
        bHitung.addActionListener(this);
        bReset.addActionListener(this);
        
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bHitung){
            try {
                double p = Double.parseDouble(tPanjang.getText());
                double l = Double.parseDouble(tLebar.getText());
                double t = Double.parseDouble(tTinggi.getText());
                
                PersegiPanjang pp = new PersegiPanjang(p,l);
                Balok bk = new Balok(t, p, l);
                
                lKel.setText(String.format("Keliling Persegi Panjang    : ", pp.kelilingpp));
               lLuas.setText(String.format("Luas Persegi Panjang        : ", pp.luaspp));
              lLuasP.setText(String.format("Luas Permukaan Balok        : ", bk.luaspB));
                lVol.setText(String.format("Volume Balok                : ", bk.volB));
                
            } catch(NumberFormatException error){
                JOptionPane.showMessageDialog(null, "Error! Masukkan Input yang benar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        if(e.getSource() == bReset){
            tPanjang.setText("");
            tLebar.setText("");
            tTinggi.setText("");
            lLuas.setText("");
            lKel.setText("");
            lVol.setText("");
            lLuasP.setText("");
        }    
        }
    }
}