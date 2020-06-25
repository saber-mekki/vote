package Spring.vote.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Spring.vote.demo.entities.User;

@Repository("userrepository")
public interface UserRepository extends JpaRepository<User, Integer>  {

}
