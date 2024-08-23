package co.edu.uniquindio.unieventos.modelo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("documentos")
@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Compra {
    @Id
    private String idCompra;

    private String evento;
    private int cantidadEntrada;
    private Localidad localidad;
    private Cupon cupon;
    private int valorTotalCompra;
    private String pago;
}
