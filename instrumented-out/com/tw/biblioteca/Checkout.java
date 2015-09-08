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
        book = new Book(bookNameChoice, "author", 0);
CodeCoverCoverageCounter$eds20578rzh5p5b70msh.statements[4]++;
CodeCoverCoverageCounter$eds20578rzh5p5b70msh.statements[5]++;
int CodeCoverConditionCoverageHelper_C1;
        if((((((CodeCoverConditionCoverageHelper_C1 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C1 |= (2)) == 0 || true) &&
 ((hasBeenCheckedOut(book)) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$eds20578rzh5p5b70msh.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) || true)) || (CodeCoverCoverageCounter$eds20578rzh5p5b70msh.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) && false)) {
CodeCoverCoverageCounter$eds20578rzh5p5b70msh.branches[1]++;
            consoleOutput = new ConsoleOutput("Thank You! Enjoy the book.");
CodeCoverCoverageCounter$eds20578rzh5p5b70msh.statements[6]++;
            consoleOutput.displayMessage();
CodeCoverCoverageCounter$eds20578rzh5p5b70msh.statements[7]++;
            System.out.print(library.toString());
CodeCoverCoverageCounter$eds20578rzh5p5b70msh.statements[8]++;

        }
        else {
CodeCoverCoverageCounter$eds20578rzh5p5b70msh.branches[2]++;
            consoleOutput = new ConsoleOutput("That book is not available");
CodeCoverCoverageCounter$eds20578rzh5p5b70msh.statements[9]++;
            consoleOutput.displayMessage();
CodeCoverCoverageCounter$eds20578rzh5p5b70msh.statements[10]++;

        }
    }

    public boolean hasBeenCheckedOut(Book book) {
        return library.removeBook(book);
    }
}

class CodeCoverCoverageCounter$eds20578rzh5p5b70msh extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "b84a8ec3-2731-45e5-a5c1-2583f02fc784").addObservedContainer(new CodeCoverCoverageCounter$eds20578rzh5p5b70msh ());
  }
    public static long[] statements = new long[11];
    public static long[] branches = new long[3];

  public static final org.codecover.instrumentation.java.measurement.ConditionCounter[] conditionCounters = new org.codecover.instrumentation.java.measurement.ConditionCounter[2];
  static {
    final String SECTION_NAME = "com.tw.biblioteca.Checkout.java";
    final byte[] CONDITION_COUNTER_TYPES = {0,1};
    for (int i = 1; i <= 1; i++) {
      switch (CONDITION_COUNTER_TYPES[i]) {
        case 0 : break;
        case 1 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallOneConditionCounter(SECTION_NAME, "C" + i); break;
        case 2 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallTwoConditionCounter(SECTION_NAME, "C" + i); break;
        case 3 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.MediumConditionCounter(SECTION_NAME, "C" + i); break;
        case 4 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.LargeConditionCounter(SECTION_NAME, "C" + i); break;
      }
    }
  }
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$eds20578rzh5p5b70msh () {
    super("com.tw.biblioteca.Checkout.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 10; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= 2; i++) {
        branches[i] = 0L;
      }
    for (int i = 1; i <= 1; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].reset();
      }
    }
      for (int i = 1; i <= 0; i++) {
        loops[i] = 0L;
      }
  }

  public void serializeAndReset(org.codecover.instrumentation.measurement.CoverageCounterLog log) {
    log.startNamedSection("com.tw.biblioteca.Checkout.java");
      for (int i = 1; i <= 10; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= 2; i++) {
        if (branches[i] != 0L) {
          log.passCounter("B"+ i, branches[i]);
          branches[i] = 0L;
        }
      }
    for (int i = 1; i <= 1; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].serializeAndReset(log);
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

