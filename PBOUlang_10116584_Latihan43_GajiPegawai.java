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
public class PBOUlang_10116584_Latihan43_GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        GajiPegawai gajiPegawai = new GajiPegawai();
       
        gajiPegawai.tampilData(gajiPegawai.getNama(), gajiPegawai.getAlamat(), gajiPegawai.getUangTunjangan(), gajiPegawai.getUangTransport(), gajiPegawai.getUangTunjangan(), gajiPegawai.getTotalGaji());
    }
    
}
