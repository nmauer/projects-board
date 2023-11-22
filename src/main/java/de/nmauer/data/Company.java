package de.nmauer.data;

import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.server.StreamResource;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.ByteArrayInputStream;

@Entity
@Table(name = "company")
public class Company extends AbstractEntity {

    private String name;
    private String street;
    private String city;
    private String zipcode;
    private byte[] logo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public byte[] getLogo() {
        return logo;
    }

    public Avatar getLogoAsAvatar(){
        Avatar avatar = new Avatar();
        if(logo != null){
            StreamResource resource = new StreamResource("profile-pic",
                    () -> new ByteArrayInputStream(logo));
            avatar.setImageResource(resource);
        }
        avatar.getElement().setAttribute("tabindex", "-1");
        return avatar;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }
}
