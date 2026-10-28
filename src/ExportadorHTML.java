public class ExportadorHTML extends Exportable{
    @Override
    public void exportar(String contenidoReporte) {
        System.out.println("[EXPORTADOR HTML] Preparando plantillas de marcado web...");
        System.out.println("-> Aplicando estilos CSS responsivos y etiquetas estructurales (<div>, <table>, <style>).");
        System.out.println("-> Contenido envuelto en marcado web:\n   <html><body>\n     " + contenidoReporte.replace("\n", "\n     ") + "\n   </body></html>");
        System.out.println("[EXPORTADOR HTML] Página generada con éxito: 'Reporte_Financiero.html'\n");
    }
}
