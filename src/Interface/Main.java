package Interface;

public class Main {

    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(100,100,60,70);
        System.out.println("------------------");
        System.out.println(" MoveUp : ");
        p1.moveUp();
        System.out.println("--------------------");
        System.out.println(" MoveDown : ");
        p1.moveDown();
        System.out.println("-------------------");
        System.out.println(" MoveRight : ");
        p1.moveRight();
        System.out.println("-------------------");
        System.out.println(" MoveLeft : ");
        p1.moveLeft();

    }
}
