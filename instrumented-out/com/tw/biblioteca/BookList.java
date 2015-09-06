//Contains a list of books which can be displayed

package com.tw.biblioteca;

import java.util.ArrayList;

public class BookList implements MenuItem{
  static {
    CodeCoverCoverageCounter$e6b4rt4ctc7yojpgfq75.ping();
  }


    ArrayList<Book> booklist= new ArrayList<Book>();
  {
    CodeCoverCoverageCounter$e6b4rt4ctc7yojpgfq75.statements[1]++;
  }

    BookList(ArrayList<Book> booklist) {
        this.booklist = booklist;
CodeCoverCoverageCounter$e6b4rt4ctc7yojpgfq75.statements[2]++;
    }


    @Override
    public void execute() {
CodeCoverCoverageCounter$e6b4rt4ctc7yojpgfq75.statements[3]++;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name\tAuthor\tYear\n");
CodeCoverCoverageCounter$e6b4rt4ctc7yojpgfq75.statements[4]++;
CodeCoverCoverageCounter$e6b4rt4ctc7yojpgfq75.statements[5]++;
byte CodeCoverTryBranchHelper_L1 = 0;
CodeCoverCoverageCounter$e6b4rt4ctc7yojpgfq75.loops[1]++;



        for(Book book : booklist) {
if (CodeCoverTryBranchHelper_L1 == 0) {
  CodeCoverTryBranchHelper_L1++;
  CodeCoverCoverageCounter$e6b4rt4ctc7yojpgfq75.loops[1]--;
  CodeCoverCoverageCounter$e6b4rt4ctc7yojpgfq75.loops[2]++;
} else if (CodeCoverTryBranchHelper_L1 == 1) {
  CodeCoverTryBranchHelper_L1++;
  CodeCoverCoverageCounter$e6b4rt4ctc7yojpgfq75.loops[2]--;
  CodeCoverCoverageCounter$e6b4rt4ctc7yojpgfq75.loops[3]++;
}
            stringBuilder.append(book.toString()+"\n");
CodeCoverCoverageCounter$e6b4rt4ctc7yojpgfq75.statements[6]++;
        }

        System.out.print(stringBuilder.toString());
CodeCoverCoverageCounter$e6b4rt4ctc7yojpgfq75.statements[7]++;
    }
}

class CodeCoverCoverageCounter$e6b4rt4ctc7yojpgfq75 extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "8ee6c6f4-f0a9-481d-9bd5-348057f94007").addObservedContainer(new CodeCoverCoverageCounter$e6b4rt4ctc7yojpgfq75 ());
  }
    public static long[] statements = new long[8];
    public static long[] branches = new long[0];
    public static long[] loops = new long[4];

  public CodeCoverCoverageCounter$e6b4rt4ctc7yojpgfq75 () {
    super("com.tw.biblioteca.BookList.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 7; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= -1; i++) {
        branches[i] = 0L;
      }
      for (int i = 1; i <= 3; i++) {
        loops[i] = 0L;
      }
  }

  public void serializeAndReset(org.codecover.instrumentation.measurement.CoverageCounterLog log) {
    log.startNamedSection("com.tw.biblioteca.BookList.java");
      for (int i = 1; i <= 7; i++) {
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
      for (int i = 1; i <= 1; i++) {
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

