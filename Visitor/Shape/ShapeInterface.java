package Visitor.Shape;

import Visitor.VisitorMain.Visitor;

public interface ShapeInterface {
    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);
}
