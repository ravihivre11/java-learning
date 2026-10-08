package Day6;
public class array1D {
    public static void main(String[] args){
    int[] marks ={80,90,78,67,78};
    int sum = 0;
    System.out.println(marks[0]);

    for(int i=0; i<marks.length; i++){
        System.out.println(marks[i]);
        sum += marks[i];
    }
    System.out.println("Sum of marks: "+sum);

    }
}
