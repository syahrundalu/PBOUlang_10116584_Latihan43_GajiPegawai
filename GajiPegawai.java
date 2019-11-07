/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan43_gajipegawai;

import java.util.Scanner;

/**
 *
 * @author syhar
 */
public class GajiPegawai {
    
    public String nama;
    public String alamat;
    public int uangTransport;
    public int uangTunjangan;
    public int gajiPokok;
    public int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        return uangTunjangan + uangTransport + gajiPokok;
    }
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji){
        Scanner scan= new Scanner(System.in);
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("--------------------------");
        System.out.print("Nama Karyawan = ");
        nama = scan.nextLine();
        System.out.print("Alamat = ");
        alamat = scan.nextLine();
        System.out.print("Uang Transport : Rp.");
        uangTransport = scan.nextInt();
        System.out.print("Uang Tunjangan : Rp.");
        uangTunjangan = scan.nextInt();
        System.out.print("Gaji Pokok : Rp.");
        gajiPokok = scan.nextInt();
        System.out.println("Total Gaji : Rp."+totalGaji(uangTunjangan, uangTransport, gajiPokok));
    }
    
}
