package ExperimentOnAbstractClass;

abstract class Matterial extends Object{

}
class Vehicle extends Matterial{
	
}
class Car{
	public static void main(String[] args) {
		Matterial m=new Vehicle();
		System.out.println(m.toString());
		System.out.println(m.hashCode());

	}
}

