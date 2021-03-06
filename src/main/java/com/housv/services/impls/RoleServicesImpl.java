package com.housv.services.impls;

import com.housv.domains.dtos.RoleDTO;
import com.housv.domains.entities.Role;
import com.housv.repositories.BaseRepository;
import com.housv.repositories.RoleRepository;
import com.housv.services.RoleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Fresher-Training
 *
 * @author Huupd
 * @created_at 02/07/2020 - 2:01 PM
 * @created_by Huupd
 */
@Service
public class RoleServicesImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public RoleDTO findByName(String username) {
        Role role = roleRepository.findByName(username);
        return modelMapper.map(role,RoleDTO.class);
    }

    @Override
    public List<RoleDTO> findByUsersUserName(String userName) {
        List<RoleDTO> roleResponses = new ArrayList<>();
//        List<Role> roleList = roleRepository.findAllByUserUsername(userName);
//        for (Role role : roleList ){
//            RoleDTO roleResponse = modelMapper.map(role,RoleDTO.class);
//            roleResponses.add(roleResponse);
//        }
        return roleResponses;
    }

    @Override
    public BaseRepository<Role, Long> getDao() {
        return null;
    }

    @Override
    public Role createDto(RoleDTO dto) {
        return null;
    }

    @Override
    public void convertDtoToEntity(RoleDTO dto, Role entity) {

    }
}
