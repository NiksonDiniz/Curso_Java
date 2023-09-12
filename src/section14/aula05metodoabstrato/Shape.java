package section14.aula05metodoabstrato;

public abstract class Shape {

    //Se uma classe possuir pelo menos um método
    //abstrato, então esta classe também é abstrata.
    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //Notação UML: itálico
    public abstract double area();
}
