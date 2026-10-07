package Day5;
public class method {
    public static void main(String[] args) {
        method obj = new method();
        obj.add(10,20);
        obj.add(10,20,30);
    }
    void add(int a,int b){
        System.out.println("Sum of two numbers: "+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("Sum of three numbers: "+(a+b+c));
    }
}