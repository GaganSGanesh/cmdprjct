package P1;

	class Calculator{
		void add(Integer i) {
		System.out.println("wrapper"+" "+i);
		}
		void add(int i) {
		System.out.println("Primitive"+" "+i);
		}
		public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(45);
		c.add(new Integer(4));	//unboxing
	}
}