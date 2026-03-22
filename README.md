# Assignment #1 — Recursion

Student: Yesmagzam Sultan  
Group: IT-2502  

Objective : 
This assignment focuses on understanding and applying recursion in Java.  
All problems are solved using recursion only (no loops allowed).

Project Structure
Each task is implemented in a separate class:

- Task1.java — Print digits
- Task2.java — Average of elements
- Task3.java — Prime check
- Task4.java — Factorial
- Task5.java — Fibonacci
- Task6.java — Power
- Task7.java — Reverse output
- Task8.java — Check digits in string
- Task9.java — Count characters
- Task10.java — GCD

# Part 1 — Numbers

## Task 1 — Print Digits

![Task 1 ](https://github.com/Sula-The-Light/AaDS/blob/main/Task1.png)

Here , i used a recursive function *printTsifry* to simplify the process of separating digits.
I've applied division (n / 10) to reduce the number and modulo (n % 10) to extract each digit.
This helped me avoid loops and print digits in the correct order.

## Task 2 — Average

![Task 2 ](https://github.com/Sula-The-Light/AaDS/blob/main/Task2.png)

I created another recursive function *sum* to find the total sum of the array.
This allowed me to avoid loops and reduce the problem step by step.
Then i calculated the average by dividing the result by the number of elements.

## Task 3 — Prime (1)

![Task 3 (1) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task3%20(1).png)

At this task , i had to use a recursive function *isPrime* to check divisibility.
The function increases the divisor step by step and stops when it faces a condition.
This approach makes checking all possible divisors without using loops simple.


## Task 3 - Prime (2)

![Task 3 (2) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task3%20(2).png)

It's just an example of a composite number


## Task 4 — Factorial

![Task 4 ](https://github.com/Sula-The-Light/AaDS/blob/main/Task%204.png)

Task 4 was an easy part , because I just implemented a recursive function *Fact* using the formula n! = n × (n-1)! and it took me a short time to write everything.
The base case ensures the recursion stops correctly.
This method reduces the complexity of repeated multiplication.


# Part 2 — Sequences

## Task 5 — Fibonacci (1)

![Task 5 (1) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task5%20(1).png)

This time , I'm about to create *Fibonacci Sequence* which is about to make a calculation where each value is calculated from previous ones.
This approach follows the definition of the *Sequence* and avoids manual iteration.


## Task 5 — Fibonacci (2)

![Task 5 (1) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task5%20(2).png)

This is just an example with another number


## Task 6 — Power

![Task 6](https://github.com/Sula-The-Light/AaDS/blob/main/Task6.png)


## Task 7 — Reverse

![Task 7](https://github.com/Sula-The-Light/AaDS/blob/main/Task7.png)


# Part 3 — Strings

## Task 8 — Check digits (1)

![Task 8 (1) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task8%20(1).png)


## Task 8 — Check digits (2)

![Task 8 (2) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task8%20(2).png)


## Task 9 — Length (1)

![Task 9 (1) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task9%20(1).png)


## Task 9 — Length (2)

![Task 9 (2) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task9%20(2).png)


## Task 10 — GCD (1)

![Task 10 (1) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task10%20(1).png)


## Task 10 — GCD (2)

![Task 10 (2) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task10%20(2).png)


## Conclusion
In this assignment, I learned how recursion works and how to apply it to different types of problems.  
I understood the importance of base cases and recursive calls.

---
