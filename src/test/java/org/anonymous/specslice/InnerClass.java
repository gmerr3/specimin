package org.anonymous.specslice;

import java.io.IOException;
import org.junit.Test;

/**
 * This test checks that if SpecSlice will work properly where there are innerclasses in the input
 * code
 */
public class InnerClass {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "innerclass",
        new String[] {"com/example/OuterFamily.java"},
        new String[] {
          "com.example.OuterFamily#getLastName()",
          "com.example.OuterFamily.InnerFamily#getLastName()"
        });
  }
}
