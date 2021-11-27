# Programming Problem #5 - Twisted
**Filename:** twisted.cpp, twisted.java, twisted.cs, or twisted.py

### Description
Consider a sequence of uppercase alphabetic characters (A - Z). The sequence is said to have a "constant step" if the distance between adjacent characters in the sequence is the same. For example, the distance between A and B is 1, D and F is 2, P and V is 6, Z and C is 3, etc. Note that "wraparound" from Z to A is defined. The following sequences have a "constant step".

- ACEG... has a step = 2
- AZYX... has a step = 25

Two or more sequences are said to the "twisted" if their adjacent elements are separated by exactly one element of each of the other sequences. For example, the following sequences are twisted:

- AQBRCSDT... has 2 twisted sequences:
	- ABCD... is sequence 1 with a step = 1
	- QRST... is a sequence 2 with a step = 1
- AZTAYRAXP... has 3 twisted sequences:
	- AAA... is sequence 1 with a step = 0
	- ZYX... is sequence 2 with step = 25
	- TRP... is sequence 3 with step = 24

After reading a string of 12 characters, evaluate the input and produce the next 12 characters. Remember:

- Two or three sequences may be "twisted" together in the input string
- All component sequences have a constant step with "wraparound" properties

### Input

There will be one string with 12 characters.

### Output

Print the next 12 characters of the twisted sequences

#### Test Case #1
**Sample Input:**
AZTAYRAXPAWN

**Sample Output:**
AVLAUJATHASF

#### Test Case #2
**Sample Input:**
XXYHZRABBLCV

**Sample Output:**
DFEPFZGJHTID