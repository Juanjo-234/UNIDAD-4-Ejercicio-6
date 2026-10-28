//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String reporteFinanciero = "PERIODO: Q3 2026\n" + "Ingresos Totales: $1,450,000.00\n" + "Costos Operativos: $820,000.00\n" + "Utilidad Neta: $630,000.00\n" + "Estado: APROBADO";

    MotorReportes motor = new MotorReportes();

    motor.registrarExportador(new ExportadorPDF());
    motor.registrarExportador(new ExportadorExcel());
    motor.registrarExportador(new ExportadorHTML());

    motor.procesarReporteMasivo(reporteFinanciero);
}
