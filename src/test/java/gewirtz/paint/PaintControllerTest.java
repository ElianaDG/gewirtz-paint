package gewirtz.paint;

import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class PaintControllerTest {

    private PaintController controller;
    private Canvas canvas;
    private ColorPicker colorPicker;
    private Button clearCanvas;

    @BeforeClass
    public static void beforeClass() {
        com.sun.javafx.application.PlatformImpl.startup(()->{});
    }

    @Test
    public void draw(){
        //given
        controller = new PaintController();
        ColorPicker colorPicker = mock(ColorPicker.class);

        //when
        controller.draw();

        //then
        verify(colorPicker.getValue());
    }


    @Test
    public void onClearCanvas(){
        //given
        Canvas canvas = mock(Canvas.class);
        GraphicsContext context = canvas.getGraphicsContext2D();
        Button clearCanvas = mock(Button.class);

        //when
        clearCanvas.isPressed();

        //then
        verify(context.getCanvas());
    }
}
