package com.purbon.kafka.topology.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Utils {

  public static Stream<String> asNullableStream(List<String> items) {
    Optional<List<String>> optional = Optional.ofNullable(items);
    return optional.stream().flatMap(Collection::stream);
  }

  public static String readFullFile(Path path) throws IOException {
    return Files.readString(path);
  }

  public static Path filePath(String file, String rootPath) {
    Path mayBeAbsolutePath = Paths.get(file);
    Path path =
            mayBeAbsolutePath.isAbsolute() ? mayBeAbsolutePath : Paths.get(rootPath, file);
    //LOGGER.debug(String.format("SchemaFile %s loaded from %s", schemaFile, path));
    return path;
  }
}
