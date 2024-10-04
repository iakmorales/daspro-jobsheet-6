import java.util.Scanner;
/**
 * pemilihan2percobaan124
 */
public class pemilihan2percobaan124 {
public static void main(String[] args) {
    Scanner input24 = new Scanner(System.in);

    System.out.print("Masukkan tahun : ");
    int tahun = input24.nextInt();

    if ((tahun % 4) == 0) {
        if ((tahun % 100 )!= 0) 
            System.out.println("Tahun Kabisat"); 
}   else 
       System.out.println("Bukan Tahun Kabisat ");

}
    
}