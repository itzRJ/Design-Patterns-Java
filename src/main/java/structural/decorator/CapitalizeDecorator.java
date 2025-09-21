package structural.decorator;

public class CapitalizeDecorator extends TextEditorDecorator{

    public CapitalizeDecorator(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public String getText() {
        String str = this.textEditor.getText();
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String word: words)
        {
            sb
                    .append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }
        return sb.toString().trim();
    }
}
