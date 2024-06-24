Resumen LAB III

### Resumen Completo de Spring Framework y Spring Boot

#### Introducción a Spring Framework

**Spring Framework** es un modelo integral de programación y configuración para aplicaciones empresariales Java en diversas plataformas. Su propósito es simplificar la "plumbing" de las aplicaciones empresariales, permitiendo a los desarrolladores enfocarse en la lógica de negocios sin preocuparse por detalles de infraestructura. La documentación oficial se encuentra en [Spring Framework](https://spring.io/projects/spring-framework#learn).

#### Overview

Spring facilita la creación de aplicaciones empresariales Java, ofreciendo soporte también para Groovy y Kotlin. A partir de Spring Framework 6.0, se requiere Java 17+. Spring es adecuado para aplicaciones de larga duración en grandes empresas y es flexible para distintas arquitecturas, como aplicaciones independientes, servidores integrados y entornos en la nube. Además, Spring es de código abierto y cuenta con una activa comunidad.

#### Filosofía de Diseño

Los principios de diseño de Spring Framework incluyen:
- **Flexibilidad y Opciones**: Permite cambiar de proveedores de persistencia y otras configuraciones sin modificar el código.
- **Compatibilidad con Versiones Anteriores**: Minimiza los cambios importantes entre versiones para facilitar el mantenimiento.
- **Diseño de API Intuitivo**: Se enfoca en crear API intuitivas y duraderas.
- **Alta Calidad de Código**: Enfatiza en una estructura de código limpia y documentación precisa.

#### Getting Started con Spring Boot

Para iniciarse con Spring, se recomienda usar **Spring Boot**, que simplifica la creación de aplicaciones listas para producción. **Spring Boot** se basa en Spring Framework y favorece la convención sobre la configuración, facilitando la creación de proyectos rápidamente con herramientas como [start.spring.io](https://start.spring.io).

#### Introducción a Spring Boot

**Spring Boot** permite crear aplicaciones Java independientes y de grado de producción con configuraciones mínimas. Se enfoca en:
- **Configuración Automática**: Inicializa aplicaciones con dependencias preestablecidas para minimizar errores humanos.
- **Enfoque Obstinado**: Añade y configura dependencias automáticamente según las necesidades del proyecto.
- **Aplicaciones Independientes**: Integra servidores web como Tomcat, permitiendo ejecutar aplicaciones sin servidores externos.

#### Creación de Proyectos con Spring Boot

Para crear proyectos con Spring Boot, se pueden utilizar herramientas como Spring Initializr y Spring Boot CLI. Estos proyectos incluyen archivos de configuración predeterminados que facilitan el desarrollo y despliegue de aplicaciones Java robustas con mínima configuración.

#### Configuración de Propiedades

Spring Boot ofrece múltiples fuentes de configuración, como archivos de propiedades, archivos YAML, variables de entorno y argumentos de línea de comandos, permitiendo personalizar el comportamiento de la aplicación externamente y mantener la flexibilidad.

#### Ejecución y Despliegue de Aplicaciones Spring Boot

Spring Boot permite empaquetar aplicaciones como archivos JAR ejecutables o archivos WAR para contenedores servlet. También admite despliegues en la nube y proporciona herramientas como Spring Boot Actuator para supervisar y gestionar aplicaciones en tiempo de ejecución.

#### Desarrollo de Aplicaciones con Spring Boot

Spring Boot simplifica el desarrollo de aplicaciones empresariales Java, proporcionando iniciadores que facilitan la incorporación de tecnologías y frameworks populares, como Spring Data JPA para bases de datos y Spring Security para seguridad.

#### Desarrollo de API RESTful con Spring Boot

Spring Boot facilita la creación de API RESTful con herramientas y características integradas. Ofrece integración con Spring MVC para manejar solicitudes HTTP y proporciona iniciadores para funcionalidades comunes como serialización JSON, validación de datos y seguridad.

#### Documentación de API con Swagger

Swagger es una herramienta para documentar y visualizar API de manera clara. Utiliza la especificación OpenAPI para describir API y generar una interfaz de usuario interactiva con Swagger UI. Springfox es una biblioteca que integra Swagger con Spring Boot para generar documentación automáticamente a partir de anotaciones en el código.

#### Manipulación de Datos con Spring Data JPA y Spring Boot

Spring Data JPA proporciona una capa de abstracción sobre JPA, simplificando las operaciones CRUD en bases de datos. Spring Boot facilita la configuración automática y la integración fluida con Spring Data JPA, permitiendo realizar consultas complejas y gestionar transacciones de manera eficiente.

#### Manipulación de Datos con Spring JDBC y Spring Boot

Spring JDBC simplifica el acceso y manipulación de datos con JDBC. Spring Boot integra Spring JDBC, proporcionando configuraciones predeterminadas y herramientas como JdbcTemplate para ejecutar consultas SQL y manejar transacciones.

#### Integración de Servicios Externos

Spring Boot facilita la integración con servicios externos mediante herramientas como RestTemplate y WebClient para consumir API RESTful, y bibliotecas como Apache CXF para servicios SOAP. También ofrece integración con bases de datos externas, gestión de autenticación con Spring Security y soporte para servicios de terceros, como almacenamiento en la nube y notificaciones push.

Este resumen abarca los aspectos esenciales de Spring Framework y Spring Boot, destacando su flexibilidad, facilidad de uso y herramientas integradas que simplifican el desarrollo y despliegue de aplicaciones empresariales Java.

### Resumen Completo sobre Integración de Spring Boot con JUnit y Uso de Anotaciones

#### Integración de Spring Boot con JUnit

**Spring Boot** proporciona una integración nativa con **JUnit**, uno de los frameworks de pruebas más populares en el ecosistema Java. JUnit permite escribir y ejecutar pruebas unitarias de manera eficiente y estructurada. Spring Boot se integra con JUnit proporcionando anotaciones específicas que simplifican la configuración y ejecución de pruebas en el contexto de una aplicación Spring Boot.

#### Anotaciones Comunes para Pruebas Unitarias en Spring Boot

1. **@RunWith(SpringRunner.class)**: Configura JUnit para que se ejecute con el soporte de Spring, proporcionando una infraestructura especial para la ejecución de pruebas de Spring Boot.
2. **@SpringBootTest**: Carga y configura el contexto de Spring Boot durante las pruebas de integración, permitiendo acceder a los beans administrados por Spring.
3. **@MockBean**: Crea un objeto simulado (mock) de una dependencia de Spring, permitiendo controlar sus respuestas durante las pruebas unitarias.
4. **@DataJpaTest**: Configura un entorno de prueba específico para las operaciones de persistencia de datos con repositorios de Spring Data JPA.
5. **@WebMvcTest**: Configura un entorno de prueba específico para probar controladores REST y solicitudes HTTP en aplicaciones web.

#### Utilidades y Clases de Apoyo en Spring Boot

1. **TestEntityManager**: Proporciona métodos convenientes para interactuar con la base de datos durante las pruebas de integración, permitiendo realizar operaciones CRUD y consultas a la base de datos utilizando JPA.
2. **TestRestTemplate**: Proporciona un cliente HTTP para realizar solicitudes a la aplicación durante las pruebas de integración, permitiendo realizar llamadas a los endpoints REST y verificar las respuestas recibidas.
3. **@AutoConfigureMockMvc**: Configura automáticamente el objeto `MockMvc`, proporcionando un entorno de prueba completo para los controladores web.

Estas herramientas y funcionalidades permiten a los desarrolladores realizar pruebas eficientes y estructuradas, garantizando la calidad y el correcto funcionamiento del código desarrollado.

#### Anotaciones Comunes en Spring Boot

1. **@SpringBootApplication**: Anotación compuesta que combina varias anotaciones, incluyendo @Configuration, @EnableAutoConfiguration y @ComponentScan. Marca la clase principal de la aplicación Spring Boot, habilitando la autoconfiguración y el escaneo de componentes.
2. **@Configuration**: Marca una clase de configuración en Spring, indicando que contiene métodos que definen la configuración de la aplicación.
3. **@ConfigurationProperties**: Enlaza automáticamente propiedades de configuración con campos de una clase, permitiendo una fácil configuración y acceso a las propiedades en un archivo de configuración.
4. **@Controller**: Marca una clase como un controlador web en una aplicación Spring MVC, indicando que maneja solicitudes HTTP y devuelve respuestas adecuadas.
5. **@RestController**: Similar a @Controller, pero específico para controladores RESTful. Combina @Controller y @ResponseBody.
6. **@GetMapping, @PostMapping, @PutMapping, @DeleteMapping**: Mapean solicitudes HTTP GET, POST, PUT y DELETE a métodos específicos en un controlador.
7. **@ExceptionHandler**: Maneja excepciones específicas en un controlador, definiendo un método que se ejecutará cuando ocurra una excepción particular.
8. **@RequestMapping**: Mapea las solicitudes HTTP a métodos específicos en los controladores, permitiendo definir URL y métodos HTTP que un controlador debe manejar.
9. **@PathVariable, @RequestAttribute, @RequestBody, @RequestHeader**: Vínculos de variables de URL, atributos de solicitud, cuerpo de solicitud y encabezados de solicitud con parámetros de método en un controlador.
10. **@ResponseStatus**: Establece el código de estado de la respuesta HTTP devuelta por un método en un controlador.
11. **@Valid**: Activa la validación de datos según las anotaciones de validación de Spring en parámetros de métodos o argumentos de constructores.
12. **@Autowired**: Realiza la inyección de dependencias en Spring, aplicada a campos, constructores o métodos "setter".
13. **@Value**: Inyecta valores de propiedades en los campos de una clase desde archivos de configuración.
14. **@Bean**: Indica que un método en una clase de configuración de Spring debe ser tratado como un bean y gestionado por el contenedor de Spring.
15. **@Component, @Repository, @Service**: Marcan clases como componentes, repositorios de acceso a datos y servicios de negocio, respectivamente.
16. **@Transactional**: Marca un método o clase con transacciones, garantizando la integridad y consistencia de las operaciones.
17. **@Async**: Marca un método como asíncrono, ejecutándose en un hilo separado.
18. **@Scheduled**: Programa la ejecución de un método a intervalos regulares.
19. **@Retryable**: Marca un método para ser reintentado automáticamente en caso de excepciones específicas.
20. **@Recover**: Define un método de recuperación cuando un método @Retryable falla con una excepción especificada.

#### Anotaciones para Integración con Base de Datos

1. **@Entity**: Marca una clase como una entidad de base de datos, representando una tabla.
2. **@Table**: Especifica el nombre de la tabla asociada a una entidad.
3. **@Id**: Marca una propiedad como la clave primaria de la tabla.
4. **@Column**: Mapea una propiedad a una columna en la tabla de la base de datos.
5. **@OneToMany, @ManyToOne, @OneToOne, @ManyToMany**: Establecen relaciones entre entidades.
6. **@JoinColumn**: Especifica la columna utilizada como clave extranjera en una relación entre entidades.
7. **@JoinTable**: Especifica una tabla de unión en una relación muchos a muchos.
8. **@Transient**: Marca una propiedad como transitoria, no persistida en la base de datos.
9. **@Enumerated**: Mapea una propiedad enumerada a una columna de base de datos.
10. **@Temporal**: Mapea una propiedad de fecha o tiempo a una columna de base de datos.
11. **@Version**: Marca una propiedad que representa la versión de una entidad para control de concurrencia.

Estas anotaciones y herramientas facilitan la configuración, desarrollo y pruebas de aplicaciones Spring Boot, promoviendo una arquitectura modular y flexible, y garantizando la calidad del código desarrollado.

### Resumen Completo sobre Microservicios

#### ¿Qué son los Microservicios?

Los **microservicios** son un enfoque arquitectónico en el que una aplicación se compone de muchos componentes más pequeños, acoplados de forma flexible e independiente. Estos servicios suelen tener su propio lote de tecnología, incluyendo bases de datos y modelos de gestión de datos, y se comunican mediante API REST, transmisión de eventos y Message Brokers. Se organizan por capacidad de negocio y se delimitan por contextos específicos.

#### Beneficios Empresariales y Organizacionales

- **Actualización de Código**: Facilita la adición de nuevas características sin afectar a toda la aplicación.
- **Diversidad Tecnológica**: Permite el uso de diferentes tecnologías y lenguajes de programación para distintos componentes.
- **Escalabilidad Independiente**: Los componentes se pueden escalar de manera independiente, reduciendo costos y mejorando la eficiencia.

#### Comparación con Arquitecturas Anteriores

- **Monolítica**: Los microservicios dividen una aplicación grande en servicios más pequeños y menos acoplados, a diferencia de la arquitectura monolítica que es un todo unificado.
- **SOA**: Aunque similar a SOA, los microservicios son específicos de la aplicación, mientras que SOA estandariza la comunicación de servicios a nivel empresarial.

#### Beneficios Organizacionales de los Microservicios

- **Implementación Independiente**: Permite realizar cambios y agregar características sin necesidad de coordinar con todo el sistema.
- **Velocidad y Agilidad**: Facilita la rapidez en los cambios y actualizaciones.
- **Aislamiento de Fallos**: Mejora la resiliencia y la capacidad de recuperación de las aplicaciones.
- **Facilidad de Integración para Nuevos Miembros**: Los nuevos miembros del equipo pueden entender y contribuir rápidamente debido a la modularidad de los servicios.

#### Desafíos de los Microservicios

- **Complejidad de Gestión**: Requiere la gestión de muchos servicios, equipos y lugares de implementación.
- **Volumen de Datos de Registro**: Aumenta la cantidad de datos a supervisar y resolver problemas.
- **Compatibilidad de Versiones**: Las nuevas versiones pueden generar problemas de compatibilidad.
- **Problemas de Red**: Mayor cantidad de conexiones de red puede generar problemas de latencia y conectividad.

#### Requerimiento de DevOps

Los microservicios requieren un enfoque **DevOps** para la implementación, supervisión y automatización del ciclo de vida, dado el aumento de la complejidad y las partes móviles en la arquitectura.

#### Tecnologías y Herramientas Clave

- **Contenedores, Docker y Kubernetes**: Los microservicios son pequeños y ligeros, lo que los hace perfectos para contenedores. Docker facilita la creación y gestión de contenedores, mientras que Kubernetes orquesta grandes grupos de contenedores.
- **Gateways de API**: Actúan como intermediarios que distribuyen las solicitudes entre los servicios y añaden seguridad y autenticación.
- **Mensajería y Streaming de Eventos**: Se usan para mantener los servicios actualizados mediante transmisión de eventos y Message Brokers como Apache Kafka.
- **Arquitecturas Sin Servidor**: Llevan la modularidad de los microservicios a su extremo lógico, permitiendo que funciones individuales se ejecuten y escalen independientemente.

#### Implementación de Microservicios en la Nube

Los microservicios son ideales para la **computación en la nube** debido a su capacidad de escalado independiente y la infraestructura de pago por uso. Además, los servicios en la nube minimizan la complejidad de la gestión.

#### Patrones Comunes

- **Back-end-for-frontend (BFF)**: Crea capas intermedias entre la experiencia del usuario y los recursos backend.
- **Entidad y Patrones Agregados**: Clasifican datos de forma significativa.
- **Descubrimiento de Servicios**: Permiten a las aplicaciones encontrar y comunicarse dinámicamente.
- **Patrones de Adaptador**: Facilitan la conversión de relaciones entre clases u objetos incompatibles.
- **Patrón de Aplicación Strangler**: Ayuda a gestionar la transición de aplicaciones monolíticas a microservicios.

#### Antipatrones (Qué No Hacer)

- **No Crear Microservicios Prematuramente**: No comience con microservicios hasta que tenga una aplicación monolítica lo suficientemente compleja que necesite ser refactorizada.
- **No Hacer Microservicios sin DevOps o Servicios en la Nube**: La complejidad de los microservicios requiere una adecuada automatización y supervisión.
- **No Crear Demasiados Microservicios Pequeños**: Evite sobrecargarse dividiendo demasiado los servicios.
- **No Confundir Microservicios con SOA**: Los microservicios son específicos de aplicaciones, mientras que SOA estandariza servicios a nivel empresarial.
- **No Intentar Ser Netflix**: Comience con un enfoque manejable y evite la complejidad excesiva.

Este resumen abarca los aspectos esenciales de los microservicios, sus beneficios, desafíos, tecnologías clave, y las mejores prácticas para su implementación y gestión.
