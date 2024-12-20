How to use 


```java
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
```