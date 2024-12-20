package com.davidvlijmincx.lio;

import com.davidvlijmincx.lio.lib.JLibUring;
import com.davidvlijmincx.lio.lib.ReadRequest;
import com.davidvlijmincx.lio.lib.WriteRequest;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {
    public static void main(String[] args) {
        try (JLibUring jLibUring = new JLibUring(5, true)) {

            String myContent = "Hello from, IO_Uring";

            WriteRequest writeRequest = jLibUring.prepareWrite("./tmp_file", myContent.getBytes(), 0);
            jLibUring.submit();
            writeRequest.waitForWriteToFinish();

            ReadRequest readRequest = jLibUring.submitRead("./tmp_file_read", 5, 5);
            jLibUring.submit();
            System.out.println(UTF_8.decode(readRequest.getData().asByteBuffer()));
            readRequest.freeBuffer();
        }
    }
}