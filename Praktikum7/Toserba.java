/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan7;

/**
 *
 * @author Lenovo AMD3020E
 */
import java.util.Scanner;
public class Toserba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data barang
        String[] kodeBarang = {"001", "002", "003", "004", "005"};
        String[] namaBarang = {"Pulpen", "Buku", "Pensil", "Spidol", "Penghapus"};
        int[] harga = {5000, 7000, 4000, 10000, 2000};

        System.out.println("TOKO SERBA ADA");
        System.out.println("**********************");
        System.out.print("Masukkan Item Barang : ");
        int jumlahBarang = input.nextInt();

        String[] kodeBarangBeli = new String[jumlahBarang];
        int[] jumlahBeli = new int[jumlahBarang];
        int[] hargaBeli = new int[jumlahBarang];

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println();
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan kode        : ");
            kodeBarangBeli[i] = input.next();

            // Validasi kode barang
            boolean ditemukan = false;
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBarangBeli[i].equals(kodeBarang[j])) {
                    ditemukan = true;
                    hargaBeli[i] = harga[j];
                    break;
                }
            }
            if (!ditemukan) {
                System.out.println("Kode barang tidak ditemukan. Silakan coba lagi.");
                i--;
                continue;
            }
            System.out.print("Masukkan jumlah beli : ");
            jumlahBeli[i] = input.nextInt();
        }

        int totalBayar = 0;
        System.out.println();
        System.out.println("TOKO SERBA ADA");
        System.out.println("**********************");
        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("----------------------------------------------------------------------------");
        for (int i = 0; i < jumlahBarang; i++) {
            int jumlahBayar = hargaBeli[i] * jumlahBeli[i];
            totalBayar += jumlahBayar;

            System.out.println((i + 1) + "\t" + kodeBarangBeli[i] + "\t\t" + namaBarang[i] + "\t\t" + hargaBeli[i] + "\t" + jumlahBeli[i] + "\t\t" + jumlahBayar);
        }
        System.out.println("============================================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t\t" + totalBayar);
        System.out.println("============================================================================");
    }
}


