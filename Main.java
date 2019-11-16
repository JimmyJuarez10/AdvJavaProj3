package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane bPane = new BorderPane();

        Button home = new Button("Home");
        home.getStyleClass().add("button");

        Button cart = new Button("Cart");
        cart.getStyleClass().add("button");

        ToolBar navbar = new ToolBar();
        navbar.getItems().addAll(home,cart);
        navbar.getStyleClass().add("navbar");

        Button addCustomer = new Button("+ Customer");
        addCustomer.setId("addButton");
        Button removeCustomer = new Button("- Customer");
        removeCustomer.setId("removeButton");

        ToolBar toolBar2 = new ToolBar();
        toolBar2.setOrientation(Orientation.VERTICAL);
        toolBar2.getItems().addAll(
                new Separator(),
                addCustomer,
                removeCustomer,
                new Separator()
        );

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(3, 0, 0, 10));

        for (int x = 0 ; x < 6 ; x++)
        {
            ColumnConstraints cc = new ColumnConstraints();
            cc.setFillWidth(true);
            cc.setHgrow(Priority.ALWAYS);
            grid.getColumnConstraints().add(cc);
        }

        for (int y = 0 ; y < 10 ; y++)
        {
            RowConstraints rc = new RowConstraints();
            rc.setFillHeight(true);
            rc.setVgrow(Priority.ALWAYS);
            grid.getRowConstraints().add(rc);
        }

        Label header = new Label("Products:");
        header.setFont(Font.font("Arial", FontWeight.THIN, 20));
        grid.add(header, 0, 0);

        Label Item = new Label("Item");
        grid.add(Item, 0, 1);

        Label Description = new Label("Description");
        grid.add(Description, 1, 1);

        Label aisle = new Label("Aisle");
        grid.add(aisle, 2, 1);

        Label Price = new Label("Price");
        grid.add(Price, 3, 1);

        //Setting the top, bottom, center, right and left nodes to the pane
        bPane.setTop(navbar);
        bPane.setLeft(toolBar2);
        bPane.setCenter(grid);

        Scene scene = new Scene(bPane, 600, 400);
        scene.getStylesheets().add("sample/styles.css");

        //Setting title to the Stage
        primaryStage.setTitle("Team 2 Store");

        //Adding scene to the stage
        primaryStage.setScene(scene);

        //Displaying the contents of the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
