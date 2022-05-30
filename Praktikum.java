import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.print("12.09." + year);
        } else {
            System.out.print("13.09." + year);
        }
    }

    public static boolean isLeapYear(int year) {
   if (year % 4 == 0) {
       return year % 100 != 0 || year % 400 == 0;
   } else {
       return false;
   }
}

}
