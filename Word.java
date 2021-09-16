public class word
{
public int lenght(final string s)
         {
               int len =0;
                string x=a.trim();
                 
                for (int i=0;i<x.lenght();i++){
                              if (x.charAt(i)==' ')
                                  len=0;
                              else
                                   len++;
                      	}
           return len;
}
public static void main(string[] args)
{
  string input ="hello world";
  main hw = new Main();
  System.out.println("the lenght of last word is"+ hw.length(input));
}
}

