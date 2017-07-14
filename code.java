import java.io.*;
import java.util.*;
public class code {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
       
        String str=s.next();
        int a,sum=0;
         String st[]=new String[str.length()];
          String st1[]=new String[str.length()];
    for(int i=0;i<str.length();i=i+9)
       {
           st1[i]=str.substring(i, i+9);
             st[i]=str.substring(i+5,i+9);
           
       a=Integer.parseInt(st[i]);
    while(a>9)
        { 
    while(a!=0)
               {
                  int m=a%10;
                   a=a/10;
                   sum=sum+m;
                   }
    a=sum;
      sum=0;
        }

    if(a==5||a==7 )
        
         {System.out.println(st1[i]);

         }
    }  }
}
