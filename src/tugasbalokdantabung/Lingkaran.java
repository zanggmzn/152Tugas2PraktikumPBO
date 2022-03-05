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
//induk dari tabung
public class Lingkaran implements MenghitungBidang {
    int jari;

    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }
    
    public Lingkaran(int jari) {
        this.jari = jari;
    }
    
    @Override
    public float luas() {
        return (float) (Math.PI*jari*jari);
    }

    @Override
    public float keliling() {
        return (float) (2*Math.PI*jari);
    }
    
}
