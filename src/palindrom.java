import java.util.Arrays;


public class palindrom {
	
	public static String filter(String input){
	    input = deleteSpaces(input);
	    String[] inputInWords = input.split(" ");
	    String[] outputInWords = new String[inputInWords.length];
	    String outputInString = null;
	    int i = 0;
	    
	    for (i=0;i<inputInWords.length;i++){
	    	outputInWords[i] = checkPalindrom(inputInWords[i]);	    		    	    
	    }
	    outputInString = join(outputInWords, " ");
	    outputInString = deleteSpaces(outputInString);
	    return (outputInString);
	}

	private static String checkPalindrom(String input) {
		int inputHalfLength = input.length()/2; //it's works for par and impar lenghts
		int inputLength = input.length();
		int i = 0;
		
		for(i=0;i<inputHalfLength;i++){
			if (input.charAt(i) != input.charAt(inputLength-1-i)){
				return "";
			}
		}
		return input;
	}
	
	private static String deleteSpaces(String input) {
	    input = input.trim();
	    input = input.replaceAll("\\s+"," ");
	    return input;
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
