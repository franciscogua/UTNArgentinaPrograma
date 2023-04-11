package org.example;

import java.sql.*;

public class Main {
    static final String DB_URL = "jdbc:h2:mem:;INIT=runscript from 'classpath:init.sql'";

    public static void main(String[] args) {
        Connection conn;
        Statement stmt;
        try {
            conn = DriverManager.getConnection(DB_URL);

            stmt = conn.createStatement();

            //Modificar nacionalidad
            int result =  stmt.executeUpdate("UPDATE Empleados SET nacionalidad = 'Uruguayo' WHERE dni = '42226208';");
            System.out.println(result + " registros modificados.");

            //Para evitar problemas con la clave foránea al eliminar un departamento más adelante:
            int result2 = stmt.executeUpdate("DELETE FROM Empleados WHERE departamento = 'Compras';");
            System.out.println(result2 + " registros modificados.");

            //Eliminar un departamento
            int result3 = stmt.executeUpdate("DELETE FROM Departamentos WHERE nombre = 'Compras';");
            System.out.println(result3 + " registros modificados.");

            //Quiénes trabajan en Logística
            ResultSet Emp;
            Emp = stmt.executeQuery("SELECT * FROM Empleados WHERE departamento = 'Logística';");
            while(Emp.next()) {
                System.out.println("DNI: "+Emp.getString(1)+"\n"
                        +"Apellido y Nombre: "+Emp.getString(3)+" "
                        +Emp.getString(2)+"\n"
                        +"Nacionalidad: "+Emp.getString(4)+"\n"
                        +"Departamento: "+Emp.getString(5));
            }

            //Mostrar todos los departamentos
            ResultSet Dep;
            Dep = stmt.executeQuery("SELECT * FROM Departamentos;");
            while(Dep.next()) {
                System.out.println(Dep.getString(1)+" "+ Dep.getString(2));
            }

            conn.close();

        } catch (SQLException e) {
            System.out.println("Error al crear las tablas: " + e.getMessage());
        }
    }
}