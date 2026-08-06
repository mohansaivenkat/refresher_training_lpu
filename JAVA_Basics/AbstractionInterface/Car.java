package AbstractionInterface;

abstract class Car {
	boolean isSedan;
	int  seats;
	
	  Car(boolean isSedan, int seats) {
	        this.isSedan = isSedan;
	        this.seats = seats;
	    }
	  
	  abstract int getMileage();
	  
	 void getisSedan() {
		  System.out.println(isSedan);
	  }
	  
	  void getSeats() {
		  System.out.println(seats);
	  }
	  
}

