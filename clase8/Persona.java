package ArgentinaPrograma;

import lombok.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class Persona {

    private String nombre;
    private String apellido;
    private Date fechaNacimiento;

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return nombre + " " + apellido + ", nacidx el " + dateFormat.format(fechaNacimiento);
    }
}

