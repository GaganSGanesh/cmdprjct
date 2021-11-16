package SouravSir;

public interface hello {
public static int i=109;
public abstract void play();
public static void main(String[] args) {
	
}
}
class hi implements hello{
	public void play() {
		System.out.println("this is hi class");
	}
	public static void main(String[] args) {
		hi h=new hi();
		h.play();
	}
}
