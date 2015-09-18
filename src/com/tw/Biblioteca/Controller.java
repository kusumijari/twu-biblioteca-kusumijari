//Controls the flow of the program

package com.tw.biblioteca;

public class Controller {

    BookLibrary bookLibrary;
    MovieLibrary movieLibrary;
    Session session;

    public Controller(BookLibrary bookLibrary, MovieLibrary movieLibrary, Session session) {
        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
        this.session = session;
    }

    public void showMenu() {
        ConsoleOutput consoleOutput = new ConsoleOutput(MenuItem().toString());
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
            showMenu();
            Parser parser = new Parser(input(new ConsoleInput()), bookLibrary, movieLibrary, session);
            MenuItem menuItem = createMenuObject(parser);
            executeMenuObject(menuItem);
        }
    }

    public Menu MenuItem() {
        if(session.getUser().getRole().equals("Customer")){
            return new CustomerMenu();
        }
        else if(session.getUser().getRole().equals("Librarian")){
            return new LibrarianMenu();
        }
        return new DefaultMenu();
    }
}
