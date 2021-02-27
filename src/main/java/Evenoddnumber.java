public class Evenoddnumber {


    public String Verifynumber(String counter1,int startvalue,int tillnum) {


        System.out.println("the value in the counter is :"+counter1);
            int i =0;
        for (i = startvalue;i <= tillnum;i++)
        {
            if(counter1.equals("EVEN")&(startvalue % 2==0))
            {
                System.out.println(startvalue);
            }
            else if(counter1.equals("ODD")&(startvalue % 2 != 0))
            {
                System.out.println(startvalue);
            }
            startvalue = startvalue+1;
        }

     return counter1;
    }
}
