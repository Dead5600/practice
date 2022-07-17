package practice;

public class Duplicate {

	public static void main(String[] args) {
		
		
		String s = "ABACADBAXMXADM";
		
		StringBuffer sb = new StringBuffer("");
		
		for(int i =0; i<=s.length();i++) {
			
			if(s.charAt(i)==s.charAt(i+1)) {}
			
				sb.append(s.charAt(i));
				
				 s = s.replaceAll(Character.toString(s.charAt(i)), "");
				
				i = -1;
				 System.out.print(s+" ");
			if(s.length() == 0)
				break;
		}
	
		System.out.println("\n\n"+sb);

	}

}
