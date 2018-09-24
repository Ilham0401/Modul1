/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author WINDOWS 10
 */
public class BiodataDiri {
    public static String nama, tempat_lahir ,kelamin, alamat, motto_hidup, tgl_lahir;
    public static int nis;
    
        
    public static void main(String[] args) {
        isi();
        tampil();
    }
    static void isi(){
       nama = (JOptionPane.showInputDialog("Nama            :   "));
       nis = Integer.parseInt(JOptionPane.showInputDialog("NIS:"));
       tempat_lahir = (JOptionPane.showInputDialog("Tempat Lahir:"));
       tgl_lahir = (JOptionPane.showInputDialog("Tanggal Lahir:"));
       kelamin = (JOptionPane.showInputDialog("Jenis Kelamin:"));
       alamat = (JOptionPane.showInputDialog("Alamat di Malang:"));
       motto_hidup = (JOptionPane.showInputDialog("Motto Hidup:"));
    }
        static void tampil(){
            
        System.out.println();
        System.out.println("============================");
        System.out.println("        BIODATA DIRI        ");
        System.out.println("============================");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Nama            :   "+nama);
        System.out.println("NIS             :   "+nis);
        System.out.println("Tempat Lahir    :   "+tempat_lahir);
        System.out.println("Tanggal Lahir   :   "+tgl_lahir);
        System.out.println("Jenis Kelamin   :   "+kelamin);
        System.out.println("Alamat di Malang:   "+alamat);
        System.out.println("Motto Hidup     :   "+motto_hidup);
    }   
    
}
