import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("masukkan bilangan");
        int bilangan = input.nextInt();

         if (bilangan %2 ==0){
            System.out.println("Bilangan genap");
        }else {
            System.out.println("bilangan ganjil");
        }
    }

    }
