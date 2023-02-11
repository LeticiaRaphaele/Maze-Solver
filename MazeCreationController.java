import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MazeCreationController implements Initializable {

  final static int background = 0;
  final static int walls = 1;
  final static int pathCode = 2;
  final static int emptyCells = 3;
  final static int visitedCells = 4;

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



  public void initialize(URL location, ResourceBundle resource){
    color =  new Color[]{
      Color.WHITE,//color of the background
      Color.WHITE,//color the the walls
      Color.RED,//color of the path
      Color.BLACK,//color of the inicial cells
      Color.rgb(200,200,200)//color the the cells visited
    };

    gc = canvas.getGraphicsContext2D();//Return the Graphic Context for the canvas
    gc.setFill(color[background]);//set the color the canvas will be
    gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());//set the size, the wight and the plane of the canvas

    Thread runner = new Thread();
    runner.setDaemon(true);//Daemon threads are interruped when a main thread finish executing the program(clicking in the X)
    runner.start();
  }

  public void drawSquare(int row, int column, int colorC){
    //fil a especific square of the grid with the color specified by the 
    //color the code is refering, which has to be one of the static int 

    Platform.runLater( () ->{
      gc.setFill(color[colorC]);
      int x = blockSize*column;
      int y = blockSize*row;
      gc.fillRect(x,y, blockSize,blockSize);
    });
     
  }


  public Canvas getCanvas(){
    return this.canvas;
  }

}
