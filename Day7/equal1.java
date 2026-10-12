package Day7;
public class equal1 {
    public static void main (String [] args){
        String name = "ravi";
        String name2 = "ravi";
        String name3 = new String("ravi");
        System.out.println(name == name2);
        System.out.println(name == name3);
        System.out.println(name.equals(name3));

    }
}