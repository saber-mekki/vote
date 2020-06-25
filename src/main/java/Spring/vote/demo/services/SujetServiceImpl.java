package Spring.vote.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spring.vote.demo.entities.Sujet;
import Spring.vote.demo.repositories.SujetRepository;
import Spring.vote.demo.services.SujetService;

@Service("sujetservice")
public class SujetServiceImpl implements SujetService{
	@Autowired
	private SujetRepository sujetRepository;
	
	@Override
	public void addSujet(Sujet sujet) {
		sujetRepository.save(sujet);
		
	}
	@Override
	public List<Sujet> getAll() {
		return sujetRepository.findAll();
	}
	@Override
	public void voterPour(Sujet sujet) {
		sujet.setVotePour(sujet.getVotePour() +1);
	}
	@Override
	public void voterContre(Sujet sujet) {
		sujet.setVoteContre(sujet.getVoteContre() +1);
	}


}
