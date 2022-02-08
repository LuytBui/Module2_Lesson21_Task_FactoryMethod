import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter shape type: ");
        String type = scanner.next();

        try {
            Shape shape = ShapeFactory.getShape(type);
            shape.draw();
        } catch (NullPointerException e){
            System.out.println("Invalid shape type!");
        }

    }
}
