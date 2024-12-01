// Import necessary classes for working with observable lists in JavaFX
import javafx.collections.FXCollections; 
import javafx.collections.ObservableList; 

// Define a class to manage the game library
public class GameLibrary { 
    // ObservableList to store a dynamic list of Game objects
    private ObservableList<Game> games = FXCollections.observableArrayList(); 

    // Method to add a new game to the library
    public void addGame(String title, String genre) { 
        games.add(new Game(title, genre)); // Create a new Game and add it to the list
    }

    // Method to sort the games in the library by their genre
    public void sortByGenre() { 
        games.sort((g1, g2) -> g1.getGenre().compareToIgnoreCase(g2.getGenre())); 
        // Sort the games alphabetically by genre, ignoring case differences
    }

    // Method to retrieve the list of games
    public ObservableList<Game> getGames() { 
        return games; // Return the observable list of games
    }
}
