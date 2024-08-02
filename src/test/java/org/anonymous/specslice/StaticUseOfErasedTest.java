package org.anonymous.specslice;

import java.io.IOException;
import org.junit.Test;

/**
 * This test checks that a static use of a type in its erased form does not cause a crash, if that
 * type usually is not erased. Java Parser cannot resolve a type like "Baz" in "Baz.test()" if Baz
 * is defined elsewhere to have a type parameter.
 */
public class StaticUseOfErasedTest {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "staticuseoferased",
        new String[] {"com/example/Foo.java"},
        new String[] {"com.example.Foo#foo()"});
  }
}