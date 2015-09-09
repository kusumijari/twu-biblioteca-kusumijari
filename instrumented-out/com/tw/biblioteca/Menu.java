//contains a menu list that can be displayed

package com.tw.biblioteca;

import java.util.ArrayList;

public class Menu {
  static {
    CodeCoverCoverageCounter$8db22my9e9gj8h.ping();
  }

    ArrayList<String> menu= new ArrayList<String>();
  {
    CodeCoverCoverageCounter$8db22my9e9gj8h.statements[1]++;
  }
    Menu() {
        menu.add("1. List Books");
CodeCoverCoverageCounter$8db22my9e9gj8h.statements[2]++;
        menu.add("2. CheckoutBook");
CodeCoverCoverageCounter$8db22my9e9gj8h.statements[3]++;
        menu.add("3. Exit");
CodeCoverCoverageCounter$8db22my9e9gj8h.statements[4]++;
    }

    @Override
    public String toString() {
CodeCoverCoverageCounter$8db22my9e9gj8h.statements[5]++;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Menu\n");
CodeCoverCoverageCounter$8db22my9e9gj8h.statements[6]++;
CodeCoverCoverageCounter$8db22my9e9gj8h.statements[7]++;
byte CodeCoverTryBranchHelper_L1 = 0;
CodeCoverCoverageCounter$8db22my9e9gj8h.loops[1]++;


        for(String menuItem : menu){
if (CodeCoverTryBranchHelper_L1 == 0) {
  CodeCoverTryBranchHelper_L1++;
  CodeCoverCoverageCounter$8db22my9e9gj8h.loops[1]--;
  CodeCoverCoverageCounter$8db22my9e9gj8h.loops[2]++;
} else if (CodeCoverTryBranchHelper_L1 == 1) {
  CodeCoverTryBranchHelper_L1++;
  CodeCoverCoverageCounter$8db22my9e9gj8h.loops[2]--;
  CodeCoverCoverageCounter$8db22my9e9gj8h.loops[3]++;
}
            stringBuilder.append(menuItem+"\n");
CodeCoverCoverageCounter$8db22my9e9gj8h.statements[8]++;
        }
        return stringBuilder.toString();
    }
}

class CodeCoverCoverageCounter$8db22my9e9gj8h extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "b353f5b3-fc2b-414c-88ba-15a18545c504").addObservedContainer(new CodeCoverCoverageCounter$8db22my9e9gj8h ());
  }
    public static long[] statements = new long[9];
    public static long[] branches = new long[0];
    public static long[] loops = new long[4];

  public CodeCoverCoverageCounter$8db22my9e9gj8h () {
    super("com.tw.biblioteca.Menu.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 8; i++) {
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
    log.startNamedSection("com.tw.biblioteca.Menu.java");
      for (int i = 1; i <= 8; i++) {
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

