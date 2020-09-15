class AssinTwo{
	public static void main(String args[]){
		int rp = Integer.parseInt(args[0]);

		if(rp>= 70)
			System.out.println("FCD");

		else if(rp >= 60 && rp < 70)
			System.out.println("FC");

		else if(rp >= 50 && rp < 60)
			System.out.println("SC");

		else if(rp >= 35 && rp< 50)
			System.out.println("Pass");

		else if(rp< 35)
			System.out.println("Fail");

	}
}