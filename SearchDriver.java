public class SearchDriver{
  /*Augmented search methods : Returns a two-element array of longs, the first is the elapsed milliseconds,
  the second is the number of array accesses. Be sure to always search for an element actually in the array!*/
  /*public static long[] augBinSearch(Comparable[] a, Comparable target){

  }*/
  public static long[] augLinSearch(Comparable[] a, Comparable target){
    //Calculate initial time, run algorithm, calculate final time, take difference for elapsed time
    long iTime = System.currentTimeMillis();
    int i = LinSearch.linSearch(a, target);
    long fTime = System.currentTimeMillis();
    long eTime = fTime-iTime;
    //The number of array accesses in a linear search is just the position of the element plus one.
    long[] ret = {eTime, i+1};
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
    //Brief testing
    /*Integer[] myArr = new Integer[100000000];
    myArr[0] = 0;
    for(int i = 1; i < myArr.length; i++){
      myArr[i] = (int) (Math.random()*(2)+myArr[i-1]);
    }
    long[] outs = augLinSearch(myArr,myArr[myArr.length-1]);
    System.out.println("Elapsed time: " + outs[0] + " milliseconds");
    System.out.println("Number of accesses: " + outs[1]);*/
    int[] bob = binFill(25);
    for(int i : bob){
    	System.out.println(i);
    }
	}
}
