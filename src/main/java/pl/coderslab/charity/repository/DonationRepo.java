package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.entity.DonationEntity;

import java.util.Optional;

@Repository
public interface DonationRepo extends JpaRepository<DonationEntity, Integer> {

    Optional<DonationEntity> findById(long id);
}
