package section8.aula1IntroducaoOO.exercicios.atividaderetangulo;

public class Rectangle {
    private Double width;
    private Double height;

    public Rectangle() {
    }

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public double area() {
        return getHeight() * getWidth();
    }

    public double perimeter() {
        return 2.0 * (height * width);
    }

    public double diagonal() {
        return Math.sqrt((width * width) + (height * height));
    }
}
