package lippert.matheus.BackFinal.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author matheus
 * @version 1.0
 * @since 27/06/2020
 * @category Model
 */

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
@Entity
@Table(name = "client")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private long id;

    @Column(name = "name")
    @NotBlank(message = "Invalid name")
    private String name;

    @Column(name = "income")
    @NotNull(message = "Can't income empty")
    private double income;
}
