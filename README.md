Resolución del ejercicio N°6 de la unidad 4 de programación 2.
Interfaz Contrato (Exportable):

Define la firma universal void exportar(String contenidoReporte). Obliga a cualquier formato de exportación actual o futuro a implementar un método estándar para procesar y transformar los datos del reporte.

Clases Concretas (Exportadores específicos):

ExportadorPDF: Simula el marcado y la aplicación de estilos estructurados orientados a documentos estáticos (como márgenes, saltos de página y fuentes corporativas).

ExportadorExcel: Simula la generación de celdas tabulares, hojas de cálculo y fórmulas estructuradas para análisis financiero.

ExportadorHTML: Simula la generación de etiquetas web, tablas y estilos CSS interactivos para visualización en navegadores.

Clase Coordinadora (MotorReportes):

Funciona como el orquestador central. Posee una colección de objetos de tipo Exportable y cuenta con un método para procesar y ejecutar la conversión de un reporte financiero de manera masiva y unificada.

Class Principal (Main):

Se encarga de instanciar los diferentes exportadores, agregarlos a la colección del motor, y disparar el procesamiento polimórfico imprimiendo los resultados formateados por consola.
<img width="926" height="772" alt="Captura de pantalla 2026-10-28 102122" src="https://github.com/user-attachments/assets/76f86ee9-9d56-4b9a-b05b-7c4c16df6851" />
