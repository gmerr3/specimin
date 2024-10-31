package org.anonymous.typeslice;

import java.io.IOException;
import org.junit.Test;

/**
 * This test checks that if the targeted method calls a method imported from java.util library,
 * TypeSlice will not create synthetic file for that method and only return the targeted file with
 * the targeted method.
 */
public class CallJDK {
  @Test
  public void runTest() throws IOException {
    TypeSliceTestExecutor.runTestWithoutJarPaths(
        "callJDK",
        new String[] {"com/example/Simple.java"},
        new String[] {"com.example.Simple#test()"});
  }
}
