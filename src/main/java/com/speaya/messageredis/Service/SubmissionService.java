package com.speaya.messageredis.Service;

import com.speaya.messageredis.Repository.SubmissionRepository;
import com.speaya.messageredis.SubmissionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class SubmissionService {

    @Autowired
    SubmissionRepository submissionRepository;

    public List<SubmissionModel> getAll() {
        return this.submissionRepository.findAll();
    }

    public Optional<SubmissionModel> getById(String id) {
        return this.submissionRepository.findById(id);
    }
    public boolean idExists(String id){
        return this.submissionRepository.existsById(id);
    }

    public void save(SubmissionModel submissionModel) {
        this.submissionRepository.save(submissionModel);
    }

    public void delete(String id) {
        this.submissionRepository.deleteById(id);
    }

}
