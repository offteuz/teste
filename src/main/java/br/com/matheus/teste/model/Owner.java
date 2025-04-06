package br.com.matheus.teste.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity(name = "OWNER")
public class Owner {

    @Id
    @SequenceGenerator(name = "seq_owner", sequenceName = "seq_owner", allocationSize = 1)
    @GeneratedValue(generator = "seq_owner", strategy = GenerationType.SEQUENCE)
    private Long id;
}
