class AssinThree{
	public static void main(String args[]){
		double profit = Integer.parseInt(args[1]);
		double taxAmount = 0;
		double totalWithTax = 0;

		switch (args[0]){
			case "KA":
				taxAmount = 0.1 * profit;	// Asuuming tax is 10%
				totalWithTax = profit + taxAmount;
				System.out.println("Total amount for Karnataka = "+totalWithTax );
				break;
			case "TN":
				taxAmount = 0.095 * profit;	// Asuuming tax is 9.5%
				totalWithTax = profit + taxAmount;
				System.out.println("Total amount for Tamilnadu = "+totalWithTax );
				break;
			case "AP":
				taxAmount = 0.09 * profit;	// Asuuming tax is 9%
				totalWithTax = profit + taxAmount;
				System.out.println("Total amount for AndraPradesh = "+totalWithTax );
				break;
			case "MH":
				taxAmount = 0.105 * profit;	// Asuuming tax is 10.5%
				totalWithTax = profit + taxAmount;
				System.out.println("Total amount for Maharashtra = "+totalWithTax );
				break;
                        default:
                               System.out.println("No state given");                       

			}
		        
		}
	}