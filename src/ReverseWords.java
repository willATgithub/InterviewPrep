

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String message = "find you will pain only go you recordings security the into if";
          //System.out.println(message);
		  String reversed = reverseWords(message);
		  System.out.println(message);
		  System.out.println(reversed);
		  // returns: "if into the security recordings you go only pain will you find"
	}

    private static void reverseWord(char[] charMessage, int start, int length)
    {
		//System.out.println("<" + String.valueOf(Arrays.copyOfRange(charMessage, start, start + length)) + ">");

		int end = start + length - 1;
		int index = end;
		//System.out.println("start = " + start + ", end = " + end + ", length = " + length + ", index = " + index);
		for (int i = start; index > i ; i++) {
			//System.out.println(charMessage[i] + ", start = " + start + ", length = " + length);
			char temp = charMessage[index];
			charMessage[index] = charMessage[i];
			charMessage[i] = temp;
			index--;
		}
    }
    
	private static String reverseWords(String message) {
		char[] charMessage = message.toCharArray();
		//Node list = null;
		//System.out.println(String.valueOf(charMessage));
        reverseWord(charMessage,0,charMessage.length);
		//System.out.println(String.valueOf(charMessage)); 
		int start = 0;
		for (int i = 0; i < charMessage.length; i++){
			if (charMessage[i] == ' ') {
				reverseWord(charMessage,start,i-start);
				start = i + 1;
			}
		}
		reverseWord(charMessage,start,charMessage.length - start);
		//System.out.println(String.valueOf(charMessage));
		//0 1 2 3 4 5 6 7 8 9
		//a b c d e f g h i j
		//j b c d e f g h i a
		return(String.valueOf(charMessage));
	}

}
