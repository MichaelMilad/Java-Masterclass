package WallArea;

public class Wall {

    private double height;
    private double width;

    public Wall () {

    }

    public Wall(double width, double height) {
        this.height = Math.max(height, 0);
        this.width = Math.max(width, 0);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.max(height, 0);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = Math.max(width, 0);
    }

    public double getArea() {
        return (this.height * this.width);
    }
}
