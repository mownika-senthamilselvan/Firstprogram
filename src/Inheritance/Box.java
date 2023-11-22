package Inheritance;

public class Box {
    protected double l=5;
    double h;
    double w;
     Box()
    {
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    Box(double size){
        this.l= size;
        this.h= size;
        this.w= size;
    }


     Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box box)
    {
        this.l = box.l;
        this.h = box.h;
        this.w = box.w;
    }

}
