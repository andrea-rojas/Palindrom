import java.util.Arrays;


public class palindrom {
	
	public static String filter(String input){
	    String[] inputInWords = input.split(" ");
	    String[] outputInWords = new String[inputInWords.length];
	    int i = 0;
	    
	    for (i=0;i<inputInWords.length;i++){
	    	outputInWords[i] = checkPalindrom(inputInWords[i]);	    		    	    
	    }
	    return join(outputInWords, " ");
	}

	private static String checkPalindrom(String input) {
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
	
	private static String join(String input[], String join) {
    StringBuilder sb = new StringBuilder();
    int i;
    
    for (i = 0; i < input.length - 1; i++) {
    	sb.append(input[i] + join);
    }      
    return sb.toString() + input[i];
    }
	
}
