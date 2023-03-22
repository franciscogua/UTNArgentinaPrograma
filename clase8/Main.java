package ArgentinaPrograma;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sn = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();
        boolean salir = false;

        while(!salir) {
            System.out.println("\nIngrese una opción:\n");
            System.out.println("1. Agregar persona");
            System.out.println("2. Listar personas");
            System.out.println("3. Salir");

            int opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    Persona persona = new Persona();

                    System.out.println("Ingrese el nombre de la persona:");
                    persona.setNombre(sn.next());
                    System.out.println("Ingrese el apellido de la persona:");
                    persona.setApellido(sn.next());
                    System.out.println("Ingrese la fecha de nacimiento (formato (DD/MM/AAAA):");
                    String fechaStr = sn.next();
                    persona.setFechaNacimiento(parsearFecha(fechaStr));

                    personas.add(persona);
                    break;

                case 2:
                    System.out.println("\nLista de personas:");
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    for (Persona p : personas) {
                        System.out.println(" - " + p.getNombre() + " " + p.getApellido() + ", nacidx el " + dateFormat.format(p.getFechaNacimiento()));
                    }
                    break;

                case 3:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;

            }
        }

        sn.close();
    }

    private static Date parsearFecha(String fechaStr) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.parse(fechaStr);
    }
}