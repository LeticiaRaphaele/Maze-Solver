import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MazeCreationController {

  @FXML
  private GraphicsContext gc;//graphics contex for the drawing on the canvas,
  private Canvas canvas;
  private Color[] color;// The colors associeted with the constants bellow.
  private int rows = 50;//Number of rows of the cells in the maze, the wall around the edges are included
  private int cols = 50;//Number of columns of the cells in the maze, the wall around the edges are included
  private int blockSize = 6;// the size of each cell
  private int sleepTime = 5000;//the wait time ater solving the maze before begginig anew.
  private int sleepT = 20; // the delay between the steps of making and solving the maze.
  private int[][] maze;//the maze is created based on the bollean value of true or false, where the places that you can go to is true
  //and the walls are false, to do it there is need for a 2d array where the joining of rows and columns form 
  //the plane the maze will become.

  public void start(Stage stage){
    color =  new Color[]{
      Color.WHITE,//color of the background
      Color.WHITE,//color the the walls
      Color.RED,//color of the path
      Color.BLACK,//color of the inicial cells
      Color.rgb(200,200,200)//color the the cells visited
    };

  }



}
