/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Laporan;

/**
 *
 * @author ASUS TUF
 */
public class Jaminan extends Pemesanan{
    String pemulihan;
    double pengembalian;
    private String kontrak;
    private String input;
    
    public Jaminan(){
        super();
        this.kontrak = "Apabila barang ada yang rusak maka uang jaminan tidak akan dikembalikan";
        this.pemulihan = "Semua total jaminan akan dikembalikan";
    }

    public String getKontrak() {
        return kontrak;
    }

    public void setKontrak(String kontrak) {
        this.kontrak = kontrak;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    double Total(){
        total = harga - pengembalian;
        return total;
    }
    
    void dataKontrak(String Kontrak){
        this.kontrak = Kontrak;
    }
    void dataPemulihan(String Pemulihan){
        this.pemulihan = Pemulihan;
    }
    
    String cetakKontrak(){
        return kontrak;
    }
    String cetakPemulihan(){
        return pemulihan;
    }
    public double cetakPengembalian(){
        return pengembalian = harga;
    }
    public double cetakHarga(){
        return harga;
    }
    
    @Override
    public double hitungHarga(){
        return total = harga - harga;
    }
    
}
