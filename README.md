# N-Queens-Problem-using-Recursion-and-Backtracking

The N Queen is the problem of placing N chess queens on an N×N chessboard so that no two queens attack each other. For example, following is a solution for 4 Queen problem.

![chess image](https://media.geeksforgeeks.org/wp-content/uploads/ratinmaze_filled11-1-e1518086835222.png)

Given a chess board having NxN cells, you need to place N queens on the board in such a way that no queen attacks any other queen.

Input:
The only line of input consists of a single integer denoting N.

Output:
If it is possible to place all the N queens in such a way that no queen attacks another queen, then print "YES" (without quotes) in first line, then print N lines having N integers. The integer in i'th line and j'th column will denote the cell (i,j) of the board and should be 1 if a queen is placed at (i,j) otherwise 0. If there are more than way of placing queens print any of them.

If it is not possible to place all N queens in the desired way, then print "NO" (without quotes).

Constraints:
1<= N <= 10
