Proyecto de ejemplo usando Spring Boot, JPA y Maven para la gestión de cines, salas y detalles de cine.  
Requisitos
Java 17+
Maven 3.8+
Base de datos compatible con JPA (por ejemplo, H2, MySQL, PostgreSQL)
Estructura del proyecto
Entidad Cine: Representa un cine, tiene relación uno a uno con DetalleCine y uno a muchos con Sala.
Entidad DetalleCine: Información adicional del cine (dirección, ciudad, teléfono).
Entidad Sala: Representa una sala de cine, relacionada a un cine.
Repositorios: Interfaces que extienden JpaRepository para acceso a datos.
Servicios: Clases de lógica de negocio para cada entidad.
Instalación y ejecución
Clona el repositorio.
Ejecuta mvn clean install para compilar el proyecto.
Corre la aplicación con:
mvn spring-boot:run
o ejecuta la clase Parcial2Application desde tu IDE.  
Endpoints
Puedes agregar controladores REST para exponer los servicios, por ejemplo:  
POST /cines para crear un cine.
POST /salas para crear una sala.
POST /detalles-cine para crear un detalle de cine.
Notas
Asegúrate de tener configurado el datasource en application.properties.
Puedes agregar controladores y DTOs según lo requiera tu frontend.
