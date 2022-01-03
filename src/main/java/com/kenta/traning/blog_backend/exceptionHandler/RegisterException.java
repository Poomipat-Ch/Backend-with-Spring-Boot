package com.kenta.traning.blog_backend.exceptionHandler;

public class RegisterException extends BaseException{

    public RegisterException(String message) {
        super("Register:" + message);
    }

    public static RegisterException requestNull() { return new RegisterException("null request"); }

    public static RegisterException usernameNull() { return new RegisterException("register.username.null"); }

    public static RegisterException passwordNull() { return new RegisterException("register.password.null"); }

}
