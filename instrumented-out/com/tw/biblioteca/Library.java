//Contains a list of books which can be displayed

package com.tw.biblioteca;

import java.util.ArrayList;

public class Library implements MenuItem{
  static {
    CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.ping();
  }


    ArrayList<Book> booklist= new ArrayList<Book>();
  {
    CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[1]++;
  }

    Library(ArrayList<Book> booklist) {
        this.booklist = booklist;
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[2]++;
    }


    @Override
    public void execute() {
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[3]++;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name\tAuthor\tYear\n");
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[4]++;
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[5]++;
byte CodeCoverTryBranchHelper_L1 = 0;
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.loops[1]++;



        for(Book book : booklist) {
if (CodeCoverTryBranchHelper_L1 == 0) {
  CodeCoverTryBranchHelper_L1++;
  CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.loops[1]--;
  CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.loops[2]++;
} else if (CodeCoverTryBranchHelper_L1 == 1) {
  CodeCoverTryBranchHelper_L1++;
  CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.loops[2]--;
  CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.loops[3]++;
}
            stringBuilder.append(book.toString()+"\n");
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[6]++;
        }

        System.out.print(stringBuilder.toString());
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[7]++;
    }
}

class CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1 extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "cc82c718-cbd6-4165-a35b-95c28286de3f").addObservedContainer(new CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1 ());
  }
    public static long[] statements = new long[8];
    public static long[] branches = new long[0];
    public static long[] loops = new long[4];

  public CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1 () {
    super("com.tw.biblioteca.Library.java");
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
    log.startNamedSection("com.tw.biblioteca.Library.java");
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

