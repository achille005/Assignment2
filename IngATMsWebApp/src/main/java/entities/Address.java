package entities;

import java.io.Serializable;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "address")
public class Address implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String street;
	private String housenumber;
	private String postalcode;
	private String city;
	private GeoLocation geoLocation;
	private double distance;
	private String type;

	@XmlElement(name = "street")
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@XmlElement(name = "housenumber")
	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	@XmlElement(name = "postalcode")
	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	@XmlElement(name = "city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@XmlElement(name = "geoLocation")
	public GeoLocation getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}

	@XmlElement(name = "distance")
	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	@XmlElement(name = "type")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
