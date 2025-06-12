package repository;

import dto.FeedbackDto;

public interface FeedbackRepo {

     String persist(FeedbackDto feedbackDto);

}
