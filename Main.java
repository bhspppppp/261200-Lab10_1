import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("---- circle test ----");
        Shape c1 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        if (c1 != null) c1.draw();
        Shape c2 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        if (c2 != null) c2.draw();
        Shape c3 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        if(c3 != null) c3.draw();

        System.out.println("---- triangle test ----");
        Shape t1 = ShapeFactory.getShape(ShapeFactory.TYPE_TRIANGLE);
        if (t1 != null) t1.draw();
        Shape t2 = ShapeFactory.getShape(ShapeFactory.TYPE_TRIANGLE);
        if (t2 != null) t2.draw();
        Shape t3 = ShapeFactory.getShape(ShapeFactory.TYPE_TRIANGLE);
        if (t3 != null) t3.draw();

        System.out.println("---- ellipse test ----");
        Shape e1 = ShapeFactory.getShape(ShapeFactory.TYPE_ELLIPSE);
        if (e1 != null) e1.draw();
        Shape e2 = ShapeFactory.getShape(ShapeFactory.TYPE_ELLIPSE);
        if (e2 != null) e2.draw();

        System.out.println("---- total limit test ----");
        Shape e3 = ShapeFactory.getShape(ShapeFactory.TYPE_ELLIPSE);
        if (e3 != null) {
            e3.draw();
        } else {
            System.out.println("ellipse e3 didnt get made");
        }

        Shape extra = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        if (extra != null) extra.draw();

        System.out.println("total shapes made so far " + ShapeFactory.totalCount);
    }
}
