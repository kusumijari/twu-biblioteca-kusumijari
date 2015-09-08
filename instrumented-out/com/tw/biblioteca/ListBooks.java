//shows the list of books available in the library

package com.tw.biblioteca;

public class ListBooks implements MenuItem {
  static {
    CodeCoverCoverageCounter$37xtbhjvcrcf6bkki6fbkx.ping();
  }

    private Library library;
    private ConsoleOutput consoleOutput;

    public ListBooks(Library library) {
        this.library = library;
CodeCoverCoverageCounter$37xtbhjvcrcf6bkki6fbkx.statements[1]++;
    }

    @Override
    public void execute() {
        consoleOutput = new ConsoleOutput(getBooks());
CodeCoverCoverageCounter$37xtbhjvcrcf6bkki6fbkx.statements[2]++;
        consoleOutput.displayMessage();
CodeCoverCoverageCounter$37xtbhjvcrcf6bkki6fbkx.statements[3]++;
    }

    public String getBooks() {
        return library.toString();
    }
}

class CodeCoverCoverageCounter$37xtbhjvcrcf6bkki6fbkx extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "b84a8ec3-2731-45e5-a5c1-2583f02fc784").addObservedContainer(new CodeCoverCoverageCounter$37xtbhjvcrcf6bkki6fbkx ());
  }
    public static long[] statements = new long[4];
    public static long[] branches = new long[0];
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$37xtbhjvcrcf6bkki6fbkx () {
    super("com.tw.biblioteca.ListBooks.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 3; i++) {
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
    log.startNamedSection("com.tw.biblioteca.ListBooks.java");
      for (int i = 1; i <= 3; i++) {
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

