package dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class FeedbackDto {

    private String name;
    private String email;
    private String rating;
    private  String feedback;
}
