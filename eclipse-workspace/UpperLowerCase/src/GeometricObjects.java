import java.util.Date;
public class GeometricObjects 
{ private String color;
  private boolean colored;
  private Date creationDate;
  
  public GeometricObjects()
  {
	  color = "white";
	  colored = false;
	  creationDate = new Date();
  }
  public GeometricObjects(String color,boolean colored)
  {
	  this.color=color;
	  this.colored=colored;
	  creationDate=new Date();
  }
  public String getColor()
  {
	  return color;
  }
  public void setColor(String color)
  {
	  this.color=color;
  }
  public boolean isColored()
  {
	  return  colored;
  }
  public void setColored(boolean colored)
  {
	  this.colored=colored;
  }
  public String toString()
  {
	  if(colored)
	  {
		  return "created object in" +creationDate
		  + ", filled with color "+color+ ".";
	  }
	  return "object created in" + creationDate+", has color"
			  + color + "and is not filled";
  }
}
