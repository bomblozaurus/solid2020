package pl.zzpj2020.solid.lsp.shape;

public class Rectangle extends Shape {
    double length;
    double width;

    @Override
    double calculateField() {
        return length * width;
    }

    @Override
    double calculateCircumference() {
        return 2.0 * (length + width);
    }
}
