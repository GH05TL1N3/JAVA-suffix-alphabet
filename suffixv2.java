public class suffixv2 {
	public static void main(String[] args) {
		
		String name = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		int i;
		
		System.out.println(name.length());
		
		for(i=0;i<=(name.length()-1)-26;i++){
			
			System.out.print(name.charAt(i));
			
			System.out.print(name.charAt(i+(name.length())-26));
			
			
		}
	}

}
