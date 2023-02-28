package oop_java.units;

public class PointCoord {
    protected int x;
    protected int y;

    public PointCoord (int x, int y){
        this.x=x;
        this.y=y;
    }

    public static double distance (PointCoord a, PointCoord b){
        double dist = Math.sqrt(Math.pow((a.x -b.x), 2) + Math.pow((a.y - b.y),2));
        return dist;
    }

    
}
