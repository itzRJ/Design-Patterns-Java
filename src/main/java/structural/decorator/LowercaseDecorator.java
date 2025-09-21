package structural.decorator;

public class LowercaseDecorator extends TextEditorDecorator{

    public LowercaseDecorator(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public String getText() {
        return this.textEditor.getText().toLowerCase();
    }
}
