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
