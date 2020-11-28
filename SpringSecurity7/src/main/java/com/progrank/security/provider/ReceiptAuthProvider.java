package com.progrank.security.provider;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.progrank.security.auth.ReceiptAuthentication;
import com.progrank.security.repo.ReceiptManager;

@Component
public class ReceiptAuthProvider implements AuthenticationProvider {

    @Autowired
    private ReceiptManager receiptManager;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String receiptNo = authentication.getName();
        boolean flag = receiptManager.contains(receiptNo);

        if (flag) {
            return new ReceiptAuthentication(receiptNo, null, null);
        }

        throw new BadCredentialsException("Failed!!");
    }

    @Override
    public boolean supports(Class<?> auth) {
        return ReceiptAuthentication.class.equals(auth);
    }
}