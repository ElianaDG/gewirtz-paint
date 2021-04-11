package gewirtz.paint;

import javafx.event.ActionEvent;
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


    public void draw(){
        GraphicsContext context = canvas.getGraphicsContext2D();
        canvas.setOnMouseDragged(e -> {
            if(eraser.isSelected()){
                context.clearRect(e.getX(),e.getY(),6,6);
            } else {
                context.setFill(colorPicker.getValue());
                context.fillOval(e.getX(), e.getY(), 6, 6);
            }
        });
    }


    public void onClearCanvas(ActionEvent actionEvent){
        GraphicsContext context = canvas.getGraphicsContext2D();
        context.clearRect(0,0, canvas.getWidth(), canvas.getHeight());
    }


}

