public class ShapeFactory {
    public static Shape getShape(String type){
        type = type.toLowerCase();

        switch (type){
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
            default:
                return null;
        }

    }
}
