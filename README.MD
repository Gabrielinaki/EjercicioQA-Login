# 🧪 Proyecto de Automatización de Pruebas - Página de Login (HTML Local)

Este proyecto tiene como objetivo automatizar las pruebas de una página de login HTML estática utilizando **Selenium WebDriver en Java**. Se aplicaron buenas prácticas de automatización y diseño utilizando el patrón **Page Object Model (POM)** para mantener una estructura ordenada, escalable y fácil de mantener.

---

## 🧠 Proceso de análisis y desarrollo de los tests

### 🔍 1. Análisis del HTML
Primero se analizó la estructura de la página HTML. Se identificaron los siguientes elementos clave:

- Un campo de texto para el usuario (`id="username"`)
- Un campo de contraseña (`id="password"`)
- Un botón para enviar el formulario (sin `id`, por lo que se utilizó `XPath`)

### 🏗️ 2. Estructura del proyecto
Se utilizó Gradle para la gestión del proyecto y dependencias. Se organizó en dos capas:

- `pages/`: contiene la lógica de interacción con la página (POM).
- `steps/`: contiene los casos de prueba como clases JUnit.

### 🧱 3. Implementación del Page Object
Se creó la clase `LoginPage.java` con tres métodos clave:
- `enterUsername(String username)`
- `enterPassword(String passWord)`
- `ClickContinue()`

Esto permite reutilizar la lógica de interacción en múltiples tests.

### 🧪 4. Diseño de los casos de prueba
Se eligieron tres escenarios básicos pero representativos:

- **Login exitoso:** Se ingresan credenciales válidas. Se valida si se navega a otra pantalla, aparece un mensaje de bienvenida o cambia el título.
- **Login con credenciales inválidas:** Se prueba con contraseña incorrecta. Se espera un mensaje de error o que no se redirija.
- **Login con campos vacíos:** Se prueba sin ingresar usuario y/o contraseña. Se espera que no se permita enviar el formulario.

Cada test crea una nueva instancia del navegador, navega al archivo HTML local y ejecuta los pasos definidos.

---

## ⚙️ Tecnologías utilizadas

- Java 17+
- Selenium WebDriver
- JUnit 5
- Gradle

---

## ✅ Casos de prueba implementados

| Caso                          | Descripción                                                        |
|------------------------------|--------------------------------------------------------------------|
| Login exitoso                | Usuario y contraseña correctos, validación de éxito (título o contenido) |
| Login con credenciales inválidas | Usuario válido pero contraseña incorrecta, debe mostrar mensaje de error |
| Login con campos vacíos      | No se completan los campos, se espera validación del formulario    |

---



