package package1;

class Pen{
}
class SketchPen extends Pen{
}
class MarkerPen extends Pen{
}
class Test{
public static void main(String[] args) {
SketchPen sp1 = new SketchPen();
SketchPen sp2=sp1;
Pen p=sp1;//Up-Casting
Object o=sp1;//Up-Casting
Pen p1= new MarkerPen();
Pen p2=p;
Object o1=p;//Up-Casting  //NOW P HAS ADDRESS OF OBJECT CLASS
MarkerPen mp=(MarkerPen)p;//Error
MarkerPen mp1=(MarkerPen)p;//Down-Casting
SketchPen sp3=(SketchPen)p;//gives ClassCastException
System.out.println("hello milu");
}
}