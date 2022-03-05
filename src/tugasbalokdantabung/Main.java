/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbalokdantabung;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM BALOK DAN TABUNG  |");
        System.out.println("+---------------------------+");
        System.out.println("         Menu Utama          ");
        System.out.println("+---------------------------+");
        int inLoop;
        do{
            System.out.println("\nOpsi");
            System.out.println("----");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("3. Exit");
            System.out.printf("Pilih Opsi: ");
            int Option = in.nextInt();
            switch(Option){
                case 1:
                    do{
                        System.out.print("\n");
                        System.out.printf("Input Panjang : ");
                        int panjang = in.nextInt();
                        System.out.printf("Input Lebar   : ");
                        int lebar = in.nextInt();
                        System.out.printf("Input Tinggi  : ");
                        int tinggi = in.nextInt();
                        Balok balok = new Balok(tinggi, panjang, lebar);
                        System.out.println("Luas Persegi Panjang     : " + balok.luas());
                        System.out.println("Keliling Persegi Panjang : " + balok.keliling());
                        System.out.println("Volume Balok             : " + balok.volume());
                        System.out.println("Luas Permukaan Balok     : " + balok.luasPermukaan());
                        System.out.print("Ulangi Menu 1 (Ya:1 || Tidak: 0)? ");
                        inLoop = in.nextInt();
                    }while(inLoop!=0);
                    break;
                case 2:
                    do{
                        System.out.print("\n");
                        System.out.printf("Input Tinggi   : ");
                        int tinggi = in.nextInt();
                        System.out.printf("Input Jari-jari: ");
                        int jari = in.nextInt();
                        Tabung tabung = new Tabung(tinggi, jari);
                        System.out.println("Luas Lingkaran        : " + tabung.luas());
                        System.out.println("Keliling Lingkaran    : " + tabung.keliling());
                        System.out.println("Volume Tabung         : " + tabung.volume());
                        System.out.println("Luas Permukaan Tabung : " + tabung.luasPermukaan());
                        System.out.print("Ulangi Menu 2 (Ya:1 || Tidak: 0)? ");
                        inLoop = in.nextInt();
                    }while(inLoop!=0);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
            }
        }while(true);
    }
}
