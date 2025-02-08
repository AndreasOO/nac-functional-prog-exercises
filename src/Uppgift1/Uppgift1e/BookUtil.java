package Uppgift1.Uppgift1e;

import java.util.List;

public class BookUtil {
    List<Book> books;

    public BookUtil() {
        this.books = List.of(
                new Book("The Great Adventure", "John Doe", "Adventure", "Red", 9, "Library", true),
                new Book("Mystery in the Woods", "Jane Smith", "Mystery", "Blue", 8, "John", true),
                new Book("A Brave Heart", "Samuel Green", "Action", "Green", 10, "Sarah", true),
                new Book("Dreams of Tomorrow", "Emily White", "Science Fiction", "Yellow", 7, "Alice", true),
                new Book("Journey's End", "Michael Brown", "Fantasy", "Purple", 6, "Bob", true),
                new Book("The Silent Observer", "John Doe", "Thriller", "Black", 8, "Library", false),
                new Book("Secrets of the Past", "Jane Smith", "Historical", "Brown", 7, "John", false),
                new Book("Galactic Empire", "Samuel Green", "Sci-Fi", "Silver", 10, "Sarah", true),
                new Book("Beneath the Surface", "Emily White", "Drama", "Blue", 6, "Alice", false),
                new Book("The Fallen Star", "Michael Brown", "Fantasy", "Gold", 8, "Bob", true),
                new Book("The Journey of Souls", "John Doe", "Fantasy", "Orange", 9, "Library", true),
                new Book("Tales of the Unknown", "Jane Smith", "Adventure", "White", 8, "John", true),
                new Book("Dark Horizon", "Samuel Green", "Mystery", "Gray", 7, "Sarah", true),
                new Book("The Shattered Mirror", "Emily White", "Thriller", "Blue", 6, "Alice", false),
                new Book("In the Realm of the Gods", "Michael Brown", "Fantasy", "Purple", 10, "Bob", true),
                new Book("The Secret Key", "John Doe", "Mystery", "Red", 8, "Library", false),
                new Book("Wings of Fate", "Jane Smith", "Fantasy", "Yellow", 7, "John", true),
                new Book("Echoes of the Past", "Samuel Green", "Historical", "Green", 9, "Sarah", false),
                new Book("The Last Hope", "Emily White", "Sci-Fi", "Black", 6, "Alice", true),
                new Book("Rise of the Kingdom", "Michael Brown", "Action", "Silver", 10, "Bob", true),
                new Book("Whispers in the Dark", "John Doe", "Horror", "Orange", 8, "Library", true),
                new Book("The Dreamcatcher", "Jane Smith", "Fantasy", "Purple", 7, "John", true),
                new Book("Unseen Forces", "Samuel Green", "Adventure", "Blue", 6, "Sarah", false),
                new Book("The Lost City", "Emily White", "Mystery", "Yellow", 9, "Alice", true),
                new Book("The Phantom", "Michael Brown", "Thriller", "Red", 10, "Bob", true),
                new Book("Shadows of Tomorrow", "John Doe", "Sci-Fi", "Green", 8, "Library", true),
                new Book("Beyond the Horizon", "Jane Smith", "Drama", "Blue", 7, "John", false),
                new Book("The Edge of the World", "Samuel Green", "Adventure", "Silver", 6, "Sarah", true),
                new Book("The Forgotten Realm", "Emily White", "Fantasy", "Purple", 9, "Alice", true),
                new Book("Voices of the Night", "Michael Brown", "Horror", "Black", 7, "Bob", false),
                new Book("The Eternal Flame", "John Doe", "Fantasy", "Red", 10, "Library", true),
                new Book("Into the Abyss", "Jane Smith", "Action", "Gray", 6, "John", true),
                new Book("The Secret Garden", "Samuel Green", "Romance", "Blue", 8, "Sarah", true),
                new Book("Warriors of the Light", "Emily White", "Sci-Fi", "Green", 9, "Andreas", false),
                new Book("The Darkest Hour", "Michael Brown", "Thriller", "Yellow", 7, "Bob", true),
                new Book("The White Tower", "John Doe", "Fantasy", "Purple", 10, "Library", true),
                new Book("The Queen's Curse", "Jane Smith", "Historical", "Silver", 8, "John", false),
                new Book("The Serpent's Shadow", "Samuel Green", "Mystery", "Black", 9, "Sarah", true),
                new Book("Beneath the Stars", "Emily White", "Romance", "Red", 6, "Andreas", true),
                new Book("Kingdom of Ashes", "Michael Brown", "Action", "Orange", 8, "Bob", true),
                new Book("The Broken Chain", "John Doe", "Fantasy", "Yellow", 7, "Library", false),
                new Book("Shattered Dreams", "Jane Smith", "Drama", "Purple", 10, "John", true),
                new Book("The Phantom's Curse", "Samuel Green", "Thriller", "Gray", 9, "Andreas", true),
                new Book("The Hidden World", "Emily White", "Adventure", "Blue", 8, "Alice", false),
                new Book("The Last Kingdom", "Michael Brown", "Fantasy", "Silver", 7, "Bob", true),
                new Book("Echoes of Eternity", "John Doe", "Sci-Fi", "Red", 6, "Library", true),
                new Book("The Silver Blade", "Jane Smith", "Fantasy", "Green", 9, "John", true),
                new Book("War of Shadows", "Samuel Green", "Action", "Purple", 10, "Sarah", true),
                new Book("The Fire Within", "Emily White", "Adventure", "Orange", 8, "Alice", false),
                new Book("A Light in the Dark", "Michael Brown", "Romance", "Black", 7, "Bob", true)
        );
    }

    public List<Book> getBooks() {
        return books;
    }
}
