package Clase11;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder(toBuilder = true) @NoArgsConstructor @AllArgsConstructor
public class Descuento {
    @JsonProperty("tipo")
    private String tipo;
    @JsonProperty("cantidad")
    private Double cantidad;
    @JsonProperty("tope")
    private Double tope;
}
