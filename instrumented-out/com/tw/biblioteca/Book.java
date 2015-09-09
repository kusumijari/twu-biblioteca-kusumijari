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

    @Override
    public boolean equals(Object that) {
CodeCoverCoverageCounter$76mvy2cvdcgd41.statements[4]++;
int CodeCoverConditionCoverageHelper_C1;
        if((((((CodeCoverConditionCoverageHelper_C1 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C1 |= (8)) == 0 || true) &&
 ((that == null) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (4)) == 0 || true)))
 || 
(((CodeCoverConditionCoverageHelper_C1 |= (2)) == 0 || true) &&
 ((that.getClass() != Book.class) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$76mvy2cvdcgd41.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 2) || true)) || (CodeCoverCoverageCounter$76mvy2cvdcgd41.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 2) && false) ) {
CodeCoverCoverageCounter$76mvy2cvdcgd41.branches[1]++;
            return false;

        } else {
  CodeCoverCoverageCounter$76mvy2cvdcgd41.branches[2]++;}
CodeCoverCoverageCounter$76mvy2cvdcgd41.statements[5]++;
        Book thatBook = (Book)that;
CodeCoverCoverageCounter$76mvy2cvdcgd41.statements[6]++;
int CodeCoverConditionCoverageHelper_C2;
        if((((((CodeCoverConditionCoverageHelper_C2 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C2 |= (2)) == 0 || true) &&
 (((this.name).equals(thatBook.name)) && 
  ((CodeCoverConditionCoverageHelper_C2 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$76mvy2cvdcgd41.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 1) || true)) || (CodeCoverCoverageCounter$76mvy2cvdcgd41.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 1) && false)){
CodeCoverCoverageCounter$76mvy2cvdcgd41.branches[3]++;
            return true;

        } else {
  CodeCoverCoverageCounter$76mvy2cvdcgd41.branches[4]++;}
        return false;
    }

    @Override
    public int hashCode() {
CodeCoverCoverageCounter$76mvy2cvdcgd41.statements[7]++;
        int hash = 0;
CodeCoverCoverageCounter$76mvy2cvdcgd41.statements[8]++;
int CodeCoverConditionCoverageHelper_C3;
        if((((((CodeCoverConditionCoverageHelper_C3 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C3 |= (2)) == 0 || true) &&
 ((this != null) && 
  ((CodeCoverConditionCoverageHelper_C3 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$76mvy2cvdcgd41.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 1) || true)) || (CodeCoverCoverageCounter$76mvy2cvdcgd41.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 1) && false)) {
CodeCoverCoverageCounter$76mvy2cvdcgd41.branches[5]++;
CodeCoverCoverageCounter$76mvy2cvdcgd41.statements[9]++;
byte CodeCoverTryBranchHelper_L1 = 0;
CodeCoverCoverageCounter$76mvy2cvdcgd41.loops[1]++;


int CodeCoverConditionCoverageHelper_C4;
            for (int i = 0;(((((CodeCoverConditionCoverageHelper_C4 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C4 |= (2)) == 0 || true) &&
 ((i < name.length()) && 
  ((CodeCoverConditionCoverageHelper_C4 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$76mvy2cvdcgd41.conditionCounters[4].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C4, 1) || true)) || (CodeCoverCoverageCounter$76mvy2cvdcgd41.conditionCounters[4].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C4, 1) && false); i++) {
if (CodeCoverTryBranchHelper_L1 == 0) {
  CodeCoverTryBranchHelper_L1++;
  CodeCoverCoverageCounter$76mvy2cvdcgd41.loops[1]--;
  CodeCoverCoverageCounter$76mvy2cvdcgd41.loops[2]++;
} else if (CodeCoverTryBranchHelper_L1 == 1) {
  CodeCoverTryBranchHelper_L1++;
  CodeCoverCoverageCounter$76mvy2cvdcgd41.loops[2]--;
  CodeCoverCoverageCounter$76mvy2cvdcgd41.loops[3]++;
}
                hash = Character.getNumericValue(name.charAt(i)) + (hash << 6) + (hash << 16) - hash;
CodeCoverCoverageCounter$76mvy2cvdcgd41.statements[10]++;
            }

        } else {
  CodeCoverCoverageCounter$76mvy2cvdcgd41.branches[6]++;}
        return hash;

    }
}

class CodeCoverCoverageCounter$76mvy2cvdcgd41 extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "857b4968-287e-4122-8127-af2cbbf654e2").addObservedContainer(new CodeCoverCoverageCounter$76mvy2cvdcgd41 ());
  }
    public static long[] statements = new long[11];
    public static long[] branches = new long[7];

  public static final org.codecover.instrumentation.java.measurement.ConditionCounter[] conditionCounters = new org.codecover.instrumentation.java.measurement.ConditionCounter[5];
  static {
    final String SECTION_NAME = "com.tw.biblioteca.Book.java";
    final byte[] CONDITION_COUNTER_TYPES = {0,2,1,1,1};
    for (int i = 1; i <= 4; i++) {
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

  public CodeCoverCoverageCounter$76mvy2cvdcgd41 () {
    super("com.tw.biblioteca.Book.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 10; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= 6; i++) {
        branches[i] = 0L;
      }
    for (int i = 1; i <= 4; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].reset();
      }
    }
      for (int i = 1; i <= 3; i++) {
        loops[i] = 0L;
      }
  }

  public void serializeAndReset(org.codecover.instrumentation.measurement.CoverageCounterLog log) {
    log.startNamedSection("com.tw.biblioteca.Book.java");
      for (int i = 1; i <= 10; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= 6; i++) {
        if (branches[i] != 0L) {
          log.passCounter("B"+ i, branches[i]);
          branches[i] = 0L;
        }
      }
    for (int i = 1; i <= 4; i++) {
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

