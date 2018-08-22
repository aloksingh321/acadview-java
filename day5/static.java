class Test {
    static int i;     
   
    static {
        i = 10;
    } 
}
 
class Main {
    public static void main(String args[]) {
        System.out.println(Test.i); 
    }
}