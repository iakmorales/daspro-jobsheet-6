import java.util.Scanner;
public class pemilihan2percobaan224 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        int pilihanMenu;
        String member, jenisPembayaran;
        double totalBayar, diskon, harga, potonganqris = 1000;


        System.out.println("---------------------------------------------");
        System.out.println("=============== MENU kafe JTI ===============");
        System.out.println("---------------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihanMenu = input24.nextInt();
        input24.nextLine();
        System.out.print("Apakah punya member (y/n)? = ");
        member = input24.nextLine();
        System.out.print("Metode pembayaran (qris/cash) = ");
        jenisPembayaran = input24.nextLine();
        System.out.println("--------------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon 10% ");
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling = " + harga);
            }  else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            totalBayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + totalBayar);
            if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
                totalBayar -= potonganqris;
                System.out.println("Potongan QRIS sebesar Rp. 1.000");
                System.out.println("Total bayar setelah diskon dan potongan QRIS = " + totalBayar);
            }
         }else if (member.equalsIgnoreCase("n")){
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling = " + harga);
            }  else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            } 
            System.out.println("Total bayar = " + harga);
            totalBayar = harga;
            if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
                totalBayar -= potonganqris;
                System.out.println("Potongan QRIS sebesar Rp. 1.000");
                System.out.println("Total bayar setelah potongan QRIS = " + totalBayar);
            }
        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("---------------------------------------------");
        }
    }

