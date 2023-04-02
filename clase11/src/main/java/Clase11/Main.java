package Clase11;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {


        LectorCSV lector = new LectorCSV("src/main/resources/Ejemplo.csv");
        List<Oferta> ofertas = lector.leerOfertas();

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        String json = mapper.writeValueAsString(ofertas);
        System.out.println(json);

        try (FileWriter file = new FileWriter("src/main/resources/Ejemplo.json")) {
            file.write(json);
        } catch (IOException e) {
            System.err.println("Error al crear el archivo .JSON " + e.getMessage());
        }

        for (Oferta oferta : ofertas) {
            System.out.println("Producto: " + oferta.getProducto().getNombre());
            System.out.println("Peso: " + oferta.getProducto().getPeso());
            System.out.println("Precio: $" + oferta.getProducto().getPrecio());
            System.out.println(oferta.getDescuento().getTipo() + ": " + oferta.getDescuento().getCantidad() + " - Tope: $" + oferta.getDescuento().getTope());
            System.out.println("Valido desde " + oferta.getFechaDesde() + ", hasta " + oferta.getFechaHasta());
            System.out.println(" ");
        }
    }
}
