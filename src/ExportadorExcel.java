public class ExportadorExcel extends Exportable{
    @Override
    public void exportar(String contenidoReporte) {
        System.out.println("[EXPORTADOR Excel] Conectando con las hojas de calculo...");
        System.out.println("-> Aplicando estilos de celdas (Formato Tabular, Cabeceras con filtros, Celdas de moneda).");
        System.out.println("-> Contenido procesado y distribuido en filas/columnas:\n   " + contenidoReporte.replace("\n", "\n   "));
        System.out.println("[EXPORTADOR Excel] Archivo generado con éxito: 'Reporte_Financiero.xlsx'\n");
    }
}
