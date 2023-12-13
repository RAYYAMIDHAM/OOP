/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Laporan;

/**
 *
 * @author ASUS TUF
 */
public abstract class StatusMember extends Pemesanan {
    public abstract double hitungHarga();
    abstract double cekMember(String input);
    abstract String tampilkanMember();
    
    String member(V1 member){
        return "VIP1";
    }
    
    String member(V2 member){
        return "VIP2";
    }
}
