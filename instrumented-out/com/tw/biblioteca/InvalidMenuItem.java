//Tells the user to enter a valid menu option

package com.tw.biblioteca;

public class InvalidMenuItem implements MenuItem{
  static {
    CodeCoverCoverageCounter$8kslbrqesm7jjakfe6at3iw06xiq5wh.ping();
  }


    String errorMessage;
    ConsoleOutput consoleOutput;
    InvalidMenuItem() {

        this.errorMessage = "Select a valid option!";
CodeCoverCoverageCounter$8kslbrqesm7jjakfe6at3iw06xiq5wh.statements[1]++;
        consoleOutput = new ConsoleOutput(errorMessage);
CodeCoverCoverageCounter$8kslbrqesm7jjakfe6at3iw06xiq5wh.statements[2]++;
    }

    public void execute() {

        System.out.println(errorMessage);
CodeCoverCoverageCounter$8kslbrqesm7jjakfe6at3iw06xiq5wh.statements[3]++;
    }

}

class CodeCoverCoverageCounter$8kslbrqesm7jjakfe6at3iw06xiq5wh extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "b84a8ec3-2731-45e5-a5c1-2583f02fc784").addObservedContainer(new CodeCoverCoverageCounter$8kslbrqesm7jjakfe6at3iw06xiq5wh ());
  }
    public static long[] statements = new long[4];
    public static long[] branches = new long[0];
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$8kslbrqesm7jjakfe6at3iw06xiq5wh () {
    super("com.tw.biblioteca.InvalidMenuItem.java");
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
    log.startNamedSection("com.tw.biblioteca.InvalidMenuItem.java");
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

