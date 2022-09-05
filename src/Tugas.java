/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author MOKLET GAMING
 */
public class Tugas {
    public static void main(String[] args) {
        int tiket, harga, total, orang;
        Scanner input = new Scanner(System.in);
        boolean pilih = true;
        System.out.println("""
                           PEMBELIAN TIKET DBL!
                           ------------------------------------------""");
        while (pilih == true){
        String sekolah;
        System.out.println("""
                           Anda dari sekolah mana?
                           - SMK Telkom Malang
                           - MAN 2 Kota Malang""");
        sekolah = input.nextLine();
       
        switch (sekolah) {
            case "SMK Telkom Malang":
                pilih = false;
                System.out.println("Anda membeli tiket untuk SMK Telkom Malang");
                break;
            case "MAN 2 Kota Malang":
                pilih = false;
                System.out.println("Anda membeli tiket untuk MAN 2 Kota Malang");
                break;
            default:
                System.out.println(sekolah+" Tidak ada dalam pilihan!\n");   
                break;  
        }}
                harga = 15000;
                System.out.println("-----------------------------------------------------------");
                System.out.println("\nBerikut daftar bangku yang dapat dipesan");
                System.out.println("\n|     Lapangan Basket    |\n");
                System.out.println("|_01_|_02_|_03_|_04_|_05_|\n|_06_|_07_|_08_|_09_|_10_|\n|_11_|_12_|_13_|_14_|_15_|\n|_16_|_17_|_18_|_19_|_20_|");
                System.out.println("\nHarga tiket adalah 15000/orang");
                

                                
                boolean again=true;
                
                while (again == true){
                boolean ulang = true;
                while (ulang == true) {
                int modal = 0;
                
                System.out.println("Masukkan uang anda!");
                modal = input.nextInt();
                if (modal>=harga){
                    int sisa=modal-harga;
                    System.out.println("Kembalian: "+sisa);
                    ulang = false;
                    System.out.println("Pilih bangku yang ingin dipesan!");
                }else {
                    System.out.println("Uang anda kurang!");
                }
                }

                
                int tempat;
                System.out.println("Masukkan bangku yang ingin anda pesan:");
                tempat = input.nextInt();
                
                switch (tempat) {
                case 1:
                    System.out.println("Anda memesan tiket pada bangku 1");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|Anda|_02_|_03_|_04_|_05_|\n|_06_|_07_|_08_|_09_|_10_|\n|_11_|_12_|_13_|_14_|_15_|\n|_16_|_17_|_18_|_19_|_20_|");
                    break;
                case 2:
                    System.out.println("Anda memesan tiket pada bangku 2");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|Anda|_03_|_04_|_05_|\n|_06_|_07_|_08_|_09_|_10_|\n|_11_|_12_|_13_|_14_|_15_|\n|_16_|_17_|_18_|_19_|_20_|");
                    break;
                case 3:
                    System.out.println("Anda memesan tiket pada bangku 3");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|_02_|Anda|_04_|_05_|\n|_06_|_07_|_08_|_09_|_10_|\n|_11_|_12_|_13_|_14_|_15_|\n|_16_|_17_|_18_|_19_|_20_|");
                    break;
                case 4:
                    System.out.println("Anda memesan tiket pada bangku 4");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|_02_|_03_|Anda|_05_|\n|_06_|_07_|_08_|_09_|_10_|\n|_11_|_12_|_13_|_14_|_15_|\n|_16_|_17_|_18_|_19_|_20_|");
                    break;
                case 5:
                    System.out.println("Anda memesan tiket pada bangku 5");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|_02_|_03_|_04_|Anda|\n|_06_|_07_|_08_|_09_|_10_|\n|_11_|_12_|_13_|_14_|_15_|\n|_16_|_17_|_18_|_19_|_20_|");
                    break;
                case 6:
                    System.out.println("Anda memesan tiket pada bangku 6");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|_02_|_03_|_04_|_05_|\n|Anda|_07_|_08_|_09_|_10_|\n|_11_|_12_|_13_|_14_|_15_|\n|_16_|_17_|_18_|_19_|_20_|");
                    break;
                case 7:
                    System.out.println("Anda memesan tiket pada bangku 7");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|_02_|_03_|_04_|_05_|\n|_06_|Anda|_08_|_09_|_10_|\n|_11_|_12_|_13_|_14_|_15_|\n|_16_|_17_|_18_|_19_|_20_|");
                    break;
                case 8:
                    System.out.println("Anda memesan tiket pada bangku 8");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|_02_|_03_|_04_|_05_|\n|_06_|_07_|Anda|_09_|_10_|\n|_11_|_12_|_13_|_14_|_15_|\n|_16_|_17_|_18_|_19_|_20_|");
                    break;
                case 9:
                    System.out.println("Anda memesan tiket pada bangku 9");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|_02_|_03_|_04_|_05_|\n|_06_|_07_|_08_|Anda|_10_|\n|_11_|_12_|_13_|_14_|_15_|\n|_16_|_17_|_18_|_19_|_20_|");
                    break;
                case 10:
                    System.out.println("Anda memesan tiket pada bangku 10");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|_02_|_03_|_04_|_05_|\n|_06_|_07_|_08_|_09_|Anda|\n|_11_|_12_|_13_|_14_|_15_|\n|_16_|_17_|_18_|_19_|_20_|");
                    break;
                case 11:
                    System.out.println("Anda memesan tiket pada bangku 11");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|_02_|_03_|_04_|_05_|\n|_06_|_07_|_08_|_09_|_10_|\n|Anda|_12_|_13_|_14_|_15_|\n|_16_|_17_|_18_|_19_|_20_|");
                    break;
                case 12:
                    System.out.println("Anda memesan tiket pada bangku 12");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|_02_|_03_|_04_|_05_|\n|_06_|_07_|_08_|_09_|_10_|\n|_11_|Anda|_13_|_14_|_15_|\n|_16_|_17_|_18_|_19_|_20_|");
                    break;
                case 13:
                    System.out.println("Anda memesan tiket pada bangku 13");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|_02_|_03_|_04_|_05_|\n|_06_|_07_|_08_|_09_|_10_|\n|_11_|_12_|Anda|_14_|_15_|\n|_16_|_17_|_18_|_19_|_20_|");
                    break;
                case 14:
                    System.out.println("Anda memesan tiket pada bangku 14");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|_02_|_03_|_04_|_05_|\n|_06_|_07_|_08_|_09_|_10_|\n|_11_|_12_|_13_|Anda|_15_|\n|_16_|_17_|_18_|_19_|_20_|");
                    break;
                case 15:
                    System.out.println("Anda memesan tiket pada bangku 15");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|Anda|_02_|_03_|_04_|_05_|\n|_06_|_07_|_08_|_09_|_10_|\n|_11_|_12_|_13_|_14_|Anda|\n|_16_|_17_|_18_|_19_|_20_|");
                    break;
                case 16:
                    System.out.println("Anda memesan tiket pada bangku 16");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|_02_|_03_|_04_|_05_|\n|_06_|_07_|_08_|_09_|_10_|\n|_11_|_12_|_13_|_14_|_15_|\n|Anda|_17_|_18_|_19_|_20_|");
                    break;
                case 17:
                    System.out.println("Anda memesan tiket pada bangku 17");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|_02_|_03_|_04_|_05_|\n|_06_|_07_|_08_|_09_|_10_|\n|_11_|_12_|_13_|_14_|_15_|\n|_16_|Anda|_18_|_19_|_20_|");
                    break;
                case 18:
                    System.out.println("Anda memesan tiket pada bangku 18");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|_02_|_03_|_04_|_05_|\n|_06_|_07_|_08_|_09_|_10_|\n|_11_|_12_|_13_|_14_|_15_|\n|_16_|_17_|Anda|_19_|_20_|");
                    break;
                case 19:
                    System.out.println("Anda memesan tiket pada bangku 19");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|_02_|_03_|_04_|_05_|\n|_06_|_07_|_08_|_09_|_10_|\n|_11_|_12_|_13_|_14_|_15_|\n|_16_|_17_|_18_|Anda|_20_|");
                    break;
                case 20:
                    System.out.println("Anda memesan tiket pada bangku 20");
                    System.out.println("\n|     Lapangan Basket    |\n");
                    System.out.println("|_01_|_02_|_03_|_04_|_05_|\n|_06_|_07_|_08_|_09_|_10_|\n|_11_|_12_|_13_|_14_|_15_|\n|_16_|_17_|_18_|_19_|Anda|");
                    break;
                default:
                    System.out.println(tempat+" tidak ada dalam pilihan!");
            }
                
                    String lagi;
                    System.out.println("---------------------------------");
                    System.out.println("Apakah ingin memesan lagi?\n"
                            + "Ya / Tidak");
                    lagi = input.next();
                    if (lagi.equals("Ya")){
                        System.out.println("Pesan lagi!");
                    }else if(lagi.equals("Tidak")){
                        System.out.println("Terimakasih telah memesan tiket :D");
                        again = false;
                    }else {
                        System.out.println(lagi+" tidak ada dalam pilihan!");
                    }
        }
    }
}
