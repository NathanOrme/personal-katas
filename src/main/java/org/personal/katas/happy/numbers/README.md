# Happy Number Kata

<!-- TOC -->

* [Happy Number Kata](#happy-number-kata)
    * [What's a Happy Number?](#whats-a-happy-number)
        * [Example Happy Number](#example-happy-number)
            * [Happy numbers between 1 and 100](#happy-numbers-between-1-and-100)
            * [Happy numbers between 101 and 500](#happy-numbers-between-101-and-500)
            * [Happy numbers between 501 and 1000](#happy-numbers-between-501-and-1000)
    * [What's the task?](#whats-the-task)
        * [Minimum requirements](#minimum-requirements)
        * [Optional Extras](#optional-extras)
    * [Things to consider](#things-to-consider)

<!-- TOC -->

## What's a Happy Number?

From: [Numeracy Literacy](https://numeracyliteracy.com/happy-and-unhappy-numbers/)

A number (positive integer) is called a happy number when it is replaced by the sum of the squares of its digits on a
repeated basis until the sum of the squares of its digits equals to 1. The numbers for which the process of summing up
of the squares of its digits ends in 1 are happy numbers. On the other hand, numbers that don’t end in 1 are called
unhappy or sad numbers.

### Example Happy Number

23 is a happy number as:

23 = 2^2 + 3^2 = 4 + 9 = 13 (sum of the squares of its digits)

13 = 1^2 + 3^2 = 1 + 9 = 10 (sum of the squares of the digits)

10 = 1^2 + 0^2 = 1 (sum of the squares of the digits)

#### Happy numbers between 1 and 100

1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100

#### Happy numbers between 101 and 500

103, 109, 129, 130, 133, 139, 167, 176, 188, 190, 192, 193, 203, 208, 219, 226, 230, 236, 239, 262, 263, 280, 291, 293,
301, 302, 310, 313, 319, 320, 326, 329, 331, 338, 356, 362, 365, 367, 368, 376, 379, 383, 386, 391, 392, 397, 404, 409,
440, 446, 464, 469, 478, 487, 490, 496

#### Happy numbers between 501 and 1000

536, 556, 563, 565, 566, 608, 617, 622, 623, 632, 635, 637, 638, 644, 649, 653, 655, 656, 665, 671, 673, 680, 683, 694,
700, 709, 716, 736, 739, 748, 761, 763, 784, 790, 793, 802, 806, 818, 820, 833, 836, 847, 860, 863, 874, 881, 888, 899,
901, 904, 907, 910, 912, 913, 921, 923, 931, 932, 937, 940, 946, 964, 970, 973, 989, 998, 1000

## What's the task?

### Minimum requirements

- Write a function that takes a numerical value as an input, and prints out whether it's a happy number or not.
- Ensure that tests are written to cover the code coverage
- To be written in TDD (Test Driven Development)

### Optional Extras

- Change the code so that it loops through all numbers up to the input to output which numbers are happy numbers and
  which aren't
  ```
  Example output:
  For the number 28, the following happy number numbers were found: 1, 7, 10, 13, 19, 23, 28
  ```
  
## Things to consider

- Use Git and commit code as & when - don't do a "big bang" push for your code
- Don't over-engineer the code
