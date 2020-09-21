package com.housv.services;


import com.housv.domains.dtos.RoleDTO;
import com.housv.domains.dtos.UserDTO;
import com.housv.domains.entities.Role;
import com.housv.domains.entities.User;
import javassist.NotFoundException;

/**
 * Fresher-Training
 *
 * @author Namtt
 * @created_at 02/07/2020 - 10:33 AM
 * @created_by Namtt
 * @since 02/07/2020
 */

public interface UserService extends BaseService<User, UserDTO, Long>{
    UserDTO findUserByUserName(String name) throws NotFoundException;

    UserDTO getUserById(Long id) throws NotFoundException;

}
