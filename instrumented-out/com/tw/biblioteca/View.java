//Interacts with the user

package com.tw.biblioteca;

import java.util.Scanner;

public class View {
  static {
    CodeCoverCoverageCounter$9cekq05zmc7k9t.ping();
  }


    String message;

    public View(String message) {

        this.message = message;
CodeCoverCoverageCounter$9cekq05zmc7k9t.statements[1]++;
    }

    public void displayMessage() {

        System.out.println(message);
CodeCoverCoverageCounter$9cekq05zmc7k9t.statements[2]++;
    }

    public String getInput() {
CodeCoverCoverageCounter$9cekq05zmc7k9t.statements[3]++;
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}

class CodeCoverCoverageCounter$9cekq05zmc7k9t extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "cc82c718-cbd6-4165-a35b-95c28286de3f").addObservedContainer(new CodeCoverCoverageCounter$9cekq05zmc7k9t ());
  }
    public static long[] statements = new long[4];
    public static long[] branches = new long[0];
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$9cekq05zmc7k9t () {
    super("com.tw.biblioteca.View.java");
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
    log.startNamedSection("com.tw.biblioteca.View.java");
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

