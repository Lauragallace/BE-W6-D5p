package lauragallace.BEW6D5p.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    @ToString.Exclude
    List<Device> devices;
    @Id
    @GeneratedValue
    private long id;
    @Column(unique = true)
    private String username;
    private String name;
    private String surname;
    @Column(unique = true)
    private String email;
}