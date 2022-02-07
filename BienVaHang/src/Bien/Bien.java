package Bien;

public class Bien {
			
		static double f = 23.3;	//bien static
		double c = 10.3f;	//bien instance
		
		
		public void sum() {
			float d = 20.5f;	//bien local
			double sum = c + d + f;
			System.out.println("Tong cua c va d va f la" +sum);
		}
	
	public static void main(String[] args) {
		Bien var = new Bien();
		int a = 10;
		short b = 731;
		
		double tong = a + b + f ;
		System.out.println("Tong cua a va b va f la :" + tong );
		var.sum();
	
		
	}

}
