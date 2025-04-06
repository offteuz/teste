package br.com.matheus.teste.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity(name = "VEHICLE")
public class Vehicle {

    @Id
    @SequenceGenerator(name = "seq_vehicle", sequenceName = "seq_vehicle", allocationSize = 1)
    @GeneratedValue(generator = "seq_vehicle", strategy = GenerationType.SEQUENCE)
    private Long id;
}
