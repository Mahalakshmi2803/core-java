package service;

import dto.FeedbackDto;

public class FeedbackServiceImpl implements FeedbackService{

    @Override
    public boolean save(FeedbackDto feedbackDto) {
        if (feedbackDto != null) {
            String name = feedbackDto.getName();
            if (name != null && name.length() > 2) {
                System.out.println("Valid Name");
                return true;

            } else {
                System.out.println("Invalid");
                return false;
            }


        }
        return false;
    }
}
