package co.edu.uniquindio.unieventos.modelo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("administradores")
@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Administrador {
    @Id
    private int id;

    private String nombre;
    private String cedula;
    private String correo;
    private String contrasenia;
}
