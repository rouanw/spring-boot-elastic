package feedback;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "feedback")
public class Feedback {

    @Id
    private String id;

    private String message;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
