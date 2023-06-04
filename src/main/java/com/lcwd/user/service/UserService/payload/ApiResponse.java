package com.lcwd.user.service.UserService.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse {

    private String massage;
    private boolean success;
    private HttpStatus status;
}
