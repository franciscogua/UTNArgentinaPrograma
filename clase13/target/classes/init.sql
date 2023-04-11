CREATE TABLE Departamentos (
nombre VARCHAR(50) PRIMARY KEY,
presupuesto DECIMAL(10, 2)
);

CREATE TABLE Empleados (
dni VARCHAR(8) PRIMARY KEY,
nombre VARCHAR(50),
apellido VARCHAR(50),
nacionalidad VARCHAR(50),
departamento VARCHAR(50),
FOREIGN KEY (departamento) REFERENCES Departamentos(nombre)
);

INSERT INTO Departamentos (nombre, presupuesto) VALUES
('Logística', 10000.00),
('Sistemas', 20000.00),
('Compras', 30000.00);

INSERT INTO Empleados (dni, nombre, apellido, nacionalidad, departamento) VALUES
('42226208', 'Nicolás', 'Gómez', 'Argentino', 'Logística'),
('18332119', 'Laura', 'Armengol', 'Español', 'Sistemas'),
('29443229', 'Nello', 'Bertolini', 'Italiano', 'Compras');