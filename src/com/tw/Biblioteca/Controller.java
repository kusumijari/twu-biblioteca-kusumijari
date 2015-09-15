//Controls the flow of the program

package com.tw.biblioteca;

public class Controller {

    private FirstMenu firstMenu;
    BookLibrary bookLibrary;
    MovieLibrary movieLibrary;
    Session session;

    public Controller(BookLibrary bookLibrary, MovieLibrary movieLibrary) {
        firstMenu = new FirstMenu();
        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
        session = new Session(new User("default", "nousername", "nopassword"));
    }

    public void showMenu(ConsoleOutput consoleOutput) {
        consoleOutput.displayMessage();
    }

    public String input(ConsoleInput consoleInput) {
        return consoleInput.getInput();
    }


    public MenuItem createMenuObject(Parser parser) {
        return parser.createMenuItem();
    }

    public void executeMenuObject(MenuItem menuItem) {
        menuItem.execute();
    }

    public void delegate() {
        while (true) {
            ConsoleOutput consoleOutput = new ConsoleOutput(firstMenu.toString());
            showMenu(consoleOutput);
            Parser parser = new Parser(input(new ConsoleInput()), bookLibrary, movieLibrary, session);
            MenuItem menuItem = createMenuObject(parser);
            executeMenuObject(menuItem);
        }
    }

    public Menu createMenuItem() {
        return new FirstMenu();
    }
}
