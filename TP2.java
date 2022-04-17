import java.util.Scanner;

public class TP2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        boolean reload = false;
        do {
            exec(scan);
            
            System.out.print("Apakah anda mau mengulang perhitungan? (y/n): ");
            scan.nextLine();
            String choice = scan.nextLine();
            reload = shouldReload(choice);
            System.out.println();
        } while(reload);
    }
    
    static boolean shouldReload(String choice) {
        return choice.equals("Y") || choice.equals("y");
    }
    
    static void exec(Scanner scan) {
        System.out.print("Masukkan banyaknya angka yang mau dicetak [2..10]: ");
        int n = scan.nextInt();
        System.out.println("n " + n);
        if (n < 2 || n > 10) {
            System.out.println("Angka harus diantara 2 dan 10!");
            return;
        }
        
        System.out.print("Masukkan beda masing-masing angka [2..9]: ");
        int r = scan.nextInt();
        System.out.println("r " + r);
        if (r < 2 || r > 9) {
            System.out.println("Angka harus diantara 2 dan 9!");
            return;
        }
        
        
        System.out.println("Deret Aritmatika:");
        aritmatika(n, r);
        System.out.printf("\n\n");
        
        System.out.println("Deret Geometri:");
        geometri(n, r);
        System.out.printf("\n\n");
        
        System.out.println("Faktorial dari: " + n);
        faktorial(n, r);
        System.out.println();
    }
    
    static void aritmatika(int n, int r) {
        int cur = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(cur);
            System.out.print(" ");
            cur += r;
        }
    }
    
    static void geometri(int n, int r) {
        int cur = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(cur);
            System.out.print(" ");
            cur *= r;
        }
    }
    
    static void faktorial(int n, int r) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            System.out.print(i);
            
            if (i != 1) {
                System.out.print(" * ");
            }
            result *= i;
        }
        System.out.print(" = " + result);
    }
}

