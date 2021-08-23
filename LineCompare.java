import java.util.Scanner;

public class UC2{
  public static void main(String args[])
  {
	  
  int x11,y11,x12,y12,x21,y21,x22,y22;
  double distance1,distance2;
  Scanner reader=new Scanner(System.in);
  
  System.out.println("Welcome to line comaprison computation");
  System.out.println("Enter the coordinates of line 1");
  
  x11=reader.nextInt();
  y11=reader.nextInt();
  x12=reader.nextInt();
  y12=reader.nextInt();
  distance1=Math.sqrt((x12-x11)*(x12-x11)+(y12-y11)*(y12-y11));
  
  System.out.println("Enter the coordinates of line 2");
  x21=reader.nextInt();
  y21=reader.nextInt();
  x22=reader.nextInt();
  y22=reader.nextInt();
  distance2=Math.sqrt((x22-x21)*(x22-x21)+(y22-y21)*(y22-y21));
  
  if(distance1==distance2)
		{
			System.out.println("Two lines are equal");
		}
  }
}