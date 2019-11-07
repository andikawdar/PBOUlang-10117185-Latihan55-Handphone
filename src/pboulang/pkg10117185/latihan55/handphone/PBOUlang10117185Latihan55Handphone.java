/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan55.handphone;

/**
 *
 * @author user
 * Nama     : Andhyka Widariyanto
 * NIM      : 10117185
 * Kelas    : PBO-Ulang
 * Tugas    : Latihan 55 - Handphone
 */
public class PBOUlang10117185Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android an = new Android("Samsung", "Android", "Grand", 3000000);
        BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        
        an.setKeyStore("234ibfd3840fo");
        an.displayProduct();
        System.out.println("Android key Store : "+an.getKeyStore());
        System.out.println("");
        
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN : "+bb.getPinBB());
        System.out.println("");
        
        wp.setWpKeyStore("UUUQIJWORJ");
        wp.displayProduct();
        System.out.println("Wp key Store : "+wp.getWpKeyStore());
        System.out.println("");
  
    }
    
}
