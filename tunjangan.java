/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getterSetter;

import javax.swing.JOptionPane;

/**
 *
 * @author Harindra
 */
public class tunjangan {

    private String jabatan;
    private int gajiPokok;
    private int tunjangan;
    private int potongan;
    private int gajiBersih;
    private int a;

    public int getA() {
        return a;
    }

    public void setA() {
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "pilih jabatan"
                + "\n1. Direktur \n2. Manajer \n3. HRD"));
        this.a = b;
    }

    public String getJabatan() {
       
        return jabatan;
    }

    public void setJabatan() {
        
        
         int a=getA();
        switch (a) {
            case 1:
                jabatan = "Direktur";
                break;
            case 2:
                jabatan = "Manajer";
                break;
            case 3:
                jabatan = "HRD"; 
                break;
            default:
                break;
        }
       this.jabatan = jabatan;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan() {
        
        tunjangan = Integer.parseInt(JOptionPane.showInputDialog(null, "Berapa lama anda bekerja (tahun)"));
        if (tunjangan <= 3) {
            tunjangan = 400000;
        } else if (tunjangan <= 6) {
            tunjangan = 800000;
        } else if (tunjangan <= 10) {
            tunjangan = 1200000;
        }else {
            tunjangan = 1800000;
        }
        this.tunjangan = tunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getPotongan() {
        return potongan;
    }

    public void setPotongan(int potongan) {
        this.potongan = potongan;
    }

    public int getGajiBersih() {
        return gajiBersih;
    }

    public void setGajiBersih() {
        this.gajiBersih = gajiBersih;
    }

    public void menghitung() {
        int c = getA();
        if (c== 1) {
            gajiPokok = 20000000;
            potongan = Integer.parseInt(JOptionPane.showInputDialog(null, "Potongan anda"));
            gajiBersih = gajiPokok + tunjangan - potongan;
        }
        if (c == 2) {
            gajiPokok = 10000000;
            potongan = Integer.parseInt(JOptionPane.showInputDialog(null, "Potongan anda"));
            gajiBersih = gajiPokok + tunjangan - potongan;
        }
        if (c == 3) {
            gajiPokok = 6000000;
            potongan = Integer.parseInt(JOptionPane.showInputDialog(null, "Potongan anda"));
            gajiBersih = gajiPokok + tunjangan - potongan;
        }
    }
    public void akhir(){
        JOptionPane.showMessageDialog(null, "Jabatan anda : "+getJabatan()+"\nGaji Pokok : "+gajiPokok+"\nTunjangan : "+getTunjangan()+"\nPotongan : "+potongan+"\n\nGaji Bersih : "+gajiBersih);
    }
}
