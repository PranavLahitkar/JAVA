/*Assignment Title- Write a program in Java with class Rectangle with the
data fields width, length, area and colour. The length, width and area are of double
type and colour is of string type. The methods are get_length(), get_width(),
get_colour() and find_area(). Create two objects of Rectangle and compare their
area and colour. If the area and colour both are the same for the objects then
display &quot;Matching Rectangles&quot;, otherwise display &quot;Non-
matching Rectangle&quot;
Input-*/
import java.util.Scanner;
class Rectangle {
private double width;
private double length;
private double area;
private String colour;
public Rectangle(double width, double length, String colour) {
this.width = width;
this.length = length;
this.colour = colour;
findArea();
}
private void findArea() {
this.area = width * length;
}
public double getWidth() {
return width;
}
public double getLength() {
return length;
}
public double getArea() {
return area;
}

public String getColour() {
return colour;
}
}
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println(&quot;Enter width of first rectangle:&quot;);
double width1 = scanner.nextDouble();
System.out.println(&quot;Enter length of first rectangle:&quot;);
double length1 = scanner.nextDouble();
scanner.nextLine();
System.out.println(&quot;Enter colour of first rectangle:&quot;);
String colour1 = scanner.nextLine();
System.out.println(&quot;Enter width of second rectangle:&quot;);
double width2 = scanner.nextDouble();
System.out.println(&quot;Enter length of second rectangle:&quot;);
double length2 = scanner.nextDouble();
scanner.nextLine();
System.out.println(&quot;Enter colour of second rectangle:&quot;);
String colour2 = scanner.nextLine();
Rectangle rect1 = new Rectangle(width1, length1, colour1);
Rectangle rect2 = new Rectangle(width2, length2, colour2);
if (rect1.getArea() == rect2.getArea() &amp;&amp;
rect1.getColour().equals(rect2.getColour())) {
System.out.println(&quot;Matching Rectangles&quot;);
} else {
System.out.println(&quot;Non-matching Rectangles&quot;);
}
scanner.close();
}
}