package week_3;

public class answer {

    // The problem should immediately make you think of binary search, where the array is composed of numbers from 1 to
    // 100. Since at every step, binary search divides our answer 'space' by two, that means that it can cover 2^K values,
    // where K is the number of iterations of the binary search. Since 2^7 is the first power of two whose value is
    // larger or equal to 100, that means that worst case scenario, it will take 7 tries for you to find the correct
    // number. So no, you shouldn't pparticipate. Here's the algorithm for the binary search.
    public static int answer_0(int[] arr, int low, int high, int val) {
        if (high >= low) {

            int mid = low + (high - 1) / 2;

            // Check whether or not the value in the middle is equal to the value we're looking for
            if (arr[mid] == val) {
                return mid;
            }

            // If it's larger than our value, then we look for it in the left half of the array
            else if (arr[mid] > val) {
                return answer_0(arr, low, mid - 1, val);

                // If it's smaller than our value, then look for it in the right half of the array
            } else if (arr[mid] < val) {
                return answer_0(arr, mid + 1, high, val);
            }
        } else {
            // This is our error code
            return -1;
        }

    }

}
