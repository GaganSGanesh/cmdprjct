// Java Constructor as final

import java.io.*;
class GFG {

	// GFG() constructor is declared final
	static GFG()
	{`	a`
		// This line can not be executed as compile error
		// will come
		System.out.print(
			"Hey you have declared constructor as final, it's error");
	}
}
class Main {
	public static void main(String[] args)
	{
		// Object of GFG class created
		// Automatically GFG() constructor called
		GFG obj = new GFG();
	}
}

