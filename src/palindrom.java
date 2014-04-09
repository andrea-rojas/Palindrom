
public class palindrom {
	
	public static String filter(String input){
		String result = input;
		int inputHalfLength = input.length()/2; //it's works for par and impar lenghts
		int inputLength = input.length();
		int i = 0;
		
		for(i=0;i<inputHalfLength;i++){
			if (input.charAt(i) != input.charAt(inputLength-1-i)){
				return "";
			}
		}
		return result;
	}

}
