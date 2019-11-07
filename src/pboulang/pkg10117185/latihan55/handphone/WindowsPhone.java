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
public class WindowsPhone extends Handphone {
    //Atribute
    String wpKeyStore;
    
    //Construction
    WindowsPhone(String parManufacture, String parOperatingSystem, String parModel, int parHarga){
       super(parManufacture, parOperatingSystem, parModel, parHarga);
    }
    
    //Function
    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String parWpKeyStore) {
        wpKeyStore = parWpKeyStore;
    }
    
}
