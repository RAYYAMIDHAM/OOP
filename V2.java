/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Laporan;

/**
 *
 * @author ASUS TUF
 */
public class V2 extends StatusMember{
    public String kode;
    double diskon;
    
    public V2(){
        super();
        this.kode = "V2";
    }
    
    public double hasil(){
        return diskon;
    }
    @Override
    double cekMember(String input){
        if(input.compareTo(kode) == 0){
            diskon = 0.3;
        }else{
            diskon = 0;
        }
        return diskon;
    }
    @Override
    public double hitungHarga(){
        diskon = harga * diskon;
        total = (harga * jumlah) * hari;
        total = total - diskon;
        return total;
    }
    
    @Override
    public String tampilkanMember(){
        return "Diskon 30%";
    }
}
