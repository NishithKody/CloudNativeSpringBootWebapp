package AdvCloud.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import AdvCloud.webapp.model.*;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
}