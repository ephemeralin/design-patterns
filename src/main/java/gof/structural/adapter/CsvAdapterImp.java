package gof.structural.adapter;

import gof.structural.adapter.csv_formatter.CsvFormattable;
import gof.structural.adapter.text_formatter.TextFormattable;

public class CsvAdapterImp implements TextFormattable {

    private CsvFormattable csvFormatter;

    public CsvAdapterImp(CsvFormattable csvFormatter) {
        this.csvFormatter = csvFormatter;
    }

    @Override
    public String formatText(String text) {
        return csvFormatter.formatCsvText(text);
    }
}
