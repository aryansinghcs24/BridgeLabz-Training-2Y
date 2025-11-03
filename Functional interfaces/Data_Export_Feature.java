interface ReportExporter {
    void exportAsCSV(String data);
    void exportAsPDF(String data);

    default void exportToJSON(String data) {
        System.out.println("{ \"report\": \"" + data.replace("\"", "\\\"") + "\" }");
    }
}

class CSVExporter implements ReportExporter {
    @Override
    public void exportAsCSV(String data) {
        System.out.println("Exported as CSV: " + data);
    }
    @Override
    public void exportAsPDF(String data) {
        System.out.println("Exported as PDF: " + data);
    }
}

class AdvancedExporter implements ReportExporter {
    @Override
    public void exportAsCSV(String data) {
        System.out.println("Advanced CSV Export: " + data);
    }
    @Override
    public void exportAsPDF(String data) {
        System.out.println("Advanced PDF Export: " + data);
    }
    @Override
    public void exportToJSON(String data) {
        System.out.println("{\n  \"ADVANCED_REPORT\": \"" + data.replace("\"", "\\\"") + "\"\n}");
    }
}

public class Data_Export_Feature {
    public static void main(String[] args) {
        ReportExporter csvExporter = new CSVExporter();
        csvExporter.exportAsCSV("Monthly Revenue Data");
        csvExporter.exportToJSON("Monthly Revenue Data"); 

        ReportExporter advExporter = new AdvancedExporter();
        advExporter.exportToJSON("Yearly Summary"); 
    }
}
