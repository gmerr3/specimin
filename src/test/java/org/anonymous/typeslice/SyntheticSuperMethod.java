package org.anonymous.typeslice;

import java.io.IOException;
import org.junit.Test;

/**
 * This test checks that if TypeSlice will work properly where there is a super method call while
 * the parent class file is not in the root directory physically
 */
public class SyntheticSuperMethod {
  @Test
  public void runTest() throws IOException {
    TypeSliceTestExecutor.runTestWithoutJarPaths(
        "syntheticsupermethod",
        new String[] {"com/example/Car.java"},
        new String[] {"com.example.Car#getWheels()"});
  }
}