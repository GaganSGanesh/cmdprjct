
public class Legs {
	public int no(Object l){
		return 2;
	}
	
}
class Leg extends Legs{
	@Override
	public byte no(Leg b){
		return 2;
	}
}
