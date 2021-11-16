package ExpInterface;

interface Planet {

}
class SolarSystem  extends Object  implements Planet{
	public static void main(String[] args) {
		Planet p=new SolarSystem();
		System.out.println(p.toString());
	}
}




