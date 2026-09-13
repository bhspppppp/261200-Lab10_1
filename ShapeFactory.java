public class ShapeFactory {

    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_TRIANGLE = 1;
    public static final int TYPE_ELLIPSE = 2;

    private static final int MAX_PER_TYPE = 2;
    private static final int MAX_TOTAL = 5;

    static int circleCount = 0;
    static int triangleCount = 0;
    static int ellipseCount = 0;
    static int totalCount = 0;

    public static Shape getShape(int shapeType) {
        if(totalCount >= MAX_TOTAL) {
            System.out.println("cant make more shapes, total limit " + MAX_TOTAL + " reached");
            return null;
        }

        if (shapeType == TYPE_CIRCLE) {
            if (circleCount >= MAX_PER_TYPE) {
                System.out.println("cant make more circle, limit " + MAX_PER_TYPE + " reached");
                return null;
            }
            circleCount++;
            totalCount++;
            return new Circle();
        }
        else if(shapeType == TYPE_TRIANGLE){
            if(triangleCount >= MAX_PER_TYPE){
                System.out.println("cant make more triangle, limit " + MAX_PER_TYPE + " reached");
                return null;
            }
            triangleCount++;
             totalCount++;
            return new Triangle();
        }
        else if (shapeType == TYPE_ELLIPSE) {
            if (ellipseCount >= MAX_PER_TYPE) {
                System.out.println("cant make more ellipse, limit " + MAX_PER_TYPE + " reached");
                return null;
            }
            ellipseCount++;
            totalCount++;
                return new Ellipse();
        }
        System.out.println("dont know this shape type, skip");
        return null;
    }
}
