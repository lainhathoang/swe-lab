package Visitor.Shape;

import java.util.ArrayList;
import java.util.List;

import Visitor.VisitorMain.Visitor;

public class CompoundShape implements ShapeInterface {
    public int id;
    public List<ShapeInterface> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {
        // move shape
    }

    @Override
    public void draw() {
        // draw shape
    }

    public int getId() {
        return id;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public void add(ShapeInterface shape) {
        children.add(shape);
    }

}
