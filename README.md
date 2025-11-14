📚 Descripción del Dominio
Este proyecto implementa un Sistema de Gestión Bibliográfica que maneja la relación 1→1 unidireccional entre dos entidades principales:

🎯 Entidades del Dominio
Libro (Clase A)

Representa la información básica de un libro

Atributos: título, autor, editorial, año de edición

Relación: posee una FichaBibliográfica asociada

FichaBibliográfica (Clase B)

Contiene metadatos bibliográficos especializados

Atributos: ISBN, Clasificación Dewey, estantería, idioma

Relación: pertenece a un único Libro

🔗 Características de la Relación 1→1
Unidireccional: Solo Libro referencia a FichaBibliográfica

Integridad referencial: Garantizada a nivel de base de datos

Eliminación lógica: Ambas entidades implementan borrado lógico (eliminado = TRUE)

⚙️ Requisitos del Sistema
Tecnologías Requeridas
Java: JDK 11 o superior

Base de Datos: MySQL 8.0 o superior

Driver: MySQL Connector/J 8.0+

Sistema Operativo: Cualquier SO compatible con Java

Dependencias
mysql-connector-java-8.0.x.jar

Configuración de base de datos en db.properties

