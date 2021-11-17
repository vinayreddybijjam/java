import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (char) (i+65);
        }
        for (int i = n; i > 0; i--) {
            for (char c: arr) System.out.print(c);
            for (int j = n-2; j >= 0; j--) {
                System.out.print(arr[j]);
            }
            arr[i-1] = ' ';
            System.out.println();
        }
    }
}