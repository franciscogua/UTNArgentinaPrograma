package Clase11;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data @Builder(toBuilder = true) @NoArgsConstructor @AllArgsConstructor
public class Oferta {
    @JsonProperty("producto")
    private Producto producto;
    @JsonProperty("descuento")
    private Descuento descuento;
    @JsonProperty("fechaDesde") @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate fechaDesde;
    @JsonProperty("fechaHasta") @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate fechaHasta;
}
