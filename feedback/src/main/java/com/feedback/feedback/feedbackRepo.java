package com.feedback.feedback;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface feedbackRepo extends JpaRepository<Feedback, Integer> {

}
