package net.javaguides.springboot.springsecurity.Exception;

public class FileStorageException extends Throwable {

    private static final long serialVersionUID = 1L;
    private String msg;

    public FileStorageException(String msg) {
        this.msg = msg;

    }

    public String getMsg() {
        return msg;
    }
}

