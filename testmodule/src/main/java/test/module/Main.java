package test.module;

import org.jetbrains.annotations.NotNull;

public final class Main {
  public static void main(@NotNull String[] args) {
    final TestPojo pojo = new TestPojo(args[0], args[1]);
    System.out.println(pojo);
  }
}
