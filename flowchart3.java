import java.util.Scanner;
public class flowchart3 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        String merk, kategori; 
        double hargaSepatu;
        int ukuran;

        System.out.print("Masukkan merk sepatu: ");
        merk = input24.nextLine();
        System.out.print("Masukkan kategori sepatu: ");
        kategori = input24.nextLine();
        System.out.print("Masukkan ukuran sepatu: ");
        ukuran = input24.nextInt();

        if (merk.equalsIgnoreCase("Converse")){
            if (kategori.equalsIgnoreCase("slip on")){
                if (ukuran >= 36 && ukuran <= 40 ){
                    hargaSepatu = 800000;
                    System.out.print("Harga sepatu: " + hargaSepatu);
                } else {
                    System.out.print("Ukuran sepatu tidak tersedia ");
                }
            } else if (kategori.equalsIgnoreCase("high top")){
                if (ukuran >= 40 && ukuran <= 44){
                    hargaSepatu = 1200000;
                    System.out.print("Harga sepatu: " + hargaSepatu);
                } else {
                    System.out.print("Ukuran sepatu tidak tersedia ");
                }
            } else { 
                System.out.print("Kategori tidak tersedia ");
            }
        } else if (merk.equalsIgnoreCase("Sketcher")){
            if (kategori.equalsIgnoreCase("woman")){
                if (ukuran >= 36 && ukuran <= 41){
                    hargaSepatu = 1000000;
                    System.out.print("Harga sepatu: " + hargaSepatu);
                } else {
                    System.out.print("Ukuran sepatu tidak tersedia ");
                }
            } else if (kategori.equalsIgnoreCase("man")){
                if (ukuran >= 41 && ukuran <= 44){
                    hargaSepatu = 1800000;
                    System.out.print("Harga sepatu: " + hargaSepatu);
                } else {
                    System.out.print("Ukuran sepatu tidak tersedia ");
                }
           } else { 
            System.out.print("Kategori tidak tersedia ");
           }
       } else if (merk.equalsIgnoreCase("Nike")){
        if (kategori.equalsIgnoreCase("Kids")){
            if (ukuran >= 36 && ukuran <= 40){
                hargaSepatu = 7500000;
                System.out.print("Harga sepatu: " + hargaSepatu);
            } else {
                System.out.print("Ukuran sepatu tidak tersedia ");
            }
        } else if (kategori.equalsIgnoreCase("Adult")){
            if (ukuran >= 40 && ukuran <= 44){
                hargaSepatu = 1500000;
                System.out.print("Harga sepatu: " + hargaSepatu);
            } else {
                System.out.print("Ukuran sepatu tidak tersedia ");
            }
       } else { 
        System.out.print("Kategori tidak tersedia ");
       }
       } else {
        System.out.print("Merk sepatu tidak tersedia");
       }
}
}
