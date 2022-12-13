
public class TestTriangle 
{
	public static void main(String []args)
	{
		Triangle triangle = new Triangle(7,10,5,"green",true);
		
		System.out.println("The area of triangle is:"+ triangle.getArea());
		System.out.println("The perimeter of triangle is:"+ triangle.getPerimeter());
		System.out.println("The color of triangle is:"+ triangle.getColor());
		System.out.println("Is triangle colored with this color? :"+ triangle.isColored());

		System.out.println(triangle.toString());
      
		Triangle t = new Triangle(2,3,5,"blue",false);
		System.out.println("Same area: " +t.Equals(triangle));
		System.out.println("The first triangle has smaller area: " +t.isLargerTriangle(triangle));

	}

}
