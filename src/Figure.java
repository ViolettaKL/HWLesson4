public class Figure {
    int height;
    int width;
    int length;

    //method passes height, width, length
    public Figure(int height, int width, int length) {
    this.height = height;
    this.width = width;
    this.length = length;
    }

    // default method
    public Figure(){

    }

    // figure volume calculation
    public int giveMeVolume(int height, int width, int length) {
        return height * width * length;

    }

}