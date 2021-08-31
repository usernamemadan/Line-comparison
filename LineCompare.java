import java.util.Scanner;

public class LineCompare {

	int x11 = 0, y11 = 0, x12 = 0, y12 = 0, x21 = 0, y21 = 0, x22 = 0, y22 = 0;
	double distance1 = 0, distance2 = 0;

	LineCompare() {
		System.out.println("Welcome to line comaprison computation");
	}

	public void input() {
		System.out.println("Enter the coordinates of line 1");
		Scanner sc = new Scanner(System.in);
		x11 = sc.nextInt();
		y11 = sc.nextInt();
		x12 = sc.nextInt();
		y12 = sc.nextInt();
		System.out.println("Enter the coordinates of line 2");
		x21 = sc.nextInt();
		y21 = sc.nextInt();
		x22 = sc.nextInt();
		y22 = sc.nextInt();
	}
	public void findLength() {
		distance1 = Math.sqrt((x12 - x11) * (x12 - x11) + (y12 - y11) * (y12 - y11));
		distance2 = Math.sqrt((x22 - x21) * (x22 - x21) + (y22 - y21) * (y22 - y21));

		System.out.println("The length of the line1 is:" + String.format("%.4f", distance1));
		System.out.println("The length of the line2 is:" + String.format("%.4f", distance2));
	}

	public void isEqual() {
		if ((String.valueOf(distance1)).compareTo(String.valueOf(distance2)) == 0) {
			System.out.println("Two lines are equal");
		}
	}

	public void compareLines() {
		if ((String.valueOf(distance1)).compareTo(String.valueOf(distance2)) == 0) {
			System.out.println("Two lines are equal");
		} 
		else if ((String.valueOf(distance1)).compareTo(String.valueOf(distance2)) > 0) {
			System.out.println("Line1 is greater than Line2");
		} 
		else {
			System.out.println("Line1 is lesser than Line2");
		}
	}

}