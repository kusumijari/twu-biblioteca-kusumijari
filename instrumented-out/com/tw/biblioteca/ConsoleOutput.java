//Interacts with the user

package com.tw.biblioteca;

public class ConsoleOutput {
  static {
    CodeCoverCoverageCounter$5lvtga7ugu3kp77gezq90rir8spt.ping();
  }


    String message;

    public ConsoleOutput(String message) {

        this.message = message;
CodeCoverCoverageCounter$5lvtga7ugu3kp77gezq90rir8spt.statements[1]++;
    }

    public void displayMessage() {

        System.out.println(message);
CodeCoverCoverageCounter$5lvtga7ugu3kp77gezq90rir8spt.statements[2]++;
    }

}

class CodeCoverCoverageCounter$5lvtga7ugu3kp77gezq90rir8spt extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "b84a8ec3-2731-45e5-a5c1-2583f02fc784").addObservedContainer(new CodeCoverCoverageCounter$5lvtga7ugu3kp77gezq90rir8spt ());
  }
    public static long[] statements = new long[3];
    public static long[] branches = new long[0];
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$5lvtga7ugu3kp77gezq90rir8spt () {
    super("com.tw.biblioteca.ConsoleOutput.java");
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
    log.startNamedSection("com.tw.biblioteca.ConsoleOutput.java");
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

