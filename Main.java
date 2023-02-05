import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

      public static void main(String[] args) throws Exception {
        launch(args);
    }// fim do metodo

    public void start(Stage palco) throws Exception {
      Parent raiz = FXMLLoader.load(getClass().getResource("Canvas.fxml"));
      Scene scene = new Scene(raiz);
      palco.setTitle("Canvas");
      palco.sizeToScene();
      palco.setScene(scene);
      palco.show();
  }// fim do metodo
  }
