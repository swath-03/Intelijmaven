public class demo1 {


    public demo1(){
  //  public static void main(String[] args) {

        String a;
        int x,y,c;

        x = 300;
        y = 200;
        c = x + y;


        System.out.println("welcome to Maven");
        System.out.println("this is a demo test");

        System.out.println("the sum of x + y = "+c);
    }

    public int add(int a, int b,int c){


        c = a + b;

        System.out.println("the value in C is :"+c);
        return c;
    }

    public int sub(int a,int b,int c){

        c = a - b;

        System.out.println("the value in C is :"+c);
        return c;
    }

    public int mul(int a,int b,int c){

        c = a *b;
        System.out.println("the value in C is :"+c);
        return c;
    }
}
