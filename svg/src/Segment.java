import static java.lang.Math.pow;

public class Segment {
    private final Point a, b;

    public Segment(Point a, Point b) {
        this.a = new Point(a);      // dokonujemy kopiowania konstruktorem kopiującym
        this.b = new Point(b);
    }

    // zwraca dwa możliwe odcinki prostopadłe zaczynające się w punkcie origin
    public Segment[] perpendicularSegments(Point origin){
        double dx = b.getX() - a.getX();
        double dy = b.getY() - a.getY();
        dx = dx/length() * length();
        dy= dy/length() * length();

        return new Segment[]{
                new Segment(origin, new Point(origin.getX()+dx, origin.getY()-dy)),
                new Segment(origin, new Point(origin.getX()-dx, origin.getY()+dy))
        };
    }

    public double length(){
        return Math.sqrt(pow(a.getX()-b.getX(), 2) + pow(a.getY()-b.getY(), 2));
    }

    public static Segment maxSegment(Segment[] arr){
        if(arr.length == 0)
            return null;

        Segment max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i].length() > max.length())
                max = arr[i];
        }
        return max;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}