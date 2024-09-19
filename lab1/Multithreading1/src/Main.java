import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean n = true;
        while(n) {
            System.out.println("Выберете номер задания и 5, если хотите выйти");
            int opt=in.nextInt();
            switch (opt) {
                case (1):
                    System.out.println("Задание 1");
                    Thread_ Nulla = new Thread_();
                    Nulla.start();

                    break;
                case (2):
                    System.out.println("Задание 2");
                    Runnable_ Ford = new Runnable_();
                    Thread myThread = new Thread(Ford);
                    myThread.start();
                    break;
                case(3):
                    System.out.println(" ");
                    Thread timerThread = new Thread(new Timer());
                    Thread message5 = new Thread(new z3(5000));
                    Thread message7 = new Thread(new z3(7000));

                   timerThread.start();
                    message5.start();
                    message7.start();

                    break;
                case (5):
                    n = false;
                    break;
                default:
                    System.out.println("Я не сделяль");
                    break;
            }
        }

    }
}