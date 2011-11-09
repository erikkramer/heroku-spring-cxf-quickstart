package eu.erikkramer.heroku.cxf;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
*
* @author ekramer
* 
*/
@WebService
public interface GeocoderService {

	public String getLatLong(@WebParam(name = "address") String address, @WebParam(name = "city") String city, @WebParam(name = "country") String country);
}
