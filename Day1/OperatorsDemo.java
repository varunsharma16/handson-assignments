class OperatorsDemo {
	public static void main(String[] args) {
		double amount = 10000;
		double discount = 0.1;
		double result = amount * discount;
		System.out.println("Discount is: "+result);

		int a = 5;
		int b = a++;
		System.out.println("a = "+a+", b = "+b);

		int c = 7;
		int d = ++c;
		System.out.println("c = "+c+", d = "+d);
	}
}