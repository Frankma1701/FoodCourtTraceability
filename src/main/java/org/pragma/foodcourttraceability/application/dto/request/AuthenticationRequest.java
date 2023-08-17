package org.pragma.foodcourttraceability.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AuthenticationRequest{
    private String email;
    private String password;
}
