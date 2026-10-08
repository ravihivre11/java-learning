package Day6;

public class array2D {
    public static void main(String[] args){
        int [][] data = {
            {23,24,25},
            {26,27,28},
            {29,30,31}
        };
        for(int i=0 ; i< data.length ; i++){
            for(int j=0; j<data[i].length ; j++){
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

}
