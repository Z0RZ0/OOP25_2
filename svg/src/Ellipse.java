public class Ellipse extends Shape{
    private Point o;
    private double rx,ry;

    public Ellipse(Style style, Point o, double rx, double ry){
        super(style);
        this.o= new Point(o);
        this.rx=rx;
        this.ry=ry;
    }
    public String toSvg(){
        return
    }

    public BoundingBox boundingBox(){
        return new BoundingBox(o.getX()-rx, )
    }

}
