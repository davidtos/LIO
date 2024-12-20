package com.davidvlijmincx.lio;

import com.davidvlijmincx.lio.LIO.lib.JLibUring;
import com.davidvlijmincx.lio.LIO.lib.ReadRequest;
import com.davidvlijmincx.lio.LIO.lib.WriteRequest;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {
    public static void main(String[] args) {
        try (JLibUring JLibUring = new JLibUring(5, true)) {

            String myContent = "Hello from, IO_Uring";

            WriteRequest writeRequest = JLibUring.prepareWrite("./tmp_file", myContent.getBytes(), 0);
            JLibUring.submit();
            writeRequest.waitForWriteToFinish();

            ReadRequest readRequest = JLibUring.submitRead("./tmp_file_read", 5, 5);
            JLibUring.submit();
            System.out.println(UTF_8.decode(readRequest.getData().asByteBuffer()));
            readRequest.freeBuffer();
        }
    }
}