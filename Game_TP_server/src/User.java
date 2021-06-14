public class User {
    public double number;
    public double guess;

    public User(){

    }

    public User(double coordinate, double angle){
        this.number = coordinate;
        this.guess = angle;
    }

    public void addUserCoordinate(double coordinate){
        this.number = coordinate;
    }
}
