public class User {
    public double number;
    public double guess;

    public User(){}

    public User(double coordinate, double guess){
        this.number = coordinate;
        this.guess = guess;
    }

    public void addUserCoordinate(double coordinate){
        this.number = 0;
    }
}
