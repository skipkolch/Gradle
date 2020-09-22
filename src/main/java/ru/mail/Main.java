package ru.mail;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Main {
  private final @Nullable String name;

  public static void main(@NotNull String[] args) {
    System.out.println("Hello world");
  }

  public Main(@Nullable String name) {
    this.name = name;
  }
}
