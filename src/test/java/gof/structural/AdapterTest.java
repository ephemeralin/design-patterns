package gof.structural;

import gof.structural.adapter.CsvAdapterImp;
import gof.structural.adapter.csv_formatter.CsvFormattable;
import gof.structural.adapter.csv_formatter.CsvFormatter;
import gof.structural.adapter.text_formatter.NewLineFormatter;
import gof.structural.adapter.text_formatter.TextFormattable;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AdapterTest {

    @Test
    public void newLineFormatterTest() {
        String testString = " Formatting line 1. Formatting line 2. Formatting line 3.";
        TextFormattable newLineFormatter = new NewLineFormatter();
        String resultString = newLineFormatter.formatText(testString);

        String expectedString = " Formatting line 1\n" +
                " Formatting line 2\n" +
                " Formatting line 3\n";

        assertThat(resultString, is(expectedString));
    }

    @Test
    public void csvFormatterTest() {
        String testString = " Formatting line 1. Formatting line 2. Formatting line 3.";
        CsvFormattable csvFormatter = new CsvFormatter();
        TextFormattable csvAdapter = new CsvAdapterImp(csvFormatter);
        String resultString = csvAdapter.formatText(testString);

        String expectedString = " Formatting line 1, Formatting line 2, Formatting line 3,";

        assertThat(resultString, is(expectedString));
    }
}
