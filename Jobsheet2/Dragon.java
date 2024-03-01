package Jobsheet2;
public class Dragon {
    int x, y, width, height;

    void moveLeft() {
        x = x - 1;
        printPosition();
    }

    void moveRight() {
        x = x + 1;
        printPosition();
    }

    void moveUp() {
        y = y - 1;
        printPosition();
    }

    void moveDown() {
        y = y + 1;
        printPosition();
    }
    void printPosition() {
        System.out.printf("(%d, %d)\n" , x, y);
    }

    public static void main(String[] args) {
        Dragon d = new Dragon();
        d.printPosition();
        d.moveRight();d.moveDown();d.moveUp();
    }
}