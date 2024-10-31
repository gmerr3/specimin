package org.anonymous.typeslice;

import java.io.IOException;
import org.junit.Test;

/**
 * A test for a crash related to method signatures that occurred in Randoop:
 * https://github.com/njit-jerse/specSlice/issues/154
 */
public class MethodRef2Test {
  @Test
  public void runTest() throws IOException {
    TypeSliceTestExecutor.runTestWithoutJarPaths(
        "methodref2",
        new String[] {"com/example/Simple.java"},
        new String[] {"com.example.Simple#bar()"});
  }
}
