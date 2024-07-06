public class Circle {
    // write code here

    public double radius;

    Circle(double radius) {
        this.radius = Math.max(radius, 0);
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return (Math.pow(this.radius, 2) * Math.PI);
    }
}