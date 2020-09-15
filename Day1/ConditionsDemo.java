class ConditionsDemo {
	public static void main(String[] args) {
		String desig = "Admin";
		switch(desig) {
			case "Admin":
				System.out.println("task for case1");
				break;
			case "Programmer":
				System.out.println("task for case2");
				break;
			case "Manager": 
				System.out.println("task for case3");
				break;
			default:
				System.out.println("default case");
		}
	}	
}