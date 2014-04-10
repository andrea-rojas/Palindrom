import java.util.Arrays;


public class palindrom {
	
	public static String filterPalindromWords(String input){
	    
		input = deleteSpaces(input);
	    String[] inputInArray = input.split(" ");

	    String[] outputInArray = new String[inputInArray.length];
	    String outputInString = null;
	    int i = 0;
	    
	    for (i=0;i<inputInArray.length;i++){
	    	outputInArray[i] = checkPalindrom(inputInArray[i]);	    		    	    
	    }
	    
	    outputInString = joinArrayInString(outputInArray, " ");
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
	
	private static String joinArrayInString(String input[], String join) {
    StringBuilder result = new StringBuilder();
    int i;
    
    for (i = 0; i < input.length - 1; i++) {
    	result.append(input[i] + join);
    }      
    return result.toString() + input[i];
    }
	
}
