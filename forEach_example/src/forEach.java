
public class forEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(int i=0; i<vect.length; i++) { // SINTAXE DE FOR
			System.out.println(vect[i]);
		}

		System.out.println("------------------------------");

		for(String obj : vect) { //  SINTAXE DE FOR EACH
			System.out.println(obj);
		}
		
	}

}
