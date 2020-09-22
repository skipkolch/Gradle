package test.module;

import org.jetbrains.annotations.NotNull;

public final class TestPojo {
  private final @NotNull String nameOne;
  private final @NotNull String nameTwo;

  public TestPojo(@NotNull String nameOne, @NotNull String nameTwo) {
    this.nameOne = nameOne;
    this.nameTwo = nameTwo;
  }

  @Override
  public @NotNull String toString() {
    return nameOne + ' ' + nameTwo;
  }
}
