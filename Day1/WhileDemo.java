class WhileDemo {
	public static void main(String[] args) {
		int counter = 0;

		while(counter < 5) {
			counter++;
			System.out.println("Counter: "+counter);
		}
		System.out.println("-----------------");
		int x = 0;
		do {
			System.out.println("x: "+x);
			x++;
		}while(x < 0);
	}
}	