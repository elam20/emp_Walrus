# emp_Walrus
**Walrus**
Humans: Daniel Jung, Joshua Yagupsky, Ethan Lam; Ducks: Ralph, Quacker, Carl

# Tests Performed
**Linear Search**
- Records time start
- Selects a random target from the second half of the input array and then iterates through it to find the index
- Records time end
- Repeats for inputted # of trials
- Returns total elapsed time in milliseconds and # of times the array was accessed

**Binary Search**
- Records time start
- Selects a random target from the second half of the input array and then continuously eliminates half of the array until the index is found
- Records time end
- Repeats for inputted # of trials
- Returns total elapsed time in milliseconds and # of times the array was accessed (check notes.txt to see special algorithm!)

We then generated arrays of varying lengths, where each element in every array is greater than or equal to the one that came before it. This ensured that the arrays was sorted, which is a precondition for binary search. We then ran binary and linear search fifty thousand times per array and put the total elapsed times and array accesses in an output file.

# Results
| # of Elements  | LinSearch Time (ms) | LinSearch Array Accesses | BinSearch Time (ms) | BinSearch Array Accesses |
| ------------- | ------------- | ------------- | ------------- | ------------- |
| 10  | 5  | 390_225  | 11  | 150_001  |
| 100  | 9  | 3_712_944  | 3  | 229_781  |
| 1_000  | 36  | 37_461_123  | 6  | 384_560  |
| 10_000  | 690 | 375_163_776  | 11  | 554_949  |
| 100_000  | 4_481  | 3_751_236_450  | 7  | 718_575  |
| 1_000_000  | 86_633  | 37_542_272_548  | 21  | 884_799  |

# Conclusions
Our results show that although linear search and binary search are about the same speed for small arrays, for bigger arrays the differences are drastic. For an array with one million elements, linear search took over four thousand times as binary search to find elements in the array. It's important to note that this result may not be entirely accurate, since time intervals of less than one second are rounded down to zero, understating the total amount of time required. This is why we chose to also count array accesses, which are a better measure of algorithm speed. For an array of one million elements, linear searching required forty-two thousand times the number of array accesses as binary searching, demonstrating that our time measurements overstate the speed of linear search.

# Gallery Tour
**Discord Ducks**
- Range of times is given in results
- Various array sizes were used to test
- Did not count # of array accesses

**MumbleCore**
- Always looking for the last element in the array
- 10,000 trials were used to find meaningful difference in data
- REALLY nice graphical representations of data

**Consonants**
- Different sizes of arrays were tested
- Linsearch becomes more and more inefficient as the arrays get larger
- Took the highest values of time in order to represent the "worst-case scenario"
- Different computers seem to give different results - maybe look towards other means of measurement?

**Overall Takeaways / Improvements to be made**
- Improve testing scope with multiple array sizes
- Make sure that the data that we are collecting is significant - stray away from 0 millisecond values
- Add charts / maybe graphs to the README for clearer understanding
