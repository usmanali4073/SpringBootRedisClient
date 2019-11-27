package com.speaya.messageredis.Controller;

import com.speaya.messageredis.Service.SubmissionService;
import com.speaya.messageredis.SubmissionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/submission")
public class SubmissionController {

    @Autowired
    SubmissionService submissionService;

    @GetMapping
    public ResponseEntity get(@PathVariable String Id) {
        return ResponseEntity.ok(this.submissionService.getById(Id));
    }

    @PostMapping
    public ResponseEntity post(@RequestBody SubmissionModel submissionModel){

        this.submissionService.save(submissionModel);
        return ResponseEntity.ok("Updated");
    }
}
