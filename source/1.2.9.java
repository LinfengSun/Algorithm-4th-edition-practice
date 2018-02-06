/*
Instrument BinarySearch (page 47) to use a Counter to count the total number
of keys examined during all searches and then print the total after all searches are complete.
Hint : Create a Counter in main() and pass it as an argument to rank().
*/

import java.util.Arrays;
public class BinarySearch
{
  public static int rank(int key, int[] a, Counter counter)
  { // Array must be sorted.
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi)
    { // Key is in a[lo..hi] or not present.
      int mid = lo + (hi - lo) / 2;
      counter.increment();
      if (key < a[mid]) hi = mid - 1;
      else if (key > a[mid]) lo = mid + 1;
      else return mid;
    }
    return -1;
  }
  
  public static void main(String[] args)
  {
    int[] whitelist = In.readInts(args[0]);
    Counter counter = new Counter(keys);
    Arrays.sort(whitelist);
    while (!StdIn.isEmpty())
    { // Read key, print if not in whitelist.
      int key = StdIn.readInt();
      if (rank(key, whitelist, counter) < 0)
      StdOut.println(key);
      StdOut.println(counter);
    }
  }
}
