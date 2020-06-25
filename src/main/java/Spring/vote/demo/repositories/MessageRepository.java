package Spring.vote.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Spring.vote.demo.entities.Message;

@Repository("messagerepository")
public interface MessageRepository extends JpaRepository<Message, Integer> {

}
