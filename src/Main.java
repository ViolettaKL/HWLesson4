public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure(1, 3,8);

        int volumeFigure;
        volumeFigure = figure.giveMeVolume();
        System.out.println(volumeFigure);

        figure.surfaceArea();
    }
}