
public class Task1 {

	public Integer lengthOfLastWord(String str) {
		// TODO Auto-generated method stub
		int lengthOfLastWord = 0;
		 
        /* String a is 'final'-- can not be modified
           So, create a copy and trim the spaces from
           both sides */
        String x = str.trim();
 
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ')
            	lengthOfLastWord = 0;
            else
            	lengthOfLastWord++;
        }
 
        return lengthOfLastWord;
		
	}

}
