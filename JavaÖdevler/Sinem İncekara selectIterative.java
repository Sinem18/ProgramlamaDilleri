import java.util.Scanner;

public class SelectionStatString {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bir karakter giriniz:");

        while (true) {
            try {
                char leyla = keyboard.next().charAt(0);
                if (!Character.isLetter(leyla)) {
                    throw new IllegalArgumentException("Lütfen sadece harf giriniz!");
                }
                if (leyla == 'a' || leyla == 'A') {
                    System.out.println("İlk karakter A");
                } else {
                    System.out.println("İlk karakter a veya A değildir");
                }
                break; 
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            /* finally {
                System.out.println("Bu mesaj yazılır");
            } */
        }
    }
}
