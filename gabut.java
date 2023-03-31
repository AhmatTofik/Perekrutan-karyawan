
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WINDOWS 10
 */
public class gabut {
    public static void main(String[] args) { 
      double akademik,ketrampilan,psikologi,rataRata;
      Scanner input = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("===Perekrutan Karyawan===");
        System.out.println("=========================");

        System.out.print("Masukkan nilai Tes Akademik: ");
        akademik = input.nextDouble();

        System.out.print("Masukkan nilai Tes Ketrampilan: ");
        ketrampilan = input.nextDouble();

        System.out.print("Masukkan nilai Tes Psikologi: ");
        psikologi = input.nextDouble();
      rataRata = (akademik + ketrampilan + psikologi) / 3;
         System.out.println("=========================");
      if (rataRata >= 75) {
         if (akademik > ketrampilan && akademik > psikologi) {
            System.out.println("Diterima ditempatkan di bagian administrasi");
        } else if (ketrampilan > akademik && ketrampilan > psikologi) {
            System.out.println("Diterima ditempatkan di bagian Produksi");
        } else {
            System.out.println("Diterima ditempatkan di bagian Pemasaran");
        }
        } else {
            System.out.println("Maaf anda belum diterima");
        }
         System.out.println("=========================");
       }}
