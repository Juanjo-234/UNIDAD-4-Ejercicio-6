public class ExportadorPDF extends Exportable{
    @Override
    public void exportar(String contenidoReporte) {
        System.out.println("[EXPORTADOR PDF] Inicializando motor de renderizado de documentos...");
        System.out.println("-> Aplicando estilos de página (Márgenes: A4, Fuentes incrustadas, Encabezado corporativo).");
        System.out.println("-> Contenido procesado:\n   " + contenidoReporte.replace("\n", "\n   "));
        System.out.println("[EXPORTADOR PDF] Archivo generado con éxito: 'Reporte_Financiero.pdf'\n");
    }
}
