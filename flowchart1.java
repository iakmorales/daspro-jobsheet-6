import java.util.Scanner;

public class flowchart1 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        int bil1 = 18, bil2 = 54, bil3 = 15;
        int max;
        
        if (bil1 < bil2) {
            max = bil2;
        } else 
            max = bil1;
        if (max > bil3 ) {
            max = max;
        } else
            max = bil3;
        System.out.print("bilangan terbesar: " + max);
    }
}
