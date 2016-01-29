
public class Safflix {
	public static void main(String[] args) {
		
		String name = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		int i;
		int big=0;
		int small=26;
		
		System.out.println(name.length());
		
		for(i=1;i<=26;i++){
			
			
			System.out.print(name.charAt(big));
			
			System.out.print(name.charAt(small));
			
			big++;
			small++;
			
		}
	}

}
