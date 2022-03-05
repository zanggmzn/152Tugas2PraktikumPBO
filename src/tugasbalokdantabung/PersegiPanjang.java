/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbalokdantabung;

/**
 *
 * @author asus
 */
//induk balok
public class PersegiPanjang implements MenghitungBidang {
    int panjang;
    int lebar;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public float luas() {
        return panjang*lebar;
    }

    @Override
    public float keliling() {
        return 2*(panjang+lebar);
    }
    
}
