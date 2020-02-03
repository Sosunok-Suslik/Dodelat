import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {

            playgame();

        }
        statsit(playgame());

    }
    public static int playgame(){
        System.out.println("Игрок Вонючка и Игрок Пумба, выбирайте.");
        System.out.println("Камень-1 Ножницы-2 бумага-3");
        int k = 1;
        int n = 2;
        int b = 3;
        int rez = 0;
        int rez2=0;
        //int user1=0;
        //int user2=0;

        Scanner scanner = new Scanner(System.in);
        int user1 = scanner.nextInt();
        System.out.println("Выбирает второй игрок.");
        int user2;
        int min = 1;
        int max = 3;
        int diff = max - min;
        Random random = new Random();
        user2 = random.nextInt(diff + 1);
        user2 += min;

       // int kw = 0;
        if (user1 == k) {
            if (user2 == k) {
                rez= rez+0;
                rez2= rez2+0;
                System.out.println("Ничья, оба не умеют играть.");
            }
            if (user2 == n) {
                rez= rez+1;
                rez2= rez2-1;
                System.out.println("Победа первого.");
            }
            if (user2 == b) {
                rez= rez-1;
                rez2= rez2+1;
                System.out.println("Победа второго игрока");
            }
        }
        if (user1 == n) {
            if (user2 == k) {
                rez = rez-1;
                rez2= rez2+1;
                System.out.println("Победа второго.");
            }
            if (user2 == n) {
                System.out.println("Ничья.");
            }
            if (user2 == b) {
                rez = rez+1;
                rez2= rez2-1;
                System.out.println("Победа первого.");
            }
        }
        if (user1 == b) {
            if (user2 == k) {
                rez= rez-1;
                rez2= rez2+1;
                System.out.println("Победа первого.");
            }
            if (user2 == n) {
                rez= rez+1;
                rez2= rez2-1;
                System.out.println("Победа второго.");
            }
            if (user2 == b) {
                rez= rez+0;
                rez2= rez2+0;
                System.out.println("Ничья.");
            }
        }
        return rez;
        //System.out.println("Результат второго игрока");
        //return rez2;

    }

    public static void statsit(int rez){
        System.out.println("Результат первого игрока.");
        System.out.println(rez);


    }
}


