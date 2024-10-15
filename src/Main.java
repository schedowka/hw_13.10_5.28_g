import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи а: введи б: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        int umn=1;
        for (int i=a; i<=b; i++)
            umn *=i;
        System.out.println(umn);
    }
}

