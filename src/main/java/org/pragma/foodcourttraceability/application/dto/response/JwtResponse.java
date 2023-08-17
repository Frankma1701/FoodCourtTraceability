package org.pragma.foodcourttraceability.application.dto.response;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtResponse{
    private String token;
}
