package gof.structural.adapter.csv_formatter;

public class CsvFormatter implements CsvFormattable {

    @Override
    public String formatCsvText(String text) {
        return text.replace(".", ",");
    }
}
