package week_1;

import java.util.Arrays;

public class reverse_array {


    //  Creating a new empty array of the same size and then going through the original array from the end to the start
    //  and populating the new array as you go. This solution is fast, since it just has to look at each element of
    //  the original array once.
    public static int[] reverse_0(int[] array) {
        int length = array.length;      //  Since we need this variable multiple times, store it in a variable
        int[] newArray = new int[length];   //  Initialize the new array
        //  Visit from the end to the start of the original matrix
        for (int i = 0; i < length; i++) {
            newArray[i] = array[length - 1 - i];
        }
        return newArray;
    }

    //  The first solution is fast, but we can do better: since you have to create a new empty array of the same size
    //  as your original array, your computer has to 'remember' two separate arrays of a size N. The way to prevent
    //  this is to only keep one single copy of the array in memory. That means that our algorithm will have to change.
    public static int[] reverse_1(int[] array) {
        int length = array.length;
        //  Since we want to only have one array throughout our algorithm, we'll use the swap operation to reverse our
        //  array. We'll swap the first element with the last one, the second element with the penultimate one, etc.
        //  That means that not only do we make our program more efficient by only requiring our computer to remember
        //  a single array, we make it faster needing only half the number of operations compared to our previous
        //  solution.
        for (int i = 0; i < (length / 2); i++) {
            int intBuffer = array[i];   //  Remember the element at array[i]
            array[i] = array[length - 1 - i];
            //  If we wrote array[i] down here, it'll take the update value of array[i], which is array[length - 1 -i]
            //  and it's not going to return our desired result
            array[length - 1 - i] = intBuffer;
        }
        //  Notice that we actually modify the original array given to us as an input. Depending on your needs, you might
        //  not want to do that, and instead want to create a clone of the array, and reverse and return the clone.
        //  In this case, since the problem doesn't say anything about this, we don't need to worry about that.
        return array;
    }
}
