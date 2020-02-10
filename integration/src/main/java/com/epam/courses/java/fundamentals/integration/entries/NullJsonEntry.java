package com.epam.courses.java.fundamentals.integration.entries;

import com.epam.courses.java.fundamentals.integration.visitors.JsonEntryVisitor;
import lombok.experimental.SuperBuilder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuperBuilder(toBuilder = true)
public class NullJsonEntry extends JsonEntry<Object> {

  @Override
  @Nullable
  @Contract(pure = true)
  public Object getValue() {
    return null;
  }

  static NullJsonEntry from(String name) {
    return NullJsonEntry.builder().key(name).build();
  }

  @Override
  public void visit(@NotNull JsonEntryVisitor jsonEntryVisitor) {
    jsonEntryVisitor.accept(this);
  }
}
