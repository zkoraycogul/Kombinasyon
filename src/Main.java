import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r,total=1;
        System.out.print("Eleman Sayısını Giriniz : ");
        n = input.nextInt();

        System.out.print("Altküme Eleman Sayısını Giriniz : ");
        r = input.nextInt();

        for (int i=1;i<=n;i++) {
            total = total*i;
        }

        for (int i=1;i<=r;i++) {
            total = total/i;
        }

        for (int i=1;i<=(n-r);i++) {
            total = total/i;
        }

        System.out.print("C(n,r)  " + total);

    }
}
