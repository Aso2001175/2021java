public class Main{

    public static void main(String[] args){
        Position posA = new Position();
        Position posB = new Position();

        posA.x = 0;
        posA.y = 0;
        posB.x = 10;
        posB.y = 25;

        move(posA);
        move(posB);
    }

    public static void move(Position pos){
        pos.moveLeft();
        pos.moveDown();
        pos.display();
    }
}