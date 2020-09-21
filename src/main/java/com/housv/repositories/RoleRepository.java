package com.housv.repositories;

import com.housv.domains.entities.Role;

/**
 * Fresher-Training
 *
 * @author Huupd
 * @created_at 02/07/2020 - 1:55 PM
 * @created_by Huupd
 */
public interface RoleRepository extends BaseRepository<Role,Long> {
    Role findByName(String name);
}