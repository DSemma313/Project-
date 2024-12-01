// Define a class to represent a video game
public class Game { 
    // Private field to store the title of the game
    private String title; 
    
    // Private field to store the genre of the game
    private String genre; 

    // Constructor to initialize a new Game object with a title and genre
    public Game(String title, String genre) { 
        this.title = title; // Assign the title parameter to the title field
        this.genre = genre; // Assign the genre parameter to the genre field
    }

    // Getter method to retrieve the title of the game
    public String getTitle() { 
        return title;
    }

    // Setter method to update the title of the game
    public void setTitle(String title) { 
        this.title = title;
    }

    // Getter method to retrieve the genre of the game
    public String getGenre() { 
        return genre;
    }

    // Setter method to update the genre of the game
    public void setGenre(String genre) { 
        this.genre = genre;
    }

    // Override the toString method to provide a readable representation of the game
    @Override
    public String toString() { 
        return title + " (" + genre + ")"; // Return a string with the title and genre
    }
}
