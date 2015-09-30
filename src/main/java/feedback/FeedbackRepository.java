package feedback;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface FeedbackRepository extends ElasticsearchRepository<Feedback, String> {

}
