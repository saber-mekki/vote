package Spring.vote.demo.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spring.vote.demo.entities.Message;
import Spring.vote.demo.repositories.MessageRepository;

@Service("messageservice")
public class MessageServiceImpl implements MessageService{
	@Autowired
	MessageRepository messagerepository;
	
	@PersistenceContext
	EntityManager em;
	@Override
	public void sendMessage(Message message) {
		messagerepository.save(message);
	}

}
