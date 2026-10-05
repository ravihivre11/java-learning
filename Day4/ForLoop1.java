package Day4;

public class ForLoop1 {
    public static void main(String[]args){
        int[] marks = {75, 82, 91, 68, 88};

        //Enhanced for loop
        for(int num: marks){
            System.out.println(num);
        }

        //Traditional for loop
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
