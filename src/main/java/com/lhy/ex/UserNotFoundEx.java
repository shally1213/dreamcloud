package com.lhy.ex;

/**
 * @Author pq
 * @Date 2021/5/24 23:31
 * @Description TODO
 */
public class UserNotFoundEx extends BaseEx{
    public UserNotFoundEx() {
        super();
    }

    public UserNotFoundEx(String message) {
        super(message);
    }

    public UserNotFoundEx(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundEx(Throwable cause) {
        super(cause);
    }

    protected UserNotFoundEx(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
