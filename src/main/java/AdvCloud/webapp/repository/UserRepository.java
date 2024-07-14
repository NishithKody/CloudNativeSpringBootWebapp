package AdvCloud.webapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AdvCloud.webapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
