/*
Using our implementation of Date as a model, develop an implementation of Transaction.
*/

public class exercise {

    private final String who;
    private final Date when;
    private final double amount;

    public exercise(String who, Date when, double amount) {
	this.who = who;
	this.when = when;
	this.amount = amount;
    }//constructor

    public String who() {
	return who;
    }

    public Date when() {
	return when;
    }

    public double amount() {
	return amount;
    }

    public String toString() {
	return who + " spent " + amount + " on " + when + ".";
    }

    public static void main(String[] args) {
	Date date = new Date(02, 06, 2018);
	exercise t = new exercise("Ethan", date, 50.00);
	System.out.println(t);
    }//test main
}
