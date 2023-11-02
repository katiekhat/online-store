package ge.softlab.onlinestore.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@Entity
@Table(schema = "public", name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="products_seq_gen")
    @SequenceGenerator(name="products_seq_gen", sequenceName="products_id_seq",allocationSize = 1)
    private Integer id;
    @Column(name = "ean")
    private String ean;
    @Column(name = "name")
    private String name;
    @Column(name = "company_id")
    private Integer companyId;
    @Column(name = "country_id")
    private Integer countryId;
    @Column(name = "description")
    private String description;
    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
