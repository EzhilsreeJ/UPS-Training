import java.util.*;
public class TwoDim {
    static Scanner sc= new Scanner(System.in);
    static int[][] createArray(int row,int col){
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    static int[][] addMatrix(int row,int col,int[][] arr1,int[][] arr2){
        int[][] res=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
        System.out.print("Please Enter size of row: ");
        int row=sc.nextInt();
        System.out.print("Please Enter size of col:");
        int col=sc.nextInt();
        System.out.println("Enter values of First matrix: ");
        int[][] arr1= createArray(row,col);
        System.out.println("Enter values of second matrix: ");
        int[][] arr2= createArray(row,col);
        int[][] res=addMatrix(row,col,arr1,arr2);
        System.out.println("Sum of Two Matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }


        
    }
    
    
}
