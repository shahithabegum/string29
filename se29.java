import java.util.*;
import java.lang.*;
class se29
{
  public static void main(String arg[])
   {
     try
         {
            String s ="Stephen Edwin King";
           StringBuilder sb2=new StringBuilder();
           for(int i=0;i<s.length();i++)
	{
	   char ch=s.charAt(i);
	   int id=s.indexOf(ch, i+1);
	  if(id==-1){
	   sb2.append(ch); 
	  }
	}
	System.out.println(sb2);
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}