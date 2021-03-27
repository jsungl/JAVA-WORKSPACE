package workshop5;

public class Test05 {

	public static void main(String[] args) {

		String str = "LGcns";
		
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		for(int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i)))
				System.out.print(str.charAt(i));
		}
		System.out.println();
		for(int i = 0; i < str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i)))
				System.out.print(str.charAt(i));
		}
		
	}

}
