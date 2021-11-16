package NullExperiment;

public class Null {

		public static void main(String[] args){

		String str = "";

		String str2 = null;

		if(StringUtils.EMPTY.equals(str)){

		System.out.println("str1.1 is empty");

		}

		if(StringUtils.isEmpty(str)){

		System.out.println("str1.2 is empty");

		}

		if(StringUtils.EMPTY.equals(str2)){

		System.out.println("str2.1 is empty");

		}

		if(StringUtils.isEmpty(str2)){

		System.out.println("str2.2 is empty");

		}

		}

		
}
