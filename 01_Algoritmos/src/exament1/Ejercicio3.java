package exament1;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kilometroA = 70;
		int kilometroB = 150;
		
		do {
			kilometroA++;
			kilometroB--;
		}while(kilometroA != kilometroB);
		
		System.out.println("Kilometro A " + kilometroA);
		System.out.println("Kilometro B " + kilometroB);
		
		//Matematicamente con formula
		
		System.out.println((kilometroA + kilometroB)/2);
		
	}

}
