/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Laporan;

/**
 *
 * @author ASUS TUF
 */
public class V1 extends StatusMember{
    public String kode;
    double diskon;
    
    public V1(){
        super();
        this.kode = "V1";
    }
    
    public double hasil(){
        return diskon;
    }
    @Override
    double cekMember(String input){
        if(input.compareTo(kode) == 0){
            diskon = 0.2;
        }else{
            diskon = 0;
        }
        return diskon;
    }
    @Override
    public double hitungHarga(){
        total = (harga * jumlah) * hari;
        diskon = total * diskon;
        total = total - diskon;
        return total;
    }
    
    @Override
    public String tampilkanMember(){
        return "Diskon 20%";
    }
}
