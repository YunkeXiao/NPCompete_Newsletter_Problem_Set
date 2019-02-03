###Cupid's Quest
You are the Cupid and one of your main responsibility is to matchmake as many couples as possible.
However, you must be diligent in your matching, as each person is represented by an __integer__ and two people can only 
fall in love if the sum of their integers is equal to a number __K__. 
 
Your function will be given an array of integers and an integer __K__ as arguments. Write a function that returns 
the number of pairs of integers in the array whose sum is equal to __K__, the maximum number of couples you can form 
within a population.  

Remember, each person is unique in the eyes of the Cupid, so every person is represented by a unique integer.

```javascript
({1, 2, 3, 4}, 7) -> 1
({1, 2, 3, 4}, 5) -> 2
({0, 1, 2, 4, 5, 6}, 6) -> 3
```