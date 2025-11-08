# Hospital Backend - API
**Hospital Backend - Sistema de Gestión de Pacientes**  
API REST desarrollada con Spring Boot para la gestión integral de pacientes en un sistema hospitalario, permitiendo el registro, consulta y administración de historiales médicos.

# ¿Por qué lo hice?
El sector salud necesita sistemas eficientes para gestionar la información de pacientes. Este proyecto nace de la necesidad de aplicar mis conocimientos en desarrollo backend para crear una solución que facilite el manejo de datos médicos. Me apasiona crear sistemas que puedan impactar positivamente en la vida de las personas, y qué mejor que hacerlo en el ámbito de la salud.

---

## Características Principales

### Módulo de Gestión de Pacientes
- Registro de nuevos pacientes
- Consulta de todos los pacientes registrados
- Búsqueda de pacientes por ID
- Sistema de historiales médicos
- Registro de tratamientos y seguimientos

### Base de Datos
- Persistencia de datos en PostgreSQL
- Generación automática de IDs
- Registro de fechas automático
  
---

### Base de Datos
- **PostgreSQL 18** - Sistema de BD

### Herramientas de Desarrollo
- **IntelliJ IDEA**
- **Postman**
- **pgAdmin 4**
- **Git**

---

## Arquitectura del Sistema

```
┌─────────────────────────────────────────┐
│         CAPA DE PRESENTACIÓN            │
│         (PacientesController)           │  ← Recibe peticiones HTTP
│  - Maneja requests/responses            │
│  - Códigos de estado HTTP               │
└──────────────┬──────────────────────────┘
               │
               ▼
┌─────────────────────────────────────────┐
│         CAPA DE NEGOCIO                 │
│         (PacienteService)               │  ← Lógica de la aplicación
│  - Validaciones                         │
│  - Conversión DTO ↔ Entity              │
└──────────────┬──────────────────────────┘
               │
               ▼
┌─────────────────────────────────────────┐
│         CAPA DE DATOS                   │
│         (PacientesRepository)           │  ← Comunicación con BD
│  - CRUD operations                      │
│  - Genera SQL automáticamente           │
└──────────────┬──────────────────────────┘
               │
               ▼
┌─────────────────────────────────────────┐
│         BASE DE DATOS                   │
│         (PostgreSQL)                    │  ← Almacenamiento
│  - Tabla: pacientes                     │
└─────────────────────────────────────────┘
```

---


## Contribución

Este proyecto fue desarrollado como parte del programa de formación **Quipux - Semillero**.

---

## Autor

**Jose Miguel Ríos Montoya**

---

## ¿Preguntas y Contacto?

**Correo:** jomirimo09@hotmail.com  
**Teléfono:** +57 314 3650691  
