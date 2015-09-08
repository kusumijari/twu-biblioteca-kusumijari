//Checks out a book from the library

package com.tw.biblioteca;

public class Checkout implements MenuItem{
  static {
    CodeCoverCoverageCounter$eds20578rzh5p5b70msh.ping();
  }


    String bookNameChoice;
    Library library;
    ConsoleOutput consoleOutput;
    ConsoleInput consoleInput;
    Book book;


    Checkout(Library library) {
        this.library = library;
CodeCoverCoverageCounter$eds20578rzh5p5b70msh.statements[1]++;
        consoleInput = new ConsoleInput();
CodeCoverCoverageCounter$eds20578rzh5p5b70msh.statements[2]++;
    }

    public String acceptBookChoice(ConsoleInput consoleInput) {
        return consoleInput.getInput();
    }

    @Override
    public void execute() {
        bookNameChoice = acceptBookChoice(consoleInput);
CodeCoverCoverageCounter$eds20578rzh5p5b70msh.statements[3]++;
        consoleOutput = new ConsoleOutput(currentListOfBooks());
CodeCoverCoverageCounter$eds20578rzh5p5b70msh.statements[4]++;
        consoleOutput.displayMessage();
CodeCoverCoverageCounter$eds20578rzh5p5b70msh.statements[5]++;
    }

    private String currentListOfBooks() {
        return library.removeBook(bookToBeCheckedOut());
    }

    private Book bookToBeCheckedOut() {
        return new Book(bookNameChoice, "author", 0);
    }

}

class CodeCoverCoverageCounter$eds20578rzh5p5b70msh extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "2e5e5b2f-b407-4c98-8fa0-918336090532").addObservedContainer(new CodeCoverCoverageCounter$eds20578rzh5p5b70msh ());
  }
    public static long[] statements = new long[6];
    public static long[] branches = new long[0];
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$eds20578rzh5p5b70msh () {
    super("com.tw.biblioteca.Checkout.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 5; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= -1; i++) {
        branches[i] = 0L;
      }
      for (int i = 1; i <= 0; i++) {
        loops[i] = 0L;
      }
  }

  public void serializeAndReset(org.codecover.instrumentation.measurement.CoverageCounterLog log) {
    log.startNamedSection("com.tw.biblioteca.Checkout.java");
      for (int i = 1; i <= 5; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= -1; i++) {
        if (branches[i] != 0L) {
          log.passCounter("B"+ i, branches[i]);
          branches[i] = 0L;
        }
      }
      for (int i = 1; i <= 0; i++) {
        if (loops[i * 3 - 2] != 0L) {
          log.passCounter("L" + i + "-0", loops[i * 3 - 2]);
          loops[i * 3 - 2] = 0L;
        }
        if ( loops[i * 3 - 1] != 0L) {
          log.passCounter("L" + i + "-1", loops[i * 3 - 1]);
          loops[i * 3 - 1] = 0L;
        }
        if ( loops[i * 3] != 0L) {
          log.passCounter("L" + i + "-2", loops[i * 3]);
          loops[i * 3] = 0L;
        }
      }
  }
}

