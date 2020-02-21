import java.util.Random;
import java.util.Scanner;
public class Main {
    static int v1=0;
    static int rez=0;
    static int rez2=0;
    static int was=0;
    static int was1=0;
    public static void main(String[] args) {

        System.out.println("Какой выриат игры вам подходит\n" +
                "1-Игра с компьютером.\n" +
                "2-Игра с другом.");
        Scanner scanner = new Scanner(System.in);
        int v1 = scanner.nextInt();
        if (v1==1){
            for( int i = 0; i < 5; i++) {

                randomiun();
            }System.out.println("Результат первого игрока:"+rez);
            System.out.println("Результат компьютера:"+rez2);
        }
        if (v1==2){
            for( int i =  0; i <  5; i++) {
                onevstwo();
            }
            System.out.println("Результат первого игрока:"+was);
            System.out.println("Результат второго игрока:"+was1);
            }
        }
    public static void randomiun(){
            System.out.println("Игрок Одинокий, выбирайте.");
            System.out.println("Камень-1 Ножницы-2 бумага-3");
            int k = 1;
            int n = 2;
            int b = 3;
//int user1=0;
//int user2=0;

            Scanner alla1 = new Scanner(System.in);
            int user1 = alla1.nextInt();
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
                    System.out.println("Ничья, оба не умеют играть.");
                }
                if (user2 == n) {
                    rez = rez + 1;
                    rez2 = rez2 - 1;
                    System.out.println("Победа первого.");
                }
                if (user2 == b) {
                    rez = rez - 1;
                    rez2 = rez2 + 1;
                    System.out.println("Победа компьютера");
                }
                if (user1 == n) {
                    if (user2 == k) {
                        rez = rez - 1;
                        rez2 = rez2 + 1;
                        System.out.println("Победа кампьютера.");
                    }
                    if (user2 == n) {
                        System.out.println("Ничья.");
                    }
                    if (user2 == b) {
                        rez = rez + 1;
                        rez2 = rez2 - 1;
                        System.out.println("Победа первого.");
                    }
                    if (user1 == b) {
                        if (user2 == k) {
                            rez = rez - 1;
                            rez2 = rez2 + 1;
                            System.out.println("Победа первого.");
                        }
                        if (user2 == n) {
                            rez = rez + 1;
                            rez2 = rez2 - 1;
                            System.out.println("Победа второго.");
                        }
                        if (user2 == b) {
                            System.out.println("Ничья.");
                        }
                    }
                }
            }
        }
    public static void onevstwo(){
            System.out.println("Игрок Силикон и Игрок Втулка, выбирайте.");
            System.out.println("Камень-1 Ножницы-2 бумага-3");
            int s = 1;
            int w = 2;
            int h = 3;
//int opo1=0;
//int opo2=0;

            Scanner alla = new Scanner(System.in);
            int opo1 = alla.nextInt();
            System.out.println("Выбирает второй игрок.");
            int opo2 = alla.nextInt();

// int kw = 0;
            if (opo1 == s) {
                if (opo2 == s) {
                    System.out.println("Ничья, оба не умеют играть.");
                }
                if (opo2 == w) {
                    was = was + 1;
                    was1 = was1 - 1;
                    System.out.println("Победа первого.");
                }
                if (opo2 == h) {
                    was = was - 1;
                    was1 = was1 + 1;
                    System.out.println("Победа второго игрока");
                }
            }
            if (opo1 == w) {
                if (opo2 == s) {
                    was = was - 1;
                    was1 = was1 + 1;
                    System.out.println("Победа второго.");
                }
                if (opo2 == w) {
                    System.out.println("Ничья.");
                }
                if (opo2 == h) {
                    was = was + 1;
                    was1 = was1 - 1;
                    System.out.println("Победа первого.");
                }
            }
            if (opo1 == h) {
                if (opo2 == s) {
                    was = was - 1;
                    was1 = was1 + 1;
                    System.out.println("Победа первого.");
                }
                if (opo2 == w) {
                    was = was + 1;
                    was1 = was1 - 1;
                    System.out.println("Победа второго.");
                }
                if (opo2 == h) {
                    System.out.println("Ничья.");
                }
            }
        }
    }
