package anno.jpa.database;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor

@Entity
@Table(name = "jpa_user",schema = "public")
public class JpaUser {

    @Id
    private Long id;

    @Column
    private String fname;

}
