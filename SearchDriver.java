//NOTE: The first command line argument is the number of trials.
//You may wish to redirect output to the output file using >.
public class SearchDriver{
  /*Augmented search methods : Returns a two-element array of longs, the first is the elapsed milliseconds,
  the second is the number of array accesses. Looks for an element in the second half of the array as many times as you want. */
  public static long[] augBinSearch(Comparable[] a, long trials){
    //Initialize variables
    Comparable target;
    long iTime = 0;
    long fTime = 0;
    long eTime = 0;
    long index = 0;
    long accesses = 0;
    int[] indices = binFill(a.length);
    //Calculate initial time, run algorithm, calculate final time, take difference for elapsed time
    for (int i = 0; i < trials; i++) {
      target = a[(int) ((Math.random() * a.length / 2.0) + a.length / 2.0)];
      iTime = System.currentTimeMillis();
      index = BinSearch.binSearch(a, target);
      fTime = System.currentTimeMillis();
      //Elapsed time for a round is just the difference between final and initial time, plus one to account for rounding
      eTime += fTime - iTime;
      //
      accesses += indices[i];
    }
    long[] ret = {eTime, accesses};
    return ret;
  }
  public static long[] augLinSearch(Comparable[] a, long trials){
    //Initialize variables
    Comparable target;
    long iTime = 0;
    long fTime = 0;
    long eTime = 0;
    long index = 0;
    long accesses = 0;
    //Elapsed time for a round is just the difference between final and initial time, plus one to account for rounding
    for (int i = 0; i < trials; i++) {
      target = a[(int) ((Math.random() * a.length / 2.0) + a.length / 2.0)];
      iTime = System.currentTimeMillis();
      index = LinSearch.linSearch(a, target);
      fTime = System.currentTimeMillis();
      //Elapsed time for a round is just the difference between final and initial time
      eTime += fTime - iTime;
      //The number of array accesses in a linear search is just the position of the element plus one.
      accesses += index + 1;
    }
    long[] ret = {eTime, accesses};
    return ret;
  }
  /*binFill: Creates an array of a given size, fills each element of the array with how many array accesses it would take to get there using binary search*/
  public static int[] binFill(int size){
  	return binFillHelper(new int[size], 0, size-1, 1);
  }
  private static int[] binFillHelper(int[] a, int lo, int hi, int val){
  	int m = (lo + hi) / 2;
  	if (hi >= lo){
  		a[m] = val;
  		binFillHelper(a, lo, m-1, val+1);
  		binFillHelper(a,m+1,hi, val+1);
  	}
  	return a;
  }
	public static void main(String[] args) {
    long numTrials = Long.parseLong(args[0]);
    Integer[] myArr = new Integer[1_000_000];
    //Generates a new increasing array
    myArr[0] = 0;
    for(int i = 1; i < myArr.length; i++){
      myArr[i] = (int) (Math.random()*(2)+myArr[i-1]);
    }
    //Race of algorithms
    long[] lins = augLinSearch(myArr, numTrials);
    long[] bins = augBinSearch(myArr, numTrials);
    System.out.println("RACE OF THE ALGORITHMS: " + numTrials + " TOTAL TRIALS");
    System.out.println();
    System.out.println("Linear search time: " + lins[0] + " milliseconds.");
    System.out.println("Linear search accesses: " + lins[1] + " accesses.");
    System.out.println("Binary search time: " + bins[0] + " milliseconds.");
    System.out.println("Binary search accesses: " + bins[1] + " accesses.");
	}
}
