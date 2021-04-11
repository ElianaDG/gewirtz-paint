package gewirtz.paint;

import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class PaintControllerTest {

    private PaintController controller;
    private Canvas canvas;
    private ColorPicker colorPicker;
    private CheckBox eraser;

    @BeforeClass
    public static void beforeClass() {
        com.sun.javafx.application.PlatformImpl.startup(()->{});
    }

    @Test
    public void testDraw_paint(){
        //given
        canvas = mock(Canvas.class);
        GraphicsContext context = canvas.getGraphicsContext2D();

        //when
        controller.draw();

        //then
        //verify that the path that the mouse was dragged on is filled w color
    }


    @Test
    public void testOnClearCanvas(){
        //given
        canvas = mock(Canvas.class);
        GraphicsContext context = canvas.getGraphicsContext2D();

        //when
        controller.onClearCanvas(mock(ActionEvent.class));

        //then
        //verify that the entire canvas is cleared, or just the
        //coordinates specified to the clearCanvas method
    }
}
