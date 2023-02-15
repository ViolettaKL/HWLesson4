public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure(1, 3,8);

        int volumeFigure;
        volumeFigure = figure.giveMeVolume();
        System.out.println("Figure Volume:" + volumeFigure);

        figure.surfaceArea();

        Client client1 = new Client("John",342.4,423  );
        Client client2 = new Client("Kate",6550.5,424  );
        Client client3 = new Client("Mari",15000.2,425  );

        client1.printPersonalInfo();
        client2.printPersonalInfo();
        client3.printPersonalInfo();

        String tereString = Client.returnThere();
        System.out.println("Please, print me There: " + tereString);

        double a = 12.0, b = 3.0;
        double dif = Client.returnDif(a, b);
        System.out.println("Please, print me difference between " + a + " and " + b + ": " + dif);

    }
}