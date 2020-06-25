package Spring.vote.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Spring.vote.demo.entities.Sujet;

@Repository("sujetpository")
public interface SujetRepository extends JpaRepository<Sujet, Integer> {

}
