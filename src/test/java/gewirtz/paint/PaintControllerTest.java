package gewirtz.paint;

import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class PaintControllerTest {

    private PaintController controller;

    @BeforeClass
    public static void beforeClass() {
        com.sun.javafx.application.PlatformImpl.startup(()->{});
    }

    @Test
    public void onClearCanvas(){
        //given
        givenPaintController();

        //when
        controller.onClearCanvas();
        //then
        verify(controller.canvas.getGraphicsContext2D()).clearRect(0, 0,
                controller.canvas.getHeight(), controller.canvas.getWidth());

    }

    public void givenPaintController(){
        controller = new PaintController();
        controller.colorPicker = mock(ColorPicker.class);
        controller.eraser = mock(CheckBox.class);
        controller.canvas = mock(Canvas.class);
        controller.clearCanvas = mock(Button.class);

    }
}
