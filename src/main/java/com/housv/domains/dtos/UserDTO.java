package com.housv.domains.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Fresher-Training
 *
 * @author Tung lam
 * @created_at 06/07/2020 - 10:41
 * @created_by Tung lam
 * @since 06/07/2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO extends IdDTO {
    private String username;
    private String password;
    private String email;
    private boolean enabled;
    private boolean accountNonExpired;
    private boolean credentialsNonExpired;
    private boolean accountNonLocked;
    private List<RoleDTO> roles;
}
