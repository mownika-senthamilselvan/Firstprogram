package Mountblue;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class gridchallenge {
    public static void main(String[] args) {
        List<String> inputList= Arrays.asList("abc", "def", "aaa");
        String result=result(inputList);
        System.out.println(result);
    }

    public static String result(List<String> grid){
        int n=grid.size();
        char[][] grid2d=new char[n][];

        //Convert the list to 2d array
        for(int i=0;i<n;i++){
            char[] row=grid.get(i).toCharArray();
       // Arrange the row in non-descending order
            Arrays.sort(row);
            grid2d[i]=row;
        }

        for(int j=0;j<grid2d[0].length;j++){
            for(int i=0;i<n-1;i++){
                if(grid2d[i][j]>grid2d[i+1][j]){
                    return ("NO");
                }
            }
        }

        return ("YES");

    }
}


