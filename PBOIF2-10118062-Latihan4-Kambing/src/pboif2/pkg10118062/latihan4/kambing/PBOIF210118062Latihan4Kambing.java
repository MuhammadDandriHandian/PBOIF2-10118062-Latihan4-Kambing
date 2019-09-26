/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan4.kambing;

/**
 *
 * @author 
 * Nama     : Muhammad Dandri Handian
 * Kelas    : IF-2
 * NIM      : 10118062
 */
public class PBOIF210118062Latihan4Kambing {
    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        
        System.out.println("Jumlah Kambing setelah ditambah: " +
                         jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210118062Latihan4Kambing kambingJantan = new PBOIF210118062Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
