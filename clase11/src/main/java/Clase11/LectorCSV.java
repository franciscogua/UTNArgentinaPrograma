package Clase11;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LectorCSV {

    private final String rutaArchivo;

    public LectorCSV(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public List<Oferta> leerOfertas() {
        List<Oferta> ofertas = new ArrayList<>();

        try (CSVReader lector = new CSVReader(new FileReader(rutaArchivo))) {
            String[] linea;
            while((linea = lector.readNext()) != null) {
                try {
                    Oferta oferta = parsearOferta(linea);
                    ofertas.add(oferta);
                } catch (IllegalArgumentException e) {
                    System.err.println(("Error al parsear la línea del archivo CSV: " + e.getMessage()));
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.err.println("Error al leer el archivo CSV: " + e.getMessage());
        }

        return ofertas;

    }

    private Oferta parsearOferta(String[] linea) throws IllegalArgumentException {
        if (linea.length != 8) {
            throw new IllegalArgumentException("La línea debe tener 8 columnas");
        }

        String nombre = linea[0];
        String[] peso = linea[1].split(" ");
        double precio = Double.parseDouble(linea[2]);
        String tipoDescuento = linea[3];
        double cantidadDescuento = Double.parseDouble(linea[4]);
        double topeDescuento = Double.parseDouble(linea[5]);
        LocalDate fechaDesde = LocalDate.parse(linea[6]);
        LocalDate fechaHasta = LocalDate.parse(linea[7]);

        return new Oferta(new Producto(nombre, Double.parseDouble(peso[0]), peso[1], precio),
                new Descuento(tipoDescuento, cantidadDescuento, topeDescuento), fechaDesde, fechaHasta);
    }
}
