import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kwota=10000;
        Scanner sc=new Scanner(System.in);
System.out.println("Obecne saldo to:"+ kwota+ "   Ile mam wypłacić");
int wyplata=sc.nextInt();
        System.out.println("Wypłaciłeś "+ wyplata + " Twoje dostępne saldo to: " + (kwota-wyplata));
    }
}
