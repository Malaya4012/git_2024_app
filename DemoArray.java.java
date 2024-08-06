package p2;

import java.util.*;
public class DemoArray {

	private static final String[] ob = null;

	@SuppressWarnings("removal")
	public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       Integer [] ob=new Integer[6];
       try(sc;)
       {
    	   try
    	   {
    		   for(int i=0;i<ob.length;i++)
    		   {
    			   System.out.println("Enter the array "+(i)+" value:");
    			   ob[i]=Integer.valueOf(sc.nextInt());
    		   }
    		   
    		   System.out.println("=====Show ****** the ***** Array====");
    		   System.out.println(Arrays.toString(ob));
    		   System.out.println("\n===============================");
    		   int temp;
    		   for(int i=0;i<ob.length-3;i++)
    		   {
    			   for(int j=i;j<ob.length-3;j++)
    			   {
    			  temp=ob[i];
    			  ob[i]=ob[j];
    			  ob[j]=temp;  
    			   }
    			 System.out.print(ob[i]+" ");
    		  }
    		   System.out.println("\n===============================");
    		   int temp1;
    		   
    		   //desc
    		   for(int i=0;i<ob.length/2-1;i++)
    		   {
    			   for(int j=0;j<ob.length/2-1;j++)
    			   {
    			  temp1=ob[i];
    			  ob[i]=ob[j+1];
    			  ob[j+1]=temp1;  
    			   }
    			 System.out.print(ob[i]+" ");
    		  }
    		   
   }
    	   catch
    	   (Exception e)
    	   {
    		 e.printStackTrace();  
    	   }
       }

	}

}
