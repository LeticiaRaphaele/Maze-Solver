import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

      public static void main(String[] args) throws Exception {
        launch(args);
    }// fim do metodo

    public void start(Stage palco) throws Exception {
      MazeCreationController mcc = new MazeCreationController();
      Pane root = new Pane(mcc.getCanvas());
      Scene scene = new Scene(root);
      palco.setTitle("Canvas");
      palco.sizeToScene();
      palco.setScene(scene);
      palco.show();
  }// fim do metodo
  }
