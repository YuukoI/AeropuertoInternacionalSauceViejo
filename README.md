✈️ Sistema de Gestión: Aeropuerto Internacional Sauce Viejo
Este proyecto es un sistema integral para la gestión de operaciones aeroportuarias, desarrollado para la materia Desarrollo de Sistemas de Información (DESI). La aplicación permite administrar el flujo completo de un aeropuerto, desde la programación de vuelos hasta la reserva de asientos por parte de los pasajeros.

🚀 Funcionalidades Principales
Gestión de Vuelos: Programación, seguimiento y administración de rutas aéreas.

Sistema de Reservas: Proceso completo de reserva de pasajes vinculados a pasajeros específicos.

Control de Inventario de Asientos: Gestión de diferentes categorías de asientos (Clase Turista, Ejecutiva, etc.) y su disponibilidad en tiempo real.

Administración de Geografía: Registro de ciudades y aeropuertos interconectados.

Base de Datos Relacional: Implementación de un modelo de datos complejo para garantizar la integridad de las transacciones.

🛠️ Stack Tecnológico
Backend: Java 17 & Spring Boot.

Persistencia: Spring Data JPA / Hibernate.

Base de Datos: MySQL (incluye script de migración desifinalScriptTest.sql).

Gestión de Dependencias: Maven.

Frontend: Integración con vistas dinámicas (Thymeleaf/HTML).

📐 Arquitectura
El proyecto sigue el patrón de diseño MVC (Modelo-Vista-Controlador), asegurando una clara separación de responsabilidades:

Entities: Modelado de datos (Vuelo, Pasajero, Reserva, Ciudad, etc.).

Repositories: Intercambio de datos con la base de datos mediante abstracciones de JPA.

Services: Lógica de negocio centralizada.

Controllers: Gestión de peticiones HTTP y flujo de la aplicación.

⚙️ Instalación y Uso
1. Clonar el repositorio:

Bash
git clone https://github.com/YuukoI/AeropuertoInternacionalSauceViejo.git
2.Configurar la base de datos MySQL utilizando el script desifinalScriptTest.sql incluido.

3. Actualizar el archivo application.properties con tus credenciales de base de datos.

4. Ejecutar la aplicación con Maven o desde tu IDE preferido.

5. Acceder a localhost:8080 en el navegador.
