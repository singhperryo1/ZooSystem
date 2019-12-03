import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.HPos;
import javafx.geometry.Pos;


public class SavannaPageEmployee extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Employee: Savanna");

		Text text1 = new Text("Click on");
        Text text2 = new Text("animal to") ; 
        Text text3 = new Text("interact") ; 
		text1.setStyle("-fx-font-size: 40;");
		text2.setStyle("-fx-font-size: 40;");
		text3.setStyle("-fx-font-size: 40;");
		
		Image savannaImage = new Image("/images/SavannahView.png");
		ImageView savannaView = new ImageView(savannaImage);
		savannaView.setFitWidth(200);
		savannaView.setFitHeight(200);

		Image giraffeImage = new Image("/images/giraffe.png");
		ImageView giraffeView = new ImageView(giraffeImage);
		giraffeView.setFitWidth(200);
		giraffeView.setFitHeight(200);
		
		Button button = new Button();
		button.setText("Giraffe");
		button.setMaxHeight(200);
		button.setStyle("-fx-background-color: \n" + 
				"        #090a0c,\n" + 
				"        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n" + 
				"        linear-gradient(#20262b, #191d22),\n" + 
				"        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n" + 
				"    -fx-background-radius: 5,4,3,5;\n" + 
				"    -fx-background-insets: 0,1,2,0;\n" + 
				"    -fx-text-fill: white;\n" + 
				"    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" + 
				"    -fx-font-family: \"Arial\";\n" + 
				"    -fx-text-fill: linear-gradient(white, #d0d0d0);\n" + 
				"    -fx-font-size: 12px;\n" + 
				"    -fx-padding: 10 20 10 20;");
		button.setMaxHeight(20);
		button.setOnAction(e -> {
			giraffeE login = new giraffeE();
			try {
				login.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		
		Image zebraImage = new Image("/images/zebra.png");
		ImageView zebraView = new ImageView(zebraImage);
		zebraView.setFitWidth(200);
		zebraView.setFitHeight(200);

		Button button1 = new Button();
		button1.setText("Zebra");
		button1.setMaxHeight(200);
		button1.setStyle("-fx-background-color: \n" + 
				"        #090a0c,\n" + 
				"        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n" + 
				"        linear-gradient(#20262b, #191d22),\n" + 
				"        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n" + 
				"    -fx-background-radius: 5,4,3,5;\n" + 
				"    -fx-background-insets: 0,1,2,0;\n" + 
				"    -fx-text-fill: white;\n" + 
				"    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" + 
				"    -fx-font-family: \"Arial\";\n" + 
				"    -fx-text-fill: linear-gradient(white, #d0d0d0);\n" + 
				"    -fx-font-size: 12px;\n" + 
				"    -fx-padding: 10 20 10 20;");
		button1.setMaxHeight(20);
		button1.setOnAction(e -> {
			zebraE login = new zebraE();
			try {
				login.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		Image lionImage = new Image("/images/lion.png");
		ImageView lionView = new ImageView(lionImage);
		lionView.setFitWidth(200);
		lionView.setFitHeight(200);
		
		Button button2 = new Button();
		button2.setText("Lion");
		button2.setMaxHeight(200);
		button2.setStyle("-fx-background-color: \n" + 
				"        #090a0c,\n" + 
				"        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n" + 
				"        linear-gradient(#20262b, #191d22),\n" + 
				"        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n" + 
				"    -fx-background-radius: 5,4,3,5;\n" + 
				"    -fx-background-insets: 0,1,2,0;\n" + 
				"    -fx-text-fill: white;\n" + 
				"    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" + 
				"    -fx-font-family: \"Arial\";\n" + 
				"    -fx-text-fill: linear-gradient(white, #d0d0d0);\n" + 
				"    -fx-font-size: 12px;\n" + 
				"    -fx-padding: 10 20 10 20;");
		button2.setMaxHeight(20);
		button2.setOnAction(e -> {
			lionE login = new lionE();
			try {
				login.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);

		gridPane.add(text1, 1, 0);
		gridPane.add(text2, 2, 0); 
		gridPane.add(text3, 3, 0); 
		gridPane.add(savannaView, 0, 0);
		gridPane.add(giraffeView, 0, 1);
		gridPane.add(button, 0, 2);
        gridPane.add(button1, 1, 2); 
        gridPane.add(button2, 2, 2) ; 
		gridPane.add(zebraView, 1, 1);
		gridPane.add(lionView, 2, 1);

		gridPane.setHgap(85);
		gridPane.setVgap(80);
		
		gridPane.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
				+ "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: pink;"
				+ "-fx-background-color: white;");

		Scene scene = new Scene(gridPane, 1000, 700);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
