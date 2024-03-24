# Big O: Time and Space Complexity.

Big O is the notation used to describe the complexity of systems.

Here is a list of common complixities in order of growing maginitude with an example. There are more specific examples in the containing section.

* Constant Time O(1): This is some that takes the same amount of time regardless of the size of the input. E.G. `array.length / 5`
* Logarithmic O(log(N)): These algorithms usually split the input size (N) in half over and over again until we get to some result. E.G. Binary Search which looks at the middle element, splits, repeats.
* Linear O(N): is any algorithm that grows with input size (N). E.G. Usually anything with a single `for` loop needs this. As we need to do some calculation of every element.
* Lineararithmic O(N log(N)): For these algorithms we usually need to do a divide and conquer for each element. Several sorting algorithms are like this because they can basically use binary search for each element.
* Quadratic O(N^2): means that for every input in (N) that input will also have to look at all other elements of N. A `for` loop in a `for` loop is an common sign of this.
* Exponential O(c^N): programs that need to create multiple stack calls per input size. E.G. Simple fibbonacci function that is needs to make 2 recursive calls for each element to calculate the N element.
* Factorial O(N!): these algorithms generally consisist of generating all permutations of a set or partitions.  


## TODO
- Make a flash card game for people to play and learn more about complexity.

## References
- [Cracking The Cooding Interview](https://www.crackingthecodinginterview.com)
- [Wikipedia Big(O)][https://en.wikipedia.org/wiki/Big_O_notation]