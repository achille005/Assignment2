package entities;

import java.io.Serializable;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "geoLocation")
public class GeoLocation implements Serializable {

	private static final long serialVersionUID = 1L;
	private String lat;
	private String lng;

	@XmlElement(name = "lat")
	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	@XmlElement(name = "lng")
	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public GeoLocation(String lat, String lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}

	public GeoLocation() {
		super();
	}

}
