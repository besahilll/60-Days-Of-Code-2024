class Compute{ 
   static int compare(Integer a, Integer b) {
        int setBitsA = Integer.bitCount(a);
        int setBitsB = Integer.bitCount(b);

        if (setBitsA != setBitsB) {
            return Integer.compare(setBitsB, setBitsA);
        }
        else {
            return 0;
        }
    }

    static void sortBySetBitCount(Integer arr[], int n){
        Arrays.sort(arr,Compute :: compare);
    } 
}