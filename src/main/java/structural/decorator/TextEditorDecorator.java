package structural.decorator;

public abstract class TextEditorDecorator extends TextEditor{

    protected final TextEditor textEditor;

    public TextEditorDecorator(TextEditor textEditor) {
        this.textEditor = textEditor;
    }
}
