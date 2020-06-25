package Spring.vote.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Spring.vote.demo.entities.Conversation;

@Repository("conversationrepository")
public interface ConversationRepository extends JpaRepository<Conversation, Integer>  {

}
