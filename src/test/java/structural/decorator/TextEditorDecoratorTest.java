package structural.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TextEditorDecoratorTest {

    @Test
    public void testUppercaseDecorator() {
        TextEditor textEditor = new UppercaseDecorator(new SimpleTextEditor("Hello World"));
        assertEquals("HELLO WORLD", textEditor.getText());
    }

    @Test
    public void testLowercaseDecorator() {
        TextEditor textEditor = new LowercaseDecorator(new SimpleTextEditor("Hello World"));
        assertEquals("hello world", textEditor.getText());
    }

    @Test
    public void testCapitalizeDecorator() {
        TextEditor textEditor = new CapitalizeDecorator(new SimpleTextEditor("hello world"));
        assertEquals("Hello World", textEditor.getText());
    }

    @Test
    public void testCombinedDecorators() {
        TextEditor textEditor = new UppercaseDecorator(new CapitalizeDecorator(new LowercaseDecorator(new SimpleTextEditor("hELLO wORLD"))));
        assertEquals("HELLO WORLD", textEditor.getText());
    }

}
