package com.housv.services.impls;

import com.housv.domains.dtos.SubjectDTO;
import com.housv.domains.entities.Subject;
import com.housv.repositories.BaseRepository;
import com.housv.services.SubjectService;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Override
    public BaseRepository<Subject, Long> getDao() {
        return null;
    }

    @Override
    public Subject createDto(SubjectDTO dto) {
        return null;
    }

    @Override
    public void convertDtoToEntity(SubjectDTO dto, Subject entity) {

    }
}
