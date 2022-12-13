package lesson3;

public class OfficeAddress 
{ private String state, city, street, description;
  public OfficeAddress(String state, String city,String street,String description)
  {  this.state=state;
     this.city=city;
     this.state=state;
     this.description=description;
	  
  }
  public void setState(String state)
  { this.state=state;
	  
  }
  public String getState()
  {
	  return state;
  }
  public void setCity(String city)
  {
	  this.city=city;
  }
  public String getCity()
  {
	  return city;
  }
  public void setStreet(String street)
  {
	  this.street=street;
  }
  public String getStreet()
  {
	  return street;
  }
  public void setDescription(String description)
  {
	  this.description=description;
  }
  public String getDescription()
  {
	  return description;
  }

}
