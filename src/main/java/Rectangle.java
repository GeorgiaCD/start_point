public class Rectangle {

    int length;
    int width;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

   public int areaMethod() {
        return this.length * this.width;
    }

    public boolean isRectangle() {
//        return (this.length == this.width) ? true : false;
        return this.length == this.width;
    }


}




