package Spring.vote.demo.services;

import java.util.List;

import Spring.vote.demo.entities.Sujet;

public interface SujetService {

	public void addSujet (Sujet sujet);
	public List<Sujet> getAll();
	public void voterPour(Sujet sujet);
	public void voterContre(Sujet sujet);
}