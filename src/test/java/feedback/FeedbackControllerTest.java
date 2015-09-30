package feedback;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(JUnit4.class)
public class FeedbackControllerTest {

    private FeedbackController feedbackController;
    private FeedbackRepository feedbackRepository = mock(FeedbackRepository.class);

    @Before
    public void setUp() throws Exception {
        feedbackController = new FeedbackController(feedbackRepository);
    }

    @Test
    public void shouldSaveFeedback() throws Exception {
        Feedback feedback = new Feedback();
        feedbackController.save(feedback);
        verify(feedbackRepository).save(feedback);
    }
}
