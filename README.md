# Multidimensional-Arrays-Java-Advanced-course-with-java-Software-University
Courses from my education Java advanced in @SoftUni
Problems for exercises: Multidimensional Arrays

1.	Fill the Matrix
Filling a matrix in the regular way (top to bottom and left to right) is boring. Write two methods that fill a matrix of size N x N in two different patterns.
2.	Matrix of Palindromes
Write a program to generate the following matrix of palindromes of 3 letters with r rows and c columns like the one in the examples below.
•	Rows define the first and the last letter: row 0 -> ‘a’, row 1 -> ‘b’, row 2 -> ‘c’, …
•	Columns + rows define the middle letter: 
o	column 0, row 0 -> ‘a’, column 1, row 0 -> ‘b’, column 2, row 0 -> ‘c’, …
o	column 0, row 1 -> ‘b’, column 1, row 1 -> ‘c’, column 2, row 1 -> ‘d’, …
Input
•	The numbers r and c stay in the first line at the input.
•	 r and c are integers in the range [1…26].
3.	Diagonal Difference
Write a program that finds the difference between the sums of the square matrix diagonals (absolute value).
Input
•	The first line holds a number n – the size of matrix.
•	The next n lines hold the values for every row – n numbers separated by a space.
4.	Maximal Sum
Write a program that reads a rectangular integer matrix of size N x M and finds in it the square 3 x 3 that has a maximal sum of its elements. 
Input
•	On the first line, you will receive the rows N and columns M. 
•	On the next N lines, you will receive each row with its elements.
Print the elements of the 3 x 3 square as a matrix, along with their sum.
5.	Matrix Shuffling
Write a program, which reads a string matrix from the console and performs certain operations with its elements. User input is provided in a similar way as in the problems above – first, you read the dimensions and then the data. 
Your program should then receive commands in the format: "swap row1 col1 row2c col2" where row1, row2, col1, col2 are coordinates in the matrix. For a command to be valid, it should start with the "swap" keyword along with four valid coordinates (no more, no less). You should swap the values at the given coordinates (cell [row1, col1] with cell [row2, col2]) and print the matrix at each step (this you'll be able to check if the operation was performed correctly). 
If the command is not valid (doesn't contain the keyword "swap", has fewer or more coordinates entered or the given coordinates do not exist), print "Invalid input!" and move on to the next command. Your program should finish when the string "END" is entered.
6.	String Matrix Rotation
You are given a sequence of text lines. Assume these text lines form a matrix of characters (pad the missing positions with spaces to build a rectangular matrix). Write a program to rotate the matrix by 90, 180, 270, 360,… degrees. Print the result at the console as a sequence of strings after receiving the "END" command.
Input
The input is read from the console:
•	The first line holds the command in the format "Rotate(X)" where X is the degrees of the requested rotation.
•	The next lines contain the lines of the matrix for rotation.
•	The input ends with the command "END".
The input data will always be valid and in the format described. There is no need to check it explicitly.
Output
Print at the console the rotated matrix as a sequence of text lines
7.	Crossfire 
You will receive two integers, which represent the dimensions of a matrix. Then, you must fill the matrix with increasing integers starting from 1, and continuing on every row, like this:
first row: 1, 2, 3, …, n
second row: n + 1, n + 2, n + 3, …, n + n
third row: 2 * n + 1, 2 * n + 2, …, 2 * n + n
You will also receive several commands in the form of 3 integers separated by a space. Those 3 integers will represent a row in the matrix, a column, and a radius. You must then destroy the cells, which correspond to those arguments cross-like.
Destroying a cell means that, that cell becomes completely nonexistent in the matrix. Destroying cells cross-like means that you form a cross figure with a center point - equal to the cell with coordinates – the given row and column, and lines with length equal to the given radius. See the examples for more info. 
The input ends when you receive the command "Nuke it from orbit". When that happens, you must print what has remained from the initial matrix.
Input
•	On the first line, you will receive the dimensions of the matrix. You must then fill the matrix according to those dimensions.
•	On the next several lines, you will begin receiving 3 integers separated by a single space, which represent the row, col, and radius. You must then destroy cells according to those coordinates.
•	When you receive the command "Nuke it from orbit" the input ends.
Output
•	The output is simple. You must print what is left from the matrix.
•	Every row must be printed on a new line and every column of a row - be separated by a space.
8.	The Heigan Dance
At last, level 80. And what do level eighties do? Go raiding. This is where you are now – trying not to be wiped by the famous dance boss, Heigan the Unclean. The fight is pretty straightforward - dance around the Plague Clouds and Eruptions, and you’ll be just fine.
Heigan’s chamber is a 15-by-15 two-dimensional array. The player always starts at the exact center. For each turn, Heigan uses a spell that hits a certain cell and the neighboring rows/columns. For example, if he hits (1,1), he also hits (0,0, 0,1, 0,2, 1,0 … 2,2). If the player’s current position is within the area of damage, the player tries to move. First, he tries to move up, if there’s damage/wall, he tries to move right, then down, then left. If he cannot move in any direction, because the cell is damaged or there is a wall, the player stays in place and takes the damage.
Plague cloud does 3500 damage when it hits, and 3500 damage the next turn. Then it expires. Eruption does 6000 damage when it hits. If a spell hits a p	layer that also has an active Plague Cloud from the previous turn, the cloud damage is applied first. Both Heigan and the player may die in the same turn. If Heigan is dead, the spell he would have cast is ignored.
The player always starts at 18500 hit points; Heigan starts at 3,000,000 hit points. Each turn, the player does damage to Heigan. The fight is over either when the player is killed, or Heigan is defeated.
Input
•	On the first line, you receive a floating-point number D – the damage done to Heigan each turn.
•	On the next several lines – you receive input in format "{spell} {row} {col} – {spell}" is either Cloud or Eruption.
Output
•	    On the first line  
o	If Heigan is defeated: "Heigan: Defeated!"
o	Else: "Heigan: {remaining}", where remaining is rounded to two digits after the decimal separator.
•	    On the second line:
o	If the player is killed: "Player: Killed by {spell}".
o	Else "Player: {remaining}".
•	    On the third line: "Final position: {row, col}" -> the last coordinates of the player.
9.	Reverse Matrix Diagonals 
You are given a matrix (2D array) of integers. You have to print the matrix diagonal but in reversed order. Print each diagonal on a new line.
Input
On the first line, single integer the number R of rows in the matrix. On each of the next R lines, C numbers are separated by single spaces. Note that R and C may have different values. 
Output
The output should consist of R lines, each consisting of exactly C characters, separated by spaces, representing the matrix diagonals reversed.


