package com.feedback.feedback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("https://feedbackj54.netlify.app")
public class controller {

    @Autowired
    private feedbackSevice service;

    @PostMapping("/feedback")
    public Feedback saveFeedback(@RequestBody Feedback feedback) {
        return service.saveFeedback(feedback);
    }

    @GetMapping("/feedback")
    public List<Feedback> getFeedback() {
        return service.getAllFeedback();
    }

}
