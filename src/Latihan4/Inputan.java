/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Inputan {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int a, b;
        System.out.print("Masukkan Nilai a : ");
        a = masukan.nextInt();
        System.out.print("Masukkan Nilai b : ");
        b = masukan.nextInt();
        System.out.println();
        System.out.println("Nilai Variabel yang Ada pada Program : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
