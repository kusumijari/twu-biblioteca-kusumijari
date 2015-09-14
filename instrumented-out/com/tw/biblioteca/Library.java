//Contains a list of books which can be displayed

package com.tw.biblioteca;

import java.util.ArrayList;

public class Library{
  static {
    CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.ping();
  }


    private ArrayList<Book> booklist = new ArrayList<Book>();
  {
    CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[1]++;
  }

    Library() {
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[2]++;
        Book book1 = new Book("Harry Potter", "J. K. Rowling", 1997);
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[3]++;
        Book book2 = new Book("Tale of Two Cities", "Charles Dickens", 1859);
        booklist.add(book1);
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[4]++;
        booklist.add(book2);
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[5]++;
    }

    @Override
    public String toString() {
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[6]++;
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Name\tAuthor\tYear\n");
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[7]++;
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[8]++;
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
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[9]++;
        }
        return stringBuilder.toString();
    }

    public boolean removeBook(Book nameOfBook) {
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[10]++;
int CodeCoverConditionCoverageHelper_C1;
        if((((((CodeCoverConditionCoverageHelper_C1 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C1 |= (2)) == 0 || true) &&
 ((booklist.contains(nameOfBook)) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) || true)) || (CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) && false)) {
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.branches[1]++;
            booklist.remove(nameOfBook);
CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.statements[11]++;
            return true;

        } else {
  CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1.branches[2]++;}
        return false;
    }

    /*public boolean exists(Book nameOfBook) {
        for(Book book : booklist){
            if(book.equals(nameOfBook)){
                return true;
            }
        }
        return false;
    }*/
}

class CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1 extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "857b4968-287e-4122-8127-af2cbbf654e2").addObservedContainer(new CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1 ());
  }
    public static long[] statements = new long[12];
    public static long[] branches = new long[3];

  public static final org.codecover.instrumentation.java.measurement.ConditionCounter[] conditionCounters = new org.codecover.instrumentation.java.measurement.ConditionCounter[2];
  static {
    final String SECTION_NAME = "com.tw.biblioteca.BookLibrary.java";
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
    public static long[] loops = new long[4];

  public CodeCoverCoverageCounter$2ajdxnz382yxmq4ezc1 () {
    super("com.tw.biblioteca.BookLibrary.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 11; i++) {
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
      for (int i = 1; i <= 3; i++) {
        loops[i] = 0L;
      }
  }

  public void serializeAndReset(org.codecover.instrumentation.measurement.CoverageCounterLog log) {
    log.startNamedSection("com.tw.biblioteca.BookLibrary.java");
      for (int i = 1; i <= 11; i++) {
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

