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
**Linear Search**


**Binary Search**


# Conclusions


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
