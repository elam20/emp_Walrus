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

We then generated an array one million elements long, where each element is greater than or equal to the one that came before it. This ensured that the array was sorted, which is a precondition for binary search. We then ran binary and linear search fifty thousand times and put the total elapsed times and array accesses in an output file.

# Results
**Linear Search**
It took linear search a total time of 106858 milliseconds, or over a minute and a half, to search for elements near the end of the array. Since there were 50000 trials, this means it took ~2 milliseconds on average per search. The linear search algorithm had to access the array 37504597986 times, or roughly 750,000 times on average per search.

**Binary Search**
It took linear search a total time of 38 milliseconds to search for elements near the end of the array. The linear search algorithm had to access the array 947579 times, or roughly 19 times on average per search.

# Conclusions
Given a sorted array and an element to search in it, using binary search will almost always be orders of magnitude faster than simply linear searching. The reason for this is simple. If linear search makes an incorrect guess, this only rules out one element. However, if binary search makes an incorrect guess, this rules out roughly half of the array.

We may be slightly underestimating the time for binary search, since if each individual round of searching takes less than a millisecond, this time will not be counted in our elapsed time, as currentTimeMillis() returns a long integer, not a floating-point number. However, the array accesses tell the same story as the elapsed time, so this doesn't affect our conclusions.
