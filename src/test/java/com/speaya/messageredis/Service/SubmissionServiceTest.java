package com.speaya.messageredis.Service;

import com.speaya.messageredis.SubmissionModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.annotation.security.RunAs;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SubmissionServiceTest {

    @Autowired
    SubmissionService submissionService;

    @Test
    void getAll() {
        //Arrange
        List<SubmissionModel> submissionModels = this.submissionService.getAll();
        //Act
        assertNotNull(submissionModels);
        //Assert
    }

    @Test
    void getById() {
        //Arrange
        SubmissionModel submissionModel = this.submissionService.getById("test").get();
        //Act
        //Assert
        assertNotNull(submissionModel);
    }
    @Test
    void idExists() {
        //Arrange
        boolean IdExists  = this.submissionService.idExists("test");
        //Act
        //Assert
        assertFalse(IdExists);
    }

    @Test
    void save() {
        //Arrange
        SubmissionModel submissionModel = new SubmissionModel("test3", "twe//test//husj{kjksjdksjd//test//test}");
        //Act
        this.submissionService.save(submissionModel);
        //Assert
    }

    @Test
    void delete() {
        //Arrange
        //Act
        this.submissionService.delete("test2");
        //Assert
    }
}