//Controls the flow of the program

package com.tw.biblioteca;

public class Controller {

    private FirstMenu firstMenu;
    BookLibrary bookLibrary;
    MovieLibrary movieLibrary;

    public Controller(BookLibrary bookLibrary, MovieLibrary movieLibrary) {
        firstMenu = new FirstMenu();
        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
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
            Parser parser = new Parser(input(new ConsoleInput()), bookLibrary, movieLibrary);
            MenuItem menuItem = createMenuObject(parser);
            executeMenuObject(menuItem);
        }
    }
}
