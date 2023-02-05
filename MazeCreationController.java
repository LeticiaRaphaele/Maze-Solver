import javafx.fxml.FXML;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;


public class MazeCreationController {


    @FXML
    private GridPane baseGrid;
    
    public void canvasControll(){
        baseGrid.getColumnConstraints().add(new ColumnConstraints(400));
        baseGrid.getRowConstraints().add(new RowConstraints(400));
    }
}
