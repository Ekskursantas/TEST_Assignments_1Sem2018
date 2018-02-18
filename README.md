# TEST_GetStartedExercise_Triangles
I. Design of test cases

_Make a set of test cases(i.e. specific sets of data) that will adequately test this program:_

_The program reads three integer values from an input dialog. The three values represent the lengths of the sides of a triangle. The program displays a message that states whether the triangle is scalene (no equal sides), isosceles (two sides are equal), or equilateral (all sides are equal)._

:white_check_mark: Step 1: Design test cases (on paper) for both successful and unsuccessful scenarios.

| TEST CASE|       INPUT      |          EXPECTED        |          ACTUAL          |         STATUS           |
|----------|------------------|--------------------------|--------------------------|--------------------------|
|    1     |      7,10,5      |          scalene         |          scalene         |         passed           |
|    2     |      7,5,7       |          isosceles       |         isosceles        |         passed           |
|    3     |      7,7,7       |          equilateral     |        equilateral       |         passed           |
|    4     |   1,2,"hello"    |          invalid         |       invalid : NaN      |         passed           |
|    5     |       1,2        |          invalid         |   invalid : undefined    |         passed           |
|    6     |       1,0,2      |          invalid         | invalid : side length 0  |         passed           |
|    7     |       1,2,3      |          invalid         | invalid : no triangle    |         passed           |

:white_check_mark: Step 2: Design and implement the Triangle program in a programming language (e.g. Java or C#)
  - you don't have to write unit tests, but you may do so :)
  - No need for a nice GUI, just console app is fine


 #### SETUP:
 `git clone https://github.com/cph-cs241/TEST_GetStartedExercise_Triangles.git` -> clone the project

 #### RUN:   
 `node index x y z` -> x, y and z represents the sides length of the triangle

 :white_check_mark: Bring the code next time

 :white_check_mark: Have an IDE installed on your computer

 :white_check_mark: Read Black chap. 3
