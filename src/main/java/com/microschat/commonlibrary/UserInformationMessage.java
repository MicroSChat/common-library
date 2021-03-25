package com.microschat.commonlibrary;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class UserInformationMessage implements Serializable {
    private String username;
    private String nickname;
    private String email;
    private String password;
}
