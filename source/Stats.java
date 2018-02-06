import java.io.*;
import java.util.*;

public class Stats
{
    public static void main(String[] args)
    {
	Collection<Double> numbers = new HashSet<Double>();
	File in = new File(args[0]);
	try {
	    FileReader fr = new FileReader(in);
	    BufferedReader br = new BufferedReader(fr);
	    String s = null;
	    while ((s = br.readLine()) != null)
		numbers.add(Double.parseDouble(s));
	}
	catch(IOException ex) {
	}
	int N = numbers.size();
	double sum = 0.0;
	for (double x : numbers)
	    sum += x;
	double mean = sum/N;
	sum = 0.0;
	for (double x : numbers)
	    sum += (x - mean)*(x - mean);
	double std = Math.sqrt(sum/(N-1));
	System.out.printf("Mean: %.2f\n", mean);
	System.out.printf("Std dev: %.2f\n", std);
    }
}
