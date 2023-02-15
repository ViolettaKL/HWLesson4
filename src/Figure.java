public class Figure {
    int height;
    int width;
    int length;

    //method passes height, width, length
    public Figure(int height, int width, int length ) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    // default method
    public Figure(){

    }


    // figure volume calculation
    public int giveMeVolume() {
        return height * width * length;

    }

    public void surfaceArea() {
        int s = 2*(height * width + height * length + width * length);
        System.out.println("Figure surface area:" + s);
    }

}