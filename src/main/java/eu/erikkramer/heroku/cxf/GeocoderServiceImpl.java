package eu.erikkramer.heroku.cxf;

import javax.jws.WebService;

/**
*
* @author ekramer
* 
*/
@WebService(endpointInterface = "eu.erikkramer.heroku.cxf.GeocoderService")
public class GeocoderServiceImpl implements GeocoderService {
    
    public String getLatLong(String address, String city, String country) {
        Geocoder geo = new Geocoder();
        geo.setLatLong(address, city, country);
        return geo.getLatLong();
    }

}
