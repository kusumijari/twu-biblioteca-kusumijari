//Receives input fromt the user

package com.tw.biblioteca;

import java.util.Scanner;

public class ConsoleInput {
  static {
    CodeCoverCoverageCounter$se1buoq7zqdgwppb4l63sbusf5.ping();
  }


    String message;

    public String getInput() {
CodeCoverCoverageCounter$se1buoq7zqdgwppb4l63sbusf5.statements[1]++;
        Scanner scanner = new Scanner(System.in);
        message = scanner.nextLine();
CodeCoverCoverageCounter$se1buoq7zqdgwppb4l63sbusf5.statements[2]++;
        return message;
    }
}

class CodeCoverCoverageCounter$se1buoq7zqdgwppb4l63sbusf5 extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "b84a8ec3-2731-45e5-a5c1-2583f02fc784").addObservedContainer(new CodeCoverCoverageCounter$se1buoq7zqdgwppb4l63sbusf5 ());
  }
    public static long[] statements = new long[3];
    public static long[] branches = new long[0];
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$se1buoq7zqdgwppb4l63sbusf5 () {
    super("com.tw.biblioteca.ConsoleInput.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 2; i++) {
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
    log.startNamedSection("com.tw.biblioteca.ConsoleInput.java");
      for (int i = 1; i <= 2; i++) {
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
