/*
A string s is a circular rotation of a string t if it matches when the characters
are circularly shifted by any number of positions; e.g., ACTGACG is a circular shift of
TGACGAC, and vice versa. Detecting this condition is important in the study of genomic
sequences. Write a program that checks whether two given strings s and t are circular
shifts of one another. Hint : The solution is a one-liner with indexOf(), length(), and
string concatenation.
*/

class exercise {
    private static boolean isCircular(String a, String b) {
	    return a.length() == b.length() && (a+a).contains(b);
    }


    public static void main (String[] args) {
        String a = args[0];
	      String b = args[1];
	      if (isCircular(a, b)) {
	        System.out.println("String : " + a + " and String : " + b + " are circular Strings.");
	      }
	      else {
	        System.out.println("String : " + a + " and String : " + b + " are not circular Strings.");
	      }
    }
}
