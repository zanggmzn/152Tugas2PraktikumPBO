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
public class Tabung extends Lingkaran implements MenghitungRuang {
    private int tinggi;

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public Tabung(int tinggi, int jari) {
        super(jari);
        this.tinggi = tinggi;
    }
    
    @Override
    public float luasPermukaan() {
        return (float) (2*Math.PI*jari*(jari+tinggi));
    }

    @Override
    public float volume() {
         return (float) (this.luas()*tinggi);
    }
    
}
