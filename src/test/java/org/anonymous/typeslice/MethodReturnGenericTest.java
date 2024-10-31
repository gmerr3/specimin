package org.anonymous.typeslice;

import java.io.IOException;
import org.junit.Test;

/**
 * This test checks that TypeSlice includes the fully qualified class name in generics when
 * generating a synthetic method. For example, if a return type is Foo<Bar>, TypeSlice should always
 * generate the synthetic method return type as com.example.Foo<com.other.Bar>.
 */
public class MethodReturnGenericTest {
  @Test
  public void runTest() throws IOException {
    TypeSliceTestExecutor.runTestWithoutJarPaths(
        "methodreturngeneric",
        new String[] {"com/example/Simple.java"},
        new String[] {
          "com.example.Simple#foo()", "com.example.Simple#bar()", "com.example.Simple#baz()"
        });
  }
}