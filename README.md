# 💱 Conversor de Moneda con ExchangeRate-API

## 📌 Descripción
Este proyecto permite obtener tasas de cambio entre distintas monedas utilizando la **ExchangeRate-API**. A través de `HttpClient`, se envían solicitudes HTTP a la API y se procesan respuestas en formato JSON para calcular conversiones de divisas.

## 🚀 Características
✅ Consultar tasas de cambio en tiempo real.  
✅ Manejo de errores en la API (moneda inválida, clave incorrecta, etc.).  
✅ Conversión de montos ingresados por el usuario.  
✅ Implementación con `HttpClient` y `Gson`.  
✅ Interfaz de línea de comandos con `Scanner`.

## 🛠️ Instalación y Uso
### 📥 Requisitos:
- **Java 17+** instalado.
- **Clave de API** de [ExchangeRate-API](https://www.exchangerate-api.com/).
- **IDE** como IntelliJ IDEA o Eclipse.

### 📌 Instalación:
1. Clona el repositorio:
   ```sh
   git clone https://github.com/usuario/conversor-moneda.git

2.Abre el proyecto en tu IDE.

3.Asegúrate de configurar Java 17+ como SDK.

4.Reemplaza TU-CLAVE-API en ConsultarMoneda.java con tu clave de API válida.

▶️ Ejecución:
1.Corre la clase Main.java:
java Main

2.Ingresa los códigos de moneda (Ejemplo: USD → EUR).

3.Introduce el monto a convertir.

4.Obtén el resultado con la tasa de cambio actual.

📄 Estructura del Proyecto
📂 conversor-moneda
 ├── 📄 README.md
 ├── 📄 Main.java
 ├── 📄 ConsultarMoneda.java
 ├── 📄 ConvertirMoneda.java
 ├── 📄 Moneda.java
 ├── 📂 libs (Dependencias como Gson)

⚙️ Tecnologías Utilizadas
Java

HttpClient (Para realizar solicitudes HTTP)

Gson (Para procesar JSON)

Scanner (Interacción con el usuario)

🏆 Ejemplo de Uso

-------------------------------
Ingrese el código de la moneda a convertir (ej: USD):
➡ USD
Ingrese la moneda destino (ej: EUR):
➡ EUR
Ingrese la cantidad de USD:
➡ 100
📈 La tasa de conversión de hoy para EUR:
 1 USD = 0.92 EUR
 100 USD = 92.00 EUR


 ❓ Problemas y Soluciones
❌ Error "invalid-key" ✔ Revisa que tu clave API sea válida y esté correctamente configurada en ConsultarMoneda.java.

❌ Error "unsupported-code" ✔ Verifica que los códigos de moneda ingresados sean correctos.

❌ Error "malformed-request" ✔ Asegúrate de estar usando la URL adecuada y el formato correcto.

🎯 Contribuciones
¡Tus mejoras y sugerencias son bienvenidas! Si deseas contribuir:

Haz un fork del repositorio.

Crea una rama (git checkout -b mi-mejora).

Realiza tus cambios y haz commit (git commit -m "Mejora en la conversión").

Haz push (git push origin mi-mejora).

Abre un Pull Request.

📜 Licencia
Este proyecto está bajo la MIT License. Puedes usarlo, modificarlo y distribuirlo libremente.

🌐 Créditos
API: ExchangeRate-API

Desarrollo: [Adan de jesus restrepo]

✨ ¡Gracias por usar nuestro Conversor de Monedas! ✨


---

### **📌 Resumen del `README.md`**
🚀 Explica **cómo instalar y ejecutar el proyecto**.  
🔎 Detalla las **funcionalidades** y tecnologías utilizadas.  
📌 Muestra **ejemplos de uso y solución de errores comunes**.  
🙌 Incluye **cómo contribuir** al proyecto.

Si quieres agregar más detalles o cambiar algún formato, dime y lo ajustamos juntos. 😃🚀





