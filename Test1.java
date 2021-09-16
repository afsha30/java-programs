import java.util.Scanner;
public class Test1 {
      public static void main(String args[]) {
            Scanner scob = new Scanner(System.in);
                 String str= scob.nextLine();
                 int l=str.length();
                 int  i=0, j=l-1,noc,flag=0;
                 for(noc=0;noc<1/2; noc++)
                 {
                         if (str.charAt(i)!=str.charAt(j))
                           {
                                   System.out.println("not palindrome");
                                   flag=1;
                                   break;
                             }
                              i=i+1;
                              j=j-1;
                  }
                  if (flag==0)
                            System.out.println("palindrome");
    }
}