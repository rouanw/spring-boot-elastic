package feedback;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class FeedbackTest {
    @Test
    public void shouldHaveAMessage() throws Exception {
        Feedback feedback = new Feedback();
        feedback.setMessage("Smells funny");
        assertThat(feedback.getMessage(), equalTo("Smells funny"));
    }

    @Test
    public void shouldHaveAnId() throws Exception {
        Feedback feedback = new Feedback();
        feedback.setId("id");
        assertThat(feedback.getId(), equalTo("id"));
    }
}
