import java.io.IOException;
import java.util.Scanner;

public class Game {

    private Connection connection1;
    private Connection connection2;
    private User user1;
    private User user2;
    Scanner scanner = new Scanner(System.in);

   public Game(Connection connection1, Connection connection2) throws IOException {
       this.connection1 = connection1;
       this.connection2 = connection2;
       user1 = new User();
       user2 = new User();
   }

    public void sendCoordinate1() throws IOException {
        System.out.println("Число 2 игрока:" );
        double coordinate2 = connection1.readObject(Double.class);
        System.out.println("Число 2 игрока:" + coordinate2 );
        //connection1.send(randCoordinate);
        connection2.send(coordinate2);
        user2.addUserCoordinate(coordinate2);

    }

    public void sendCoordinate2() throws IOException {

        System.out.println("Число 1 игрока" );
        double coordinate1 = connection2.readObject(Double.class);        //connection2.send(0);
        System.out.println("Число 1 игрока" + coordinate1 );
        connection1.send(coordinate1);
        user1.addUserCoordinate(coordinate1);
    }
    public void start() {
       //double angle1 = 0;
       //double angle2 = 0;

       while(true)
        {
            //tries = tries + 1;
            try {
                System.out.println("Ход первого игрока:");
                double guess1 = connection1.readObject(Double.class);


                if ((user1.number < guess1)) {
                    System.out.println("Введите число меньше. ");
                }else if ((user1.number > guess1)){
                System.out.println("Введите число больше.");}
                else if (user1.number == guess1){
                    System.out.println("Игра закончена. Первый игрок выиграл! ");
                    connection1.disconnect();
                    connection2.disconnect();
                    return;
                }
            }
             catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }

            try {
                System.out.println("Первый игрок промахнулся! Ход второго игрока:");
                double guess2 = connection2.readObject(Double.class);



                if ((user2.number < guess2)) {
                    System.out.println("Введите число меньше. ");
                }else if ((user2.number > guess2)){
                    System.out.println("Введите число больше.");}
                else if (user2.number == guess2){
                    System.out.println("Игра закончена. Второй игрок выиграл! ");
                    connection1.disconnect();
                    connection2.disconnect();
                    return;
                }
            }
            catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        }



    }
}

