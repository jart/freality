import junit.framework.TestSuite;

/**
 * This is a convenient target for the build system to invoke all of
 * the unit tests.
 *
 * @author Pablo Mayrgundter
 */
public class AllTests {

  /**
   * Creates a suite of all unit tests in this package and
   * sub-packages.
   */
  public static TestSuite suite() {
    TestSuite suite = new TestSuite();
    suite.addTest(algs.AllTests.suite());
    return suite;
  }

  /**
   * Runnable as:
   *
   *   java AllTests
   */
  public static void main(final String [] args) {
    junit.textui.TestRunner.run(suite());
  }
}
