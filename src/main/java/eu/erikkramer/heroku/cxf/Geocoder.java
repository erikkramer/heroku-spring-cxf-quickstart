package eu.erikkramer.heroku.cxf;

//import com.crmwaypoint.gmaps.geocoding.GMapsGeocoder;



/**
*
* @author ekramer
* 
*/
public class Geocoder {

    private String latLong;
    
	public String getLatLong() {
		return latLong;
	}

	public void setLatLong(String address, String city, String country) {

		//String ca = address + ", " + city + ", " + country;
		//GMapsGeocoder gmg = new GMapsGeocoder();
		
		//this.latLong = gmg.getGMapsGeocoding(ca).toString();
		
	}
	
	// just for debugging purposes
	public static void main(String [] args){
		
		//Geocoder g = new Geocoder();
		//g.setLatLong("Butsingelewq 10", "Joure", "NL");
		//System.out.println(g.getLatLong());
		
	}

}
