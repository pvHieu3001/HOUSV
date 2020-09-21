package com.housv.services;


import com.housv.domains.dtos.RoleDTO;
import com.housv.domains.entities.Role;

import java.util.List;

/**
 * Fresher-Training
 *
 * @author Huupd
 * @created_at 02/07/2020 - 1:54 PM
 * @created_by Huupd
 */
public interface RoleService extends BaseService<Role, RoleDTO, Long>{
    public RoleDTO findByName(String username);
    List<RoleDTO> findByUsersUserName(String userName);
}
