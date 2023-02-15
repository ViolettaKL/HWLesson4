public class Client {
    String name;
    double balance;
    int code;

    public Client(String name, double balance, int code) {
        this.name = name;
        this.balance = balance;
        this.code = code;
    }

    public static String returnThere() {

        return "There";
    }

    public static double returnDif(double a, double b) {
        return a - b;
    }

    public void printPersonalInfo() {
        System.out.println("My name is " + name + ". My current balance is " + balance + ". My personal code is " + code + ".");
    }

}
