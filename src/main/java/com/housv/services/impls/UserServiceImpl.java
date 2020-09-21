package com.housv.services.impls;


import com.housv.domains.dtos.RoleDTO;
import com.housv.domains.dtos.UserDTO;
import com.housv.domains.entities.Role;
import com.housv.domains.entities.User;
import com.housv.repositories.BaseRepository;
import com.housv.repositories.UserRepository;
import com.housv.services.UserService;
import javassist.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Fresher-Training
 *
 * @author Huupd
 * @created_at 02/07/2020 - 2:01 PM
 * @created_by Huupd
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDTO getUserById(Long id) throws NotFoundException {
        List<UserDTO> list = new ArrayList<>();
        Optional<User> userEntity = userRepository.findById(id);
        if (!userEntity.isPresent()) {
            log.info("get id fail,id not found");
            throw new NotFoundException("Id not found");
        }
        log.info("Get  user by id  success");
        return modelMapper.map(userEntity.get(), UserDTO.class);
    }

    @Override
    public UserDTO findUserByUserName(String name) throws NotFoundException {
        User userEntity = userRepository.findByUsername(name);
        if (userEntity != null) {
            UserDTO userDTO = new UserDTO();
            userDTO.setId(userEntity.getId());
            userDTO.setUsername(userEntity.getUsername());
            userDTO.setEmail(userEntity.getEmail());
            userDTO.setPassword(userEntity.getPassword());
            List<Role> roleList = userEntity.getRoles();
            List<RoleDTO> roleDTOS = new ArrayList<>();
            for (Role role : roleList) {

                RoleDTO roleDTO = new RoleDTO();
                roleDTO.setId(role.getId());
                roleDTO.setName(role.getName());
                roleDTOS.add(roleDTO);
            }
            userDTO.setRoles(roleDTOS);
            log.info("Find User by name success!");
            return userDTO;

        } else {
            throw new NotFoundException("User " + name + "Not Found");
        }
    }

    @Override
    public BaseRepository<User, Long> getDao() {
        return null;
    }

    @Override
    public User createDto(UserDTO dto) {
        return null;
    }

    @Override
    public void convertDtoToEntity(UserDTO dto, User entity) {

    }
}
