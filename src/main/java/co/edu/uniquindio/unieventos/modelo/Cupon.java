package co.edu.uniquindio.unieventos.modelo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("cupones")
@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cupon {
    @Id
    private String id;

    private String codigo;
    private String cedulaCliente;
    private String nombreDescriptivo;
    private double descuento;
    private LocalDateTime fechaVencimineto;
    private LocalDateTime fechaApertura;
    private TipoCupon tipoCupon;

}
