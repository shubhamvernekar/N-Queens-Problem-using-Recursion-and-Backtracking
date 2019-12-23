/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public int board[][];
    public int n;
    TestClass(int N){
        board = new int[N][N];
        n=N;
    }
    public boolean isAtacked(int x, int y){
        //Check for row and column
        for(int i=0;i<n;i++)
        if(board[x][i]==1 || board[i][y]==1)
        return true;
        
        //Check for digonal
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(x-y == i-j){
                    if(board[i][j]==1)
                    return true;
                }
                if(x+y == i+j){
                    if(board[i][j]==1)
                    return true;
                }
            }
        }
        return false;
    }
    public boolean findQueens(int N,int row){
        if(N==0){
            return true;
        }
        for(int j=0;j<n;j++){
            if(!isAtacked(row,j)){
                board[row][j] = 1;
                if(findQueens(N-1,row+1)){
                    return true;
                }else{
                    board[row][j] = 0;
                }
                
            }
        }
        return false;
        
    }
    
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
         */
    
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        TestClass obj = new TestClass(N);
        if(obj.findQueens(N,0)){
            System.out.println("Yes");
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    System.out.print(obj.board[i][j]+ " ");
                }
                System.out.println();
        }
        }else{
            System.out.println("NO");
        }

        s.close();
        // Write your code here

    }
}
