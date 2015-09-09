package com.tw.biblioteca;

public class Application {
  static {
    CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.ping();
  }

    public static void main(String[] args) {
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[1]++;
        Application application = new Application();
        application.start();
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[2]++;
    }

    private void start() {
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[3]++;
        ConsoleOutput consoleOutput = new ConsoleOutput("Welcome to Biblioteca");
        consoleOutput.displayMessage();
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[4]++;
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[5]++;
byte CodeCoverTryBranchHelper_L1 = 0;
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.loops[1]++;



        while(true) {
if (CodeCoverTryBranchHelper_L1 == 0) {
  CodeCoverTryBranchHelper_L1++;
  CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.loops[1]--;
  CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.loops[2]++;
} else if (CodeCoverTryBranchHelper_L1 == 1) {
  CodeCoverTryBranchHelper_L1++;
  CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.loops[2]--;
  CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.loops[3]++;
}
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[6]++;
            Menu menu = new Menu();
            consoleOutput = new ConsoleOutput(menu.toString());
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[7]++;
            consoleOutput.displayMessage();
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[8]++;
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[9]++;

            ConsoleInput consoleInput = new ConsoleInput();
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[10]++;
            Parser parser = new Parser(consoleInput.getInput(), library);
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[11]++;
            MenuItem menuItem = parser.createMenuItem();
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[12]++;
            ConsoleOutput consoleOutput1 = new ConsoleOutput(menuItem.execute());
            consoleOutput1.displayMessage();
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[13]++;
        }
    }
}

class CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "857b4968-287e-4122-8127-af2cbbf654e2").addObservedContainer(new CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt ());
  }
    public static long[] statements = new long[14];
    public static long[] branches = new long[0];
    public static long[] loops = new long[4];

  public CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt () {
    super("com.tw.biblioteca.Application.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 13; i++) {
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
    log.startNamedSection("com.tw.biblioteca.Application.java");
      for (int i = 1; i <= 13; i++) {
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

