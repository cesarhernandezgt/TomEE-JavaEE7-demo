package jaxb;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Drum {
    public int rating;
    public String brand;

    public Drum() {
        rating = -1;
        brand= "withoutBrand";
    }

    public Drum(int rating, String brand) {
        this.rating = rating;
        this.brand = brand;
    }

    public int getRating() {
        return rating;
    }

    public String getBrand() {
        return brand;
    }
}
