package pl.zzpj2020.solid.lsp.shape;

public class Square extends Shape {
    double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    double calculateField() {
        return length * length;
    }

    @Override
    double calculateCircumference() {
        return 4.0 * length;
    }
}
