import java.util.Scanner;
import java.util.Scanner;

public class Game {

    private Connection connection;
    private User user1;
    private User user2;
    Scanner scanner = new Scanner(System.in);

    private double speed = 20;


    public Game(Connection connection) {
        this.connection = connection;
        user1 = new User();
        user2 = new User();
    }



    public void myMove() {
        while (true) {
            try {

                System.out.println("Ваш ход.");
                double guess = scanner.nextDouble();
                connection.send(guess);
                System.out.println("Ожидаем хода соперника");


            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
    }

}

