package com.tmosest.competitiveprogramming.utils.string;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;
import java.util.Optional;

public class UtilSerializable {

  /**
   * Function to convert a string to a serializable.
   * @param object The object to convert.
   * @return An optional string of the serialized class.
   */
  public static Optional<String> convertToString(final Serializable object) {
    try (final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos)) {
      oos.writeObject(object);
      return Optional.of(Base64.getEncoder().encodeToString(baos.toByteArray()));
    } catch (final IOException e) {
      e.printStackTrace();
      return Optional.empty();
    }
  }

  /**
   * Converts a string to an object.
   * @param objectAsString The serialization of the class.
   * @param <T> What type we are expecting.
   * @return The class.
   */
  public static <T extends Serializable> Optional<T> convertFrom(final String objectAsString) {
    final byte[] data = Base64.getDecoder().decode(objectAsString);
    try (final ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
      return Optional.of((T) ois.readObject());
    } catch (final IOException | ClassNotFoundException e) {
      e.printStackTrace();
      return Optional.empty();
    }
  }
}
