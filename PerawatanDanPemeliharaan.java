/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Laporan;

/**
 *
 * @author ASUS TUF
 */
public class PerawatanDanPemeliharaan extends Pemesanan{
    String pemeliharaan, perbaikan;
    
    public PerawatanDanPemeliharaan(){
        this.pemeliharaan = "Pengecekan";
    }
    
    void dataPemeliharaan(String Pemeliharaan){
        this.pemeliharaan = Pemeliharaan;
    }
    void dataPerbaikan(String Perbaikan){
        this.perbaikan = Perbaikan;
    }
    
    String cetakPemeliharaan(){
        return pemeliharaan;
    }
    String cetakPerbaikan(){
        return perbaikan;
    }
    
}
