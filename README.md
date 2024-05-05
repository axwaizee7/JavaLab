# Java Lab Questions

1.  a. Write a java program to calculate area of a rectangle.

    b. Write a java program to calculate the area of circle.

---

2.  a. Write a java program to check even or odd.

    b. Write a java program to swap two numbers using third variable.

---

3.  a. write a java program to display even numbers between 1 to n.

    b. Write a java program to display grade of the student by entering 5 subjects marks and calculating percentage of marks with the following conditions:

    | Percentage | Grade |
    | :--------: | :---: |
    |    >80     |  A+   |
    |    >70     |   A   |
    |    >60     |  B+   |
    |    >50     |   B   |
    |    >40     |   C   |
    |    >35     |   D   |
    | otherwise  |   F   |

    _(Jan 19)_

---

4.  a. Write a java program to check whether given number is +ve, -ve or zero. _(Jan 23)_

    b. Write a java program to display biggest of three numbers using nested if else. _(Feb 6)_

---

5.  a. Write a java program to find factorial of a number. _(Feb 6)_

---

6.  a. Write a menu driven program to calculate addition, multiplication and division of 2 numbers and also find the remainder using java. _(Feb 7)_

---

7.  a. Suppose we are calculating weekly sale of a girl. If x is the number of products sold in a week her weekly salary is given by

                    { 4x + 100 for x < 40 }

        Salary  =   { 300 for x = 40 }

                    { 4.5x + 150 for x > 40 }

    Write a java program. _(Feb 9)_

---

8.  a. Write a java program to count the even numbers and odd numbers within the range of 1 to n. _(Feb 9)_

---

9.  a. Write a java program to find square root, and logarithm using inbuilt Math class function. _(Feb 9)_

    b. Write a java program to find $x^y$, and maximum of x and y using inbuilt Math class function. _(Feb 9)_

---

10. a. Write a java program to display multiplication table for n numbers of rows and columns as follows: _(Feb 13)_

        1   2   3   4   .   .   n
        2   4   6   8   
        3   6   9   12  
        4   8   12  16  
        .  
        .
        n
    b. Write a java program to find power of $2^n$. _(Feb 14)_


--- 

11. a. Write a program to find reverse of an integer number. _(Feb 20)_

---

12. a. Write a java program by defining a class Rectangle with 2 methods getdata() and rectArea() and instantiate with an object to find area of a Rectangle. _(Feb 21)_

---

13. a. Write a java program to define a class Rectangle to calculate area of a rectangle and use constructor. _(Feb 23)_

---

14. a. Write a java program by defining a class Arithmetic_operator with methods add(), multiplication(),
division() and subtraction() for two variables. _(Feb 27)_

---

15. a. Write a java program with class Employee
and its members emp_details() and salary(), name, emp_id, address, salary. Display the details and salary of three employee. _(Feb 27)_

---

16. a. Define a class Room with method area() and another class Bedroom with extending the feature of Room class, along with a method volume(). Calculate area volume of a room by performing simple single Inheritance. _(Feb 28)_

---

17. a. Write a java program to find biggest of two numbers by nesting of methods. _(March 1)_  

---

18. a. Write a java program to find the area of a square and rectangle by overloading constructor method. _(March 1)_

---

19. a. Write a java program to show the use of methods overriding. By defining a class super with method display() and a subclass sub with method display(). _(March 5)_

---

20. a. Write a java program to overload a method area for finding out area of a square, rectangle and circle. _(March 8)_

---

21. a. Define a class Employee with member variables employee_no, name, address and a constructor method and another class Worker with data members no_of_hours and a constructor method. Perform required inheritance and display employee workers details (atleast 3 workers details). _(March 12)_

    ```java
    class Employee{

    }

    class Worker extends Employee{

    }
    ```

---

22. a. Write a java program by defining an interface Area and two classes Rectangle and Circle to implement it for finding area of a Circle and a Rectangle. _(March 12)_

---

23. a. Write a program to show how the concept of multiple inheritance can be illustrated in java using interface. _(March 20)_

---

24. a. Write a program to show method overriding by defining a class Figure with method area(), constructor and a sub class Rectangle with another method area() for finding area of a rectangle. Override the method area() in Figure class. _(April 2)_

---

25. a. Sort an array in descending order.

    b. Read an array of n elements and calculate average of the elements.

---

26. a. Write a java program to display two dimensional multiplication table as follows:

          1   2   3   4   5   6   7   8   9  10
          2   4   6   8  10  12  14  16  18  20
          3   6   9  12  15  18  21  24  27  30
          4   8  12  16  20  24  28  32  36  40
          5  10  15  20  25  30  35  40  45  50
          6  12  18  24  30  36  42  48  54  60
          7  14  21  28  35  42  49  56  63  70
          8  16  24  32  40  48  56  64  72  80
          9  18  27  36  45  54  63  72  81  90
         10  20  30  40  50  60  70  80  90 100

---

27. a. Create the java packages as follows _(April 10)_

        pack1/                  pack2/
        |                       |
        |--- class A            |--- class X
        |--- class B            |--- class Y
        |--- pack3/             
        |    |
        |    |--- class E
        |    |--- class D
        
        