import java.util.Scanner;
public class flowchart2 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        String jenisBuku, namaHari;
        double diskon;
        int jumlahBuku;

        System.out.print("Masukkan jenis buku: ");
        jenisBuku = input24.nextLine();
        System.out.print("Masukkan nama hari: ");
        namaHari = input24.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = input24.nextInt();

        if (namaHari.equalsIgnoreCase("rabu")) {
            if (jenisBuku.equalsIgnoreCase("kamus")) {
                if (jumlahBuku >= 2) {
                    diskon = 0.12;
                    System.out.println("Diskon 12%");
                } else {
                    diskon = 0.10;
                    System.out.println("diskon 10%");
                    return;
                } 
            } else if (jenisBuku.equalsIgnoreCase("novel")) {
                if (jumlahBuku > 3) {
                    diskon = 0.09;
                    System.out.println("Diskon 9%");
                } else {
                    diskon = 0.08;
                    System.out.println("Diskon 8%");
                    return;
                }
            } else {
                if (jumlahBuku >3){
                    diskon = 0.05;
                    System.out.println("Diskon 5%");
                } else {
                    diskon = 0;
                    System.out.println("Tidak diskon");
                }
            }
                
               
        } else {
            diskon = 0;
            System.out.println("Tidak diskon");
        }
        System.out.println("Jumlah diskon: " + diskon);
           
        
    }
}
