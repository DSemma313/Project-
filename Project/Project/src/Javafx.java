// Create a vertical box layout with 10 pixels of spacing between elements
VBox root = new VBox(10); 

// Create a TableView to display a list of Game objects
TableView<Game> gameTable = new TableView<>(); 

// Create a button for adding a new game
Button addButton = new Button("Add Game"); 

// Create a button for sorting games by their genre
Button sortButton = new Button("Sort by Genre"); 

// Add the TableView and buttons to the VBox layout
root.getChildren().addAll(gameTable, addButton, sortButton);

// Create a Scene to hold the VBox layout, with dimensions 600x400 pixels
Scene scene = new Scene(root, 600, 400); 

// Set the Scene to the Stage (main application window)
primaryStage.setScene(scene); 

// Set the title of the application window
primaryStage.setTitle("Game Library"); 

// Display the application window
primaryStage.show(); 
