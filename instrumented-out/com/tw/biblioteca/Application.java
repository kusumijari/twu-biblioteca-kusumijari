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
        View view = new View("Welcome to Biblioteca");
        view.displayMessage();
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[4]++;
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[5]++;

        //while(true) {
            Menu menu = new Menu();
            view = new View(menu.toString());
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[6]++;
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[7]++;
            Parser parser = new Parser("1");
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[8]++;
            MenuItem menuItem = parser.createMenuItem();
            menuItem.execute();
CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt.statements[9]++;
        //}
    }
}

class CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "8ee6c6f4-f0a9-481d-9bd5-348057f94007").addObservedContainer(new CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt ());
  }
    public static long[] statements = new long[10];
    public static long[] branches = new long[0];
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$3vgwt0av9sl7ni17pa5o5qvdt () {
    super("com.tw.biblioteca.Application.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 9; i++) {
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
    log.startNamedSection("com.tw.biblioteca.Application.java");
      for (int i = 1; i <= 9; i++) {
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

