package week_2;

import java.util.HashSet;

public class answer {

    //  The simplest solution revolves summing each possible pairs of numbers that can be formed with a given array and
    //  checking whether or not they sum up to `K`
    public static int solution_0(int[] arr, int K) {

        int pairs = 0;

        for (int i = 1; i < arr.length; i++) {
            // By making sure `j` will always be smaller than `i`, you avoid counting the same pairs twice
            for (int j = 0; j < i; j++) {
                if (arr[i] + arr[j] == K) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    // Let's just save each integer `a`'s complement to another array. Then we check if
    //  each complement is in the array.
    public static int solution_1(int[] arr, int K) {

        int pairs = 0;
        int length = arr.length;    //  This value is often used
        int[] complements = new int[length];    //  Complements list

        for (int i = 0; i < length; i++) {
            //  Each complement integer is stored in `complements`
            complements[i] = K - arr[i];
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (complements[i] == arr[j]) {
                    pairs++;
                }
            }
        }
        //  You divide by 2, since every pair is going to be counted twice!
        return pairs / 2;
    }


    //  The problem with the previous solution is that looking for complements takes exponential time, which means that
    //  it's not much better the our first solution. We can fix this by using a HashSet/Hashtable, because access time
    //  on hash structures are instant (theoretically, in practice it's a little slower than O(1)), so our overall
    //  solution is O(n).
    public static int solution_2(int[] arr, int K) {

        // Same code as before, but our `complements` array is now a hashset
        int pairs = 0;
        int length = arr.length;
        HashSet<Integer> complements = new HashSet<Integer>(length);
        //  Since we don't really need the index in our for loop anymore, we replace it with a foreach loop
        for (int num : arr) {
            complements.add(K - num);
        }

        //  If an integer in the argument array is in hashset, then it is another array element's complement.
        for (int complement : arr) {
            if (complements.contains(complement)) {
                pairs++;
            }
        }
        return pairs / 2;
    }

    //  Another potential solution would be to sort the array and then using binary search to search the array for the
    //  complements.

}
