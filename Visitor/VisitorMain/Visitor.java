package Visitor.VisitorMain;

import Visitor.Shape.Circle;
import Visitor.Shape.CompoundShape;
import Visitor.Shape.Dot;
import Visitor.Shape.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
