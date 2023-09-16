import java.util.*;
import java.io.*;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Main {

	public static void main(String args[]) {
		List <Car> carlist = new ArrayList();

		//economy
		//coupe
		carlist.add(new Car("Ford", "Mustang shelby", "poor", 45, 4));
		carlist.add(new Car("chevrolet", "corvette", "poor", 45, 4));

/////////////////////////////////////////
		List <Car> carlistL2 = new ArrayList();
		//intermed
		//hybird
		carlistL2.add(new Car("hyundai", "santa fe hybird ", "medium", 50, 4));
		carlistL2.add(new Car("honda", "Accord", "medium", 50, 4));
		//sedan
		carlistL2.add(new Car("honda", "civic", "medium", 50, 4));
		carlistL2.add(new Car("Toyota", "Avalon", "medium", 50, 4));

////////////////////////////////////////////

		//standerd
		List <Car> carlistL3 = new ArrayList();
    //truck
		carlistL3.add(new Car("ford", "f150 ", "Good", 55, 5));
		carlistL3.add(new Car("Nissan", "Titan", "Good", 55, 5));
		//SUV
		carlistL3.add(new Car("Chevrolet", "Tahoe", "Good", 55, 5));
		carlistL3.add(new Car("GMC", "Yukon", "Good", 55, 5));
		//Crossover
		carlistL3.add(new Car("Mazda", "CX-5", "Good", 55, 5));
		carlistL3.add(new Car("Kia", "EV6", "Good", 55, 5));


		List <Car> carlistL4 = new ArrayList();
    //van
		carlistL4.add(new Car("Honda", "Odyssey", "medium", 70, 7));
		carlistL4.add(new Car("Kia", "Carnival", "medium", 70, 7));

//displaying cars menu for the user.
    System.out.println("Welcom To YourRental Car");
		System.out.println("Cars Menu:");
		System.out.println("Economy Coupe : " +
		"Max capacity: 4 passngers | Comfort Level: poor | Price: 45 per hour");


		System.out.println("Intermediat Hybird :"+
		"Max capacity: 4 passngers | Comfort Level: medium | Price : 50 per hour\n"+
		"Intermediat sedan:\n"+
		"Max capacity: 4 passngers | Comfort Level: medium | Price : 50 per hour\n");

		System.out.println("Standerd Truck :\n"+
		"Max capacity: 5 passngers | Comfort Level: Good | Price : 55 per hour\n"+
		"Sanderd SUV:\n"+
		"Max capacity: 5 passngers | Comfort Level: Good | Price : 55 per hour\n"+
		"Sanderd CrossOver:\n"+
		"Max capacity: 5 passngers | Comfort Level: Good | Price : 55 per hour\n");

		System.out.println("Premium : Van\n " +
		"Max capacity: 7 passngers | Comfort Level: medium | Price: 70 per hour\n");


		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number of passngers: ");
		int pNo = input.nextInt();

		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter level of comfort : ");
		String ComLevel = input2.nextLine();
		boolean vaild = true;


		for (Car s : carlist ) {

			if (pNo <= s.getCapacity() && ComLevel.equals("poor")) {

				System.out.print("Enter number of days: ");
				int days = input.nextInt();

				System.out.println("Enter the Approx mileage for your trip: ");
				double miles = input.nextDouble();


				System.out.println("The sutiable car for you for " + pNo  + " passengers: ");
				System.out.println("_________________________________________________________________");
				int cost = (days * s.getPrice());

        for ( int i  = 0 ; i < carlist.size() ; i++ ) {


				System.out.println("Car Make:  Car Model:   Duration:  Mileage Cost:   TotalCost: ");
				System.out.println(carlist.get(i).getMake() + "       " + carlist.get(i).getModel()+ "        " + days + "         " +MilesCount(miles) + "           " + cost);
			}






				System.out.print("Proceed to rent?(y/n): ");
				String dec = input.next();

				if (dec.equals("y")) {
					System.out.println("Enter Your User name: ");
					String name = input.next();
					System.out.println("Enter your password");
					int pw =input.nextInt();
					System.out.println("Enter ID Number: ");
					int num = input.nextInt();

					Hashing(pw,num,name);
					System.out.println("______________________________Receipt______________________________");
					System.out.println("Name    ID    passengers    Comfortable Level    Duration     TotalCost");
					System.out.println(name + "      " + num + "         " + pNo + "         " + s.getRegNo() + "               " + days + "          "+cost);
					System.exit(0);


				}
				else if (dec.equals("n")) {
					System.out.println("Thanks,Have A Nice Day (:");
					System.exit(0);
				}
			     }
			  else {
					vaild = false;
						 break;
					}

	     }


	   for (Car s : carlistL2 ) {

				 if (pNo <= s.getCapacity() && ComLevel.equals("medium")) {

	 				System.out.print("Enter number of days: ");
	 				int days = input.nextInt();

	 				System.out.println("Enter the Approx mileage for your trip: ");
	 				int miles = input.nextInt();

	 				System.out.println("The sutiable car for you with " + pNo + " passengers: ");
	 				System.out.println("_________________________________________________________________");
	 				int cost = (days * s.getPrice());

					for ( int i  = 0 ; i < carlistL2.size() ; i++ ) {


					System.out.println("Car Make:  Car Model:   Duration:  Mileage Cost:   TotalCost: ");
					System.out.println(carlistL2.get(i).getMake() + "       " + carlistL2.get(i).getModel()+ "        " + days + "        " +MilesCount(miles) + "           " + cost);
				}

	 				System.out.print("Proceed to rent?( y/n ): ");
	 				String dec = input.next();

	 				if (dec.equals("y")) {
						System.out.println("Enter Your User name: ");
						String name = input.next();
						System.out.println("Enter your password");
						int pw =input.nextInt();
	 					System.out.println("Enter ID Number: ");
	 					int num = input.nextInt();
						Hashing(pw,num,name);
						System.out.println("______________________________Receipt______________________________");
						System.out.println("Name    ID    passengers    Comfortable Level    Duration     TotalCost");
						System.out.println(name + "      " + num + "         " + pNo + "         " + s.getRegNo() + "               " + days + "          "+cost);
						System.exit(0);



	 				}else if (dec.equals("n")) {
						System.out.println("Thanks,Have A Nice Day (:");
	 					System.exit(0);
					}
				}
				else {
					vaild = false;
					break;
				}
	     }

			 for (Car s : carlistL3 ) {

					 if (pNo <= s.getCapacity() && ComLevel.equals("good")) {

		 				System.out.print("Enter number of days: ");
		 				int days = input.nextInt();

		 				System.out.println("Enter the Approx mileage for your trip: ");
		 				int miles = input.nextInt();

		 				System.out.println("The sutiable car for you with " + pNo + " passengers: ");
		 				System.out.println("_________________________________________________________________");
		 				int cost = (days * s.getPrice());

						for ( int i  = 0 ; i < carlistL3.size() ; i++ ) {


						System.out.println("Car Make:  Car Model:   Duration:  Mileage Cost:   TotalCost: ");
						System.out.println(carlistL3.get(i).getMake() + "       " + carlistL3.get(i).getModel()+ "          " + days + "           " +MilesCount(miles) + "           " + cost);
					}

		 				System.out.print("Proceed to rent?( y/n ): ");
		 				String dec = input.next();

		 				if (dec.equals("y")) {
							System.out.println("Enter Your User name: ");
							String name = input.next();
							System.out.println("Enter your password");
							int pw =input.nextInt();
		 					System.out.println("Enter ID Number: ");
		 					int num = input.nextInt();
							Hashing(pw,num,name);
							System.out.println("______________________________Receipt______________________________");
							System.out.println("Name    ID    passengers    Comfortable Level    Duration     TotalCost");
							System.out.println(name + "      " + num + "         " + pNo + "         " + s.getRegNo() + "               " + days + "          "+cost);
							System.exit(0);


		 				}
						else if (dec.equals("n")) {
							System.out.println("Thanks,Have A Nice Day (:");
		 					System.exit(0);
						}
		 			     }
						else {
							  vaild = false;
		 			     	break;
							}
		     }

				 for (Car s : carlistL4) {

						 if (pNo <= s.getCapacity() && ComLevel.equals("medium")) {

			 				System.out.print("Enter number of days: ");
			 				int days = input.nextInt();

			 				System.out.println("Enter the Approx mileage for our trip: ");
			 				int miles = input.nextInt();

			 				System.out.println("The sutiable car for you with " + pNo + " passengers: ");
			 				System.out.println("_________________________________________________________________");
			 				int cost = (days * s.getPrice());

							for ( int i  = 0 ; i < carlistL4.size() ; i++ ) {


							System.out.println("Car Make:  Car Model:   Duration:  Mileage Cost:   TotalCost: ");
							System.out.println(carlistL4.get(i).getMake() + "       " + carlistL4.get(i).getModel()+ "        " + days + "       " +MilesCount(miles) + "           " + cost);
						}

			 				System.out.print("Proceed to rent?( y/n ): ");
			 				String dec = input.next();

			 				if (dec.equals("y")) {
								System.out.println("Enter Your User name: ");
								String name = input.next();
								System.out.println("Enter your password");
								int pw =input.nextInt();
			 					System.out.println("Enter ID Number: ");
			 					int num = input.nextInt();
								Hashing(pw,num,name);
								System.out.println("______________________________Receipt______________________________");
								System.out.println("Name    ID    passengers    Comfortable Level    Duration     TotalCost");
								System.out.println(name + "      " + num + "         " + pNo + "         " + s.getRegNo() + "               " + days + "          "+cost);
								System.exit(0);


			 				}
							else if (dec.equals("n")) {
								System.out.println("Thanks,Have A Nice Day (:");
			 					System.exit(0);
							}
			 			     }else {
									vaild = false;
			 			     	break;
								}
			     }

					 if (vaild != true) {
						 System.out.println("We Are Sorry,we can not provide what you have requested .");

					 }





  	}

		public static double MilesCount(double miles ){
			double milesCal ,Mpg;
			double galPrice = 2.25;// a gallon serves Approx 25 miles
			milesCal=(miles/25);
			Mpg=milesCal*galPrice;
			return Mpg;
		}

		public static void Hashing(int pw, int id , String name){

		String passwordToHash = Integer.toString(pw);
		String idToHash = Integer.toString(id);
    String generatedPassword = null;
		String generatedId = null;

		try
		{

      MessageDigest md = MessageDigest.getInstance("MD5");



      md.update(passwordToHash.getBytes());
			md.update(idToHash.getBytes());

      // Get the hash's bytes
      byte[] bytes = md.digest();

      // This bytes[] has bytes in decimal format. Convert it to hexadecimal format
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < bytes.length; i++) {
        sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
      }

      // in hex format
      generatedPassword = sb.toString();
			generatedId = sb.toString();

    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }


		try {

		 FileWriter userfile = new FileWriter("usersInfo.txt");

		 userfile.write(generatedPassword);
		 userfile.write(generatedId);
		 userfile.write(name);

		 userfile.close();
	  }
	  catch (IOException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	 }

  }


}


class Car {
	private String make;
	private String model;
	private String regNo;
	private int price;
	private int capacity;

	public Car(String newMake, String newModel, String newRegNo,int newPrice, int newCapacity) {
		make = newMake;
		model = newModel;
		regNo = newRegNo;
		price = newPrice;
		capacity = newCapacity;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getCapacity() {
		return capacity;
	}

	public String getRegNo() {
		return regNo;
	}

	public int getPrice() {
		return price;
	}


}
