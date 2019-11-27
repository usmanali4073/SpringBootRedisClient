package com.speaya.messageredis.Repository;

import com.speaya.messageredis.SubmissionModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubmissionRepository extends CrudRepository<SubmissionModel, String> {

    @Override
    List<SubmissionModel> findAll();
}
