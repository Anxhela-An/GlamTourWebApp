package lesson2;

public class Location 
{ public static final byte  LATITUDE_MIN_VALUE = -90;
  public static final byte LATITUDE_MAX_VALUE = 90;
  public static final short LONGITUDE_MIN_VALUE = -180;
  public static final short LONGITUDE_MAX_VALUE = 180;
  
  private double latitude, longitude;
  /**
	 * latitude dhe longitude
	 * duhet te jene te pandryshueshme
	 * dmth objekti i nje vendndodhjeje
	 * nuk do mund te ndryshoje permbajtje
	 * 
	 * Sa konstruktore mund ti krijojme kesaj klase?
	 * Te pakten 1 e bej duke percaktuar ne parametra
	 * latitute dhe longitude.
	 * A mund ti krijojme konstruktor pa parametra?
	 * Jo! 
	 * Pse? Sepse meqenese nuk pres te ndertoj metoda setter
	 *      atehere permbajtja do ishte gjithmone ajo default
	 *      dhe sdo kishte kuptim te perdorej objekti.
	 * */
  public Location(double latitude,double longitude)
  {
	  if((latitude <LATITUDE_MIN_VALUE)||(latitude>LATITUDE_MAX_VALUE))
	  {
		  //ndalohet krijimi i objektit
		  latitude = LATITUDE_MIN_VALUE;
	  }
	  if((longitude<LONGITUDE_MIN_VALUE)||(longitude>LONGITUDE_MAX_VALUE))
	  {
		latitude = LONGITUDE_MIN_VALUE;  
	  }
	  this.latitude=latitude;
	  this.longitude=longitude;
	 
  }
  public Location(double value)
  {
	  this(value,value);
  }
  public double getLatitude()
  {
	  return latitude;
  }
  public double getLongitude()
  {
	  return longitude;
  }
  public String getPosition()
  {
	  String position ="";
	  if(latitude>=0)
	  {
		  position=latitude + "N, ";
	  }
	  else
	  {
		  position=-longitude + "S, ";
	  }
      if(longitude >= 0) {
		  position += longitude + " E";
			}
      
	  else {
				
		  position += -longitude + " W";
			}
		return position;
	  
  }
}
