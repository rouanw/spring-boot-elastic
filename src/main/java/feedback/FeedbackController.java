package feedback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
    private FeedbackRepository feedbackRepository;

    @Autowired
    public FeedbackController(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody Feedback feedback) {
        feedbackRepository.save(feedback);
    }
}
