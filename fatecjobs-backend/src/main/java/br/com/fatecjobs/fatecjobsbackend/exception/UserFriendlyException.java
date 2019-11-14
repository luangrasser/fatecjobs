package br.com.fatecjobs.fatecjobsbackend.exception;

import javax.naming.AuthenticationException;

public class UserFriendlyException extends AuthenticationException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public UserFriendlyException(String msg) {
        super(msg);
    }
}
