
abstract class Keyboard
{
int price;
String brand;
public Keyboard() 
{ }
public Keyboard(int p, String b) 
{
this.price=p;
this.brand=b;
}
public void pressJ() 
{
System.out.println("prints J");
}
public void pressQ() {
System.out.println("prints Q");
}
public abstract void pressEnter();
}
class Image extends Keyboard{
@Override
public void pressEnter() {
System.out.println("image gets open");
}
}
class NotePad extends Keyboard{
@Override
public void pressEnter() {
System.out.println("Control goes to next line");
}
}
abstract class MusicFile extends Keyboard
{
}
/*public class Test{
public static void main(String[] args) {
Keyboard kb=new Keyboard(); //error
}
} */

public class Test{
public static void main(String[] args) {
Keyboard kb=new Image();
kb.pressEnter();
kb.pressJ();
kb.pressQ();
}
}

