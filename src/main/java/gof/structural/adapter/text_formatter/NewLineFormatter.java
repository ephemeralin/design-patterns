package gof.structural.adapter.text_formatter;

public class NewLineFormatter implements TextFormattable {

    @Override
    public String formatText(String text) {
        return text.replace(".", "\n");
    }
}
