package com.app.dtos;

import lombok.*;

@Data
@NoArgsConstructor
public class UserDTO {
    private long id;
    @Getter @Setter private String firstName;
    private String lastName;
    private String email;
}
