package co.edu.uniquindio.unieventos.modelo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("clientes")
@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente {

    @Id
    private String idCliente;

    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;
    private String email;
    private String contrasenia;
    public Compra compra;
}
