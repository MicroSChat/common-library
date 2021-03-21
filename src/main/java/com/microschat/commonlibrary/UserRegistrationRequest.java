package com.microschat.commonlibrary;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class UserRegistrationRequest {
    private String username;
    private String nickname;
    private String email;
    private String password;
}
