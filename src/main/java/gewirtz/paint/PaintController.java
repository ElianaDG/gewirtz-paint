package gewirtz.paint;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;

public class PaintController {

    @FXML
    private Canvas canvas;

    @FXML
    private CheckBox eraser;

    @FXML
    private ColorPicker colorPicker;

    GraphicsContext context = canvas.getGraphicsContext2D();


    public void initialize(){
        canvas.setOnMouseDragged(e -> {
            if(eraser.isSelected()){
                context.clearRect(e.getX(),e.getY(),5,5);
            } else {
                context.setFill(colorPicker.getValue());
                context.fillRect(e.getX(), e.getY(), canvas.getWidth(), canvas.getHeight());
            }
        });
    }

    public void onClearCanvas(){
        context.clearRect(0,0, canvas.getWidth(), canvas.getHeight());
    }


}
