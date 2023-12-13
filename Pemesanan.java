/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Laporan;

/**
 *
 * @author ASUS TUF
 */
public class Pemesanan extends abstractClass {
    //Sebagai Atribut yang dimiliki oleh PersewaanPeralatanOlahraga
    double jumlah,harga,total,hari;
    String nama,jenisalat,jangkapenggunaan,bentuk,ukuran,bahan,atribut,A;
    
    //constructor
    public Pemesanan(){
        this.bentuk = "Normal(Klasik)";
        this.ukuran = "Normal";
        this.harga = harga;
    }
    
    //Merupakan Method yang menggunakan void
    void dataNama(String Nama){
        this.nama = Nama;
    }
    void dataJenisAlat(String JenisAlat){
        this.jenisalat = JenisAlat;
    }
    void dataJangkaPenggunaan(String JangkaPenggunaan){
        this.jangkapenggunaan = JangkaPenggunaan;
    } 
    void dataBentuk(String Bentuk){
        this.bentuk = Bentuk;
    }
    void dataUkuran(String Ukuran){
        this.ukuran = Ukuran;
    }
    void dataBahan(String Bahan){
        this.bahan = Bahan;
    }
    
    public String dataAtribut(String Atribut){
        return atribut = Atribut;
    }
    public String dataAtribut(String Bentuk, String Ukuran, String Bahan){
        return atribut = Bentuk + "/" + Ukuran + "/" + Bahan;
    }
    //Merupakan Method yang Non-void
    String cetakNama(){
        return nama;
    }
    public double cetakJumlah(){
        return jumlah;
    }
    String cetakJenisAlat(){
        return jenisalat;
    }
    String cetakJangkaPenggunaan(){
        return jangkapenggunaan;
    }
    String cetakBentuk(){
        return bentuk;
    }
    String cetakUkuran(){
        return ukuran;
    }
    String cetakBahan(){
        return bahan;
    }
    //metode
    public double hitungHarga(){
        return 0;
    }

    @Override
    public String Status() {
        return "Data Tidak Tersedia";
    }
    public String Status(String A) {
        return "Data Tersedia";
    }
    
    boolean cek(int i){
        return true;
    }   

}
