public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure(1, 3,8);

        int volumeFigure;
        volumeFigure = figure.giveMeVolume();
        System.out.println(volumeFigure);

        figure.surfaceArea();

        Client client1 = new Client("John",342.4,423  );
        Client client2 = new Client("Kate",6550.5,424  );
        Client client3 = new Client("Mari",15000.2,425  );

        String there = client1.there();

    }
}