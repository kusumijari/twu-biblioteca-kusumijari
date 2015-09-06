//Contains book details in a certain format

package com.tw.biblioteca;

public class Book {
  static {
    CodeCoverCoverageCounter$76mvy2cvdcgd41.ping();
  }

    private String name, author;
    private int yearOfPublication;

    public Book(String name, String author, int yearOfPublication) {
        this.name = name;
CodeCoverCoverageCounter$76mvy2cvdcgd41.statements[1]++;
        this.author = author;
CodeCoverCoverageCounter$76mvy2cvdcgd41.statements[2]++;
        this. yearOfPublication = yearOfPublication;
CodeCoverCoverageCounter$76mvy2cvdcgd41.statements[3]++;
    }

    @Override
    public String toString() {

        return (name+"\t"+author+"\t"+yearOfPublication);
    }

}

class CodeCoverCoverageCounter$76mvy2cvdcgd41 extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "1e72f43a-c56c-4eb9-b941-30775e66654e").addObservedContainer(new CodeCoverCoverageCounter$76mvy2cvdcgd41 ());
  }
    public static long[] statements = new long[4];
    public static long[] branches = new long[0];
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$76mvy2cvdcgd41 () {
    super("com.tw.biblioteca.Book.java");
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
    log.startNamedSection("com.tw.biblioteca.Book.java");
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

