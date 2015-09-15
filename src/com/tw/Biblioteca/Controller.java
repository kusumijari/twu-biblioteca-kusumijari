//Controls the flow of the program

package com.tw.biblioteca;

public class Controller {

    private DefaultMenu defaultMenu;
    BookLibrary bookLibrary;
    MovieLibrary movieLibrary;
    Session session;

    public Controller(BookLibrary bookLibrary, MovieLibrary movieLibrary, Session session) {
        defaultMenu = new DefaultMenu();
        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
        this.session = session;
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
            ConsoleOutput consoleOutput = new ConsoleOutput(defaultMenu.toString());
            showMenu(consoleOutput);
            Parser parser = new Parser(input(new ConsoleInput()), bookLibrary, movieLibrary, session);
            MenuItem menuItem = createMenuObject(parser);
            executeMenuObject(menuItem);
        }
    }

    public Menu createMenuItem() {
        if(session.getUser().getRole().equals("Customer")){
            return new UserMenu();
        }
        return new DefaultMenu();
    }
}
