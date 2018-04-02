package be.dkv.dfs.entities;

import javax.persistence.*;

@Embeddable
@Table
@Entity
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idadress;
    private String country;
    private String city;
    private int zipCode;
    private int houseNumber;
    private String streetName;

    public int getIdadress() {
        return idadress;
    }

    public void setIdadress(int idadress) {
        this.idadress = idadress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
