//Parses the menu option entered by the user

package com.tw.biblioteca;

import java.util.ArrayList;

public class Parser {
  static {
    CodeCoverCoverageCounter$c7jzv3fosvccawach.ping();
  }

    private String option;

    public Parser(String option) {
        this.option = option;
CodeCoverCoverageCounter$c7jzv3fosvccawach.statements[1]++;
    }

    public boolean isValid() {
CodeCoverCoverageCounter$c7jzv3fosvccawach.statements[2]++;
int CodeCoverConditionCoverageHelper_C1;
        if((((((CodeCoverConditionCoverageHelper_C1 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C1 |= (32)) == 0 || true) &&
 ((option.matches("[0-9]+")) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (16)) == 0 || true)))
 && 
(((CodeCoverConditionCoverageHelper_C1 |= (8)) == 0 || true) &&
 ((convertOptionToInt() > 0) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (4)) == 0 || true)))
 && 
(((CodeCoverConditionCoverageHelper_C1 |= (2)) == 0 || true) &&
 ((convertOptionToInt() <= 2) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$c7jzv3fosvccawach.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 3) || true)) || (CodeCoverCoverageCounter$c7jzv3fosvccawach.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 3) && false) ) {
CodeCoverCoverageCounter$c7jzv3fosvccawach.branches[1]++;
            return true;

        } else {
  CodeCoverCoverageCounter$c7jzv3fosvccawach.branches[2]++;}
        return false;
    }

    private int convertOptionToInt() {
        return Integer.parseInt(option);
    }

    public MenuItem createMenuItem() {
CodeCoverCoverageCounter$c7jzv3fosvccawach.statements[3]++;
int CodeCoverConditionCoverageHelper_C2;
        if((((((CodeCoverConditionCoverageHelper_C2 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C2 |= (2)) == 0 || true) &&
 ((isValid()) && 
  ((CodeCoverConditionCoverageHelper_C2 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$c7jzv3fosvccawach.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 1) || true)) || (CodeCoverCoverageCounter$c7jzv3fosvccawach.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 1) && false)) {
CodeCoverCoverageCounter$c7jzv3fosvccawach.branches[3]++;
CodeCoverCoverageCounter$c7jzv3fosvccawach.statements[4]++;
int CodeCoverConditionCoverageHelper_C3;
            if ((((((CodeCoverConditionCoverageHelper_C3 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C3 |= (2)) == 0 || true) &&
 ((convertOptionToInt() == 1) && 
  ((CodeCoverConditionCoverageHelper_C3 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$c7jzv3fosvccawach.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 1) || true)) || (CodeCoverCoverageCounter$c7jzv3fosvccawach.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 1) && false)) {
CodeCoverCoverageCounter$c7jzv3fosvccawach.branches[5]++;
CodeCoverCoverageCounter$c7jzv3fosvccawach.statements[5]++;
                ArrayList<Book> list = new ArrayList<Book>();
CodeCoverCoverageCounter$c7jzv3fosvccawach.statements[6]++;
                Book book1 = new Book("Harry Potter", "J. K. Rowling", 1997);
CodeCoverCoverageCounter$c7jzv3fosvccawach.statements[7]++;
                Book book2 = new Book("Tale of Two Cities", "Charles Dickens", 1859);
                list.add(book1);
CodeCoverCoverageCounter$c7jzv3fosvccawach.statements[8]++;
                list.add(book2);
CodeCoverCoverageCounter$c7jzv3fosvccawach.statements[9]++;
                return new BookList(list);

            }
            else {
CodeCoverCoverageCounter$c7jzv3fosvccawach.branches[6]++;
CodeCoverCoverageCounter$c7jzv3fosvccawach.statements[10]++;
int CodeCoverConditionCoverageHelper_C4; if((((((CodeCoverConditionCoverageHelper_C4 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C4 |= (2)) == 0 || true) &&
 ((convertOptionToInt() == 2) && 
  ((CodeCoverConditionCoverageHelper_C4 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$c7jzv3fosvccawach.conditionCounters[4].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C4, 1) || true)) || (CodeCoverCoverageCounter$c7jzv3fosvccawach.conditionCounters[4].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C4, 1) && false)) {
CodeCoverCoverageCounter$c7jzv3fosvccawach.branches[7]++;
                return new Exit();

            } else {
  CodeCoverCoverageCounter$c7jzv3fosvccawach.branches[8]++;}
}

        } else {
  CodeCoverCoverageCounter$c7jzv3fosvccawach.branches[4]++;}
        return new InvalidMenuItem();
    }
}

class CodeCoverCoverageCounter$c7jzv3fosvccawach extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "1444954b-5a58-4c0b-ac21-4e241ff4ee4c").addObservedContainer(new CodeCoverCoverageCounter$c7jzv3fosvccawach ());
  }
    public static long[] statements = new long[11];
    public static long[] branches = new long[9];

  public static final org.codecover.instrumentation.java.measurement.ConditionCounter[] conditionCounters = new org.codecover.instrumentation.java.measurement.ConditionCounter[5];
  static {
    final String SECTION_NAME = "com.tw.biblioteca.Parser.java";
    final byte[] CONDITION_COUNTER_TYPES = {0,3,1,1,1};
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
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$c7jzv3fosvccawach () {
    super("com.tw.biblioteca.Parser.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 10; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= 8; i++) {
        branches[i] = 0L;
      }
    for (int i = 1; i <= 4; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].reset();
      }
    }
      for (int i = 1; i <= 0; i++) {
        loops[i] = 0L;
      }
  }

  public void serializeAndReset(org.codecover.instrumentation.measurement.CoverageCounterLog log) {
    log.startNamedSection("com.tw.biblioteca.Parser.java");
      for (int i = 1; i <= 10; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= 8; i++) {
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

