package Spring.vote.demo.services;

import javax.persistence.NoResultException;

import Spring.vote.demo.entities.Conversation;

public interface ConversationService {
	
	public Conversation getOneConversation(Integer user1, Integer user2) throws NoResultException;
}
