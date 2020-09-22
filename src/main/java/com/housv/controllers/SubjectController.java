package com.housv.controllers;

import com.housv.domains.dtos.SubjectDTO;
import com.housv.domains.entities.Subject;
import com.housv.services.BaseService;
import com.housv.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subject")
public class SubjectController extends BaseController<Subject, SubjectDTO, Long>{
    private SubjectService subjectService;

    @Autowired
    public SubjectController(SubjectService subjectService){
        this.subjectService = subjectService;
    }

    @Override
    public BaseService<Subject, SubjectDTO, Long> getService() {
        return subjectService;
    }


    @GetMapping("/find")
    @PreAuthorize("hasRole('read_profile')")
    public String getAll(){
        return "may khong thoat dc dau con trai. tu bi con ti niu!";
    }

    @GetMapping("/edit")
    @PreAuthorize("hasRole('update_profile')")
    public String editorder(){
        return "edit  thanh cong!";
    }

    @GetMapping("/delete")
    @PreAuthorize("hasRole('delete_profile')")
    public String deleteorder(){
        return "delete  thanh cong!";
    }

}
