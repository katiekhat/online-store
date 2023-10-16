package ge.softlab.onlinestore.entities;
import java.util.Date;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "public", name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="company_seq_gen")
    @SequenceGenerator(name="company_seq_gen", sequenceName="companies_id_seq",allocationSize = 1)
    private Integer id;

    @Column(name = "parent_id")
    private Integer parentId;
    @Column(name = "country_id")
    private Integer countryId;
    @Column(name = "name")
    private String name;
    @Column(name = "name_geo")
    private String nameGeo;
    private boolean active;
    @Column(name = "created_at")
    private Date createdAt;

}
