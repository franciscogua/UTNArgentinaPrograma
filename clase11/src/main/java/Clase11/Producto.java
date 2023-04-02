package Clase11;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
@Data @Builder(toBuilder = true) @NoArgsConstructor @AllArgsConstructor
public class Producto {
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("peso")
    private List<Object> peso;
    @JsonProperty("precio")
    private Double precio;

    public Producto(String nombre, double cantidad, String unidad, double precio) {
        this.nombre = nombre;
        this.peso = Arrays.asList(cantidad, unidad);
        this.precio = precio;
    }
}
