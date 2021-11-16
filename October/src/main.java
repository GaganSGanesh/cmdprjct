class G{
	
}
class H extends G{
	
}
class I extends H{
	
}
class J extends I{
	
}
class K extends J{
	
}
class main{
	public static void main(String[] args) {
		G g=new I();
		H h=(H)g;
	}
}
class main1{
	public static void main(String[] args) {
		G g=new K();
		H h=(J)g;
		H h1=(K)g;
//		I i=(I) new H(); CCE 
		H h2= new H();
//		I i=(I)h2; CCE
		
	}
}
