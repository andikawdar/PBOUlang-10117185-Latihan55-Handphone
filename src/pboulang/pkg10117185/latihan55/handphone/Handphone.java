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
public class Handphone {
    //Atribute
    String manufacture;
    String operatingSystem;
    String model;
    int harga;
    
    //Construction
    Handphone (String parManufacture, String parOperatingSystem, String parModel, int parHarga){
        manufacture = parManufacture;
        operatingSystem = parOperatingSystem;
        model = parModel;
        harga = parHarga;
    }
    
    //Function
    void displayProduct(){
        System.out.println("Manufacture : "+manufacture);
        System.out.println("Os : "+operatingSystem);
        System.out.println("Model : "+model);
        System.out.println("Harga : "+harga);
    }
}
