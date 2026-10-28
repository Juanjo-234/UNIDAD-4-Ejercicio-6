import java.util.ArrayList;
import java.util.List;

public class MotorReportes {
    private List<Exportable> exportadores;

    public MotorReportes() {
        this.exportadores = new ArrayList<>();
    }

    public void registrarExportador(Exportable exportador) {
        exportadores.add(exportador);
    }


    public void procesarReporteMasivo(String contenidoReporte) {
        System.out.println("==========================================================");
        System.out.println("       INICIANDO PROCESAMIENTO MASIVO DE REPORTES         ");
        System.out.println("==========================================================");

        if (exportadores.isEmpty()) {
            System.out.println("No hay exportadores registrados en el motor.");
            return;
        }

        for(Exportable exportador : exportadores){
            exportador.exportar(contenidoReporte);
        }
        System.out.println("==========================================================");
        System.out.println("         PROCESO MASIVO FINALIZADO CON ÉXITO              ");
        System.out.println("==========================================================");
    }

}
