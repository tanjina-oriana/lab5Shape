package Shape;

public class Mainclass {

	public static void main(String[] args) {
		Shape s;
	   RightTriangle t =new RightTriangle();
	   s=t;
//	   public void dosomething()
//	   {
	   try
	   {
		   if(s instanceof Shape2d)
		   {
			 
			   if(s instanceof Quadrilateral)
			   {
				   System.out.println(s.area(6,8));
				   System.out.println("2dShape triangle");
			   }
			   else if(s instanceof Triangle)
			   {
				   System.out.println(s.area(6,8));
				   System.out.println("2dShape triangle");
			   }
			   
		   }
			   
		   else if(s instanceof Shape3d)
		   {
			   System.out.println(s.area(6,8));
		   }
		
	   }
	   catch(Exception e)
	   {	
		   e.pr(Shape);
       }
	
	}
	}
