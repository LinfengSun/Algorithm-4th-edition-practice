import java.util.*;
import java.io.*;

class Evaluate {
    public static void main (String[] args) {
	Stack<Double> val = new Stack<Double>();
	Stack<String> opr = new Stack<String>();

	Console c = System.console();
	String equation = c.readLine("Enter an Equation: ");
	String[] str = equation.split("\\s+");
	for (String s : str) {
	    System.out.println(s);
	}
	for (String s : str) {
	    if (s.equals("(")) ;
	    else if (s.equals("+")) opr.push(s);
	    else if (s.equals("-")) opr.push(s);
	    else if (s.equals("*")) opr.push(s);
	    else if (s.equals("/")) opr.push(s);
	    else if (s.equals("sqrt")) opr.push(s);
	    // Pop, evaluate, and push result if token is ")".
	    else if (s.equals(")")) {
		    String op = opr.pop();
		    double v = val.pop();
		    if (op.equals("+")) v = val.pop() + v;
		    else if (op.equals("-")) v = val.pop() - v;
		    else if (op.equals("*")) v = val.pop() * v;
		    else if (op.equals("/")) v = val.pop() / v;
		    else if (op.equals("sqrt")) v = Math.sqrt(v);
		    val.push(v);
		}
	    // Token not operator or paren: push double value.
	    else val.push(Double.parseDouble(s));
	}
	System.out.println(val.pop());
    }
}
