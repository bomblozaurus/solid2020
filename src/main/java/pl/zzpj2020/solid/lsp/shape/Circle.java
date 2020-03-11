package pl.zzpj2020.solid.lsp.shape;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateField() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculateCircumference() {
        return 2.0 * Math.PI * radius;
    }
}
