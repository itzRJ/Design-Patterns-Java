package structural.decorator;

public class UppercaseDecorator extends TextEditorDecorator{

    public UppercaseDecorator(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public String getText() {
        return this.textEditor.getText().toUpperCase();
    }
}
