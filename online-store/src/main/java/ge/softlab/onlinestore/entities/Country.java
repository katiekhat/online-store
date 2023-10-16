package ge.softlab.onlinestore.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "public",name = "countries")
public class Country {
    @Id
    private Integer id;

    @Column(name = "iso_code_2")
    private String isoCode2;

    @Column(name = "iso_code_3")
    private String isoCode3;

    @Column(name = "name")
    private String name;

    @Column(name = "name_geo")
    private String nameGeo;

}
