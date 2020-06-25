package Spring.vote.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sujet  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String description;
	private String titre;
	private int  votePour;
	private int voteContre;
	
	public Sujet() {
		super();
	}
	public Sujet(int id, String description, String titre, int votePour, int voteContre) {
		super();
		this.id = id;
		this.description = description;
		this.titre = titre;
		this.votePour = votePour;
		this.voteContre = voteContre;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getVotePour() {
		return votePour;
	}

	public void setVotePour(int votePour) {
		this.votePour = votePour;
	}

	public int getVoteContre() {
		return voteContre;
	}

	public void setVoteContre(int voteContre) {
		this.voteContre = voteContre;
	}



	

}
