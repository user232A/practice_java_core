package practice_zero;

public class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int setX(int x){
        return this.x = x;
    }

    public void print(){
        System.out.println(x + " " + y);
        System.out.println("Parameter y " + this.getY());
    }
}
