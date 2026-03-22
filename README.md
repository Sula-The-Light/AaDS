# Assignment #1 — Recursion

Student: Yesmagzam Sultan  
Group: IT-2502  

Objective : 
This assignment focuses on understanding and applying recursion in Java.  
All problems are solved using recursion only (no loops allowed).

Project Structure
I have implemented each of my tasks in a separate classes:

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

Here , i used a recursive function *printTsifry* to simplify the process of separating digits. I've applied division (n / 10) to reduce the number and modulo (n % 10) to extract each digit. This helped me avoid loops and print digits in the correct order.

## Task 2 — Average

![Task 2 ](https://github.com/Sula-The-Light/AaDS/blob/main/Task2.png)

The *Average* Task was about to create another recursive function *sum* to find the total sum of the array. Line *mass[n - 1]* takes the last element and line *sum(mass, n - 1)* recursively calculates the sum of remaining elements , then i calculated the average by dividing the result by *n*.

## Task 3 — Prime (1)

![Task 3 (1) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task3%20(1).png)

At this problem , i had to add a recursive function *isPrime* to check divisibility. My lines:
*n % i == 0* checks if a divisor exists
*i * i > n* executes optimization to stop at √n
*i + 1* moves to next divisor
If no divisor is found before √n, the number is prime. The function increases the divisor step by step and stops when it faces a condition. This approach makes checking all possible divisors without using loops simple.


## Task 3 - Prime (2)

![Task 3 (2) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task3%20(2).png)

It's just an example of a composite number.


## Task 4 — Factorial

![Task 4 ](https://github.com/Sula-The-Light/AaDS/blob/main/Task%204.png)

The 4th task was the easiest one , because I just implemented a recursive function *Fact* using the formula *n! = n × (n-1)!* and it took me a short time to write everything. The base case ensures the recursion stops correctly. This method reduces the complexity of repeated multiplication.


# Part 2 — Sequences

## Task 5 — Fibonacci (1)

![Task 5 (1) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task5%20(1).png)

This time , I'm about to create *Fibonacci Sequence* which is about to make a calculation where each value is calculated from previous ones.
This line , *return fib(n - 1) + fib(n - 2)* , computes value using two previous results , which means the function breaks the problem into smaller Fibonacci values until reaching base cases (0 and 1). This approach follows the definition of the *Sequence* and avoids manual iteration.


## Task 5 — Fibonacci (2)

![Task 5 (1) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task5%20(2).png)

This is just an example with another number.


## Task 6 — Power

![Task 6](https://github.com/Sula-The-Light/AaDS/blob/main/Task6.png)

The aim of this task is to multiply the base number repeatedly. I used a recursive function *P(int a, int n)* to compute exponentiation and *return a * power(a, n - 1)* , which multiplies base number again and again 'till the base case is reached.


## Task 7 — Reverse

![Task 7](https://github.com/Sula-The-Light/AaDS/blob/main/Task7.png)

I've added a recursive function *revPrint(int n, Scanner sc)* to read and print values.
The key idea was to print after the recursive call, which automatically reverses the order.
This eliminates the need for additional arrays.


# Part 3 — Strings

## Task 8 — Check digits (1)

![Task 8 (1) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task8%20(1).png)

I created a recursive function *isTsifry(String s, int index)* to check each character. The function uses Character.isDigit() to simplify validation.
Recursion allows checking the string step by step.


## Task 8 — Check digits (2)

![Task 8 (2) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task8%20(2).png)

One more example

## Task 9 — Length (1)

![Task 9 (1) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task9%20(1).png)

I used a recursive function *Dlina(String s)* and *substring()* to reduce the string size. Each recursive call removes one character and adds 1 to the result. This approach replaces iteration completely.

## Task 9 — Length (2)

![Task 9 (2) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task9%20(2).png)

Yet another sample

## Task 10 — GCD (1)

![Task 10 (1) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task10%20(1).png)

I implemented the Euclidean algorithm using recursion in *GCD(int a, int b)*. The function repeatedly reduces the problem using modulo operation. This method is efficient and avoids complex calculations.

## Task 10 — GCD (2)

![Task 10 (2) ](https://github.com/Sula-The-Light/AaDS/blob/main/Task10%20(2).png)

Example with another value

## Conclusion
In this assignment, I learned how recursion works and how to apply it to different types of problems. I understood the importance of base cases and recursive calls.

---
