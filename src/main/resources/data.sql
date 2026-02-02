INSERT INTO info (nombre, descripcion, foto_url, email, linkedin, github)
VALUES ('Rafael García',
        'Desarrollador Backend especializado en Java, Spring Boot y sistemas distribuidos.',
        '/images/profile.jpg',
        'rafael@example.com',
        'https://www.linkedin.com/in/rafael',
        'https://github.com/rafael');

INSERT INTO experiencia (puesto, empresa, descripcion, fecha_inicio, fecha_fin)
VALUES ('Backend Developer',
        'Tech Solutions S.A.',
        'Desarrollo de microservicios en Java, optimización de APIs REST y despliegues en Docker.',
        '2022-01-01',
        '2023-06-01');

INSERT INTO estudios (titulo, institucion, descripcion, fecha_inicio, fecha_fin)
VALUES ('Grado Superior en Desarrollo de Aplicaciones Multiplataforma',
        'IES Leganés',
        'Formación en programación, bases de datos, entornos de desarrollo y sistemas.',
        '2020-09-01',
        '2022-06-30');

INSERT INTO proyectos (nombre, descripcion, github_url, imagen_url, fecha)
VALUES ('Portfolio Personal',
        'Aplicación web desarrollada con Spring Boot, Thymeleaf y Bootstrap.',
        'https://github.com/rafael/portfolio',
        '/images/proyecto1.jpg',
        '2024-01-15');

INSERT INTO lenguajes (nombre, icono_url)
VALUES ('Java', '/icons/java.png'),
       ('Spring Boot', '/icons/spring.png'),
       ('MySQL', '/icons/mysql.png');

INSERT INTO proyecto_lenguaje (proyecto_id, lenguaje_id)
VALUES (1, 1),
       (1, 2),
       (1, 3);
