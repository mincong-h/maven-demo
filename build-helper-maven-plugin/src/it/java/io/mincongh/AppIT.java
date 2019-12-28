package io.mincongh;

import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppIT {
  @Test
  public void shouldAnswerWithTrue() throws Exception {
    var pathStr = getClass().getClassLoader().getResource("app.conf").getFile();
    assertEquals("foo=bar\n", Files.readString(Path.of(pathStr)));
  }
}
