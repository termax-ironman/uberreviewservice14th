package org.example.uberreviewservice.Repository;

import org.example.uberreviewservice.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver, Long> {
    Optional<Driver> findByIdAndLicenseNo(Long id, String licenseNo);

    List<Driver> findAllByIdIn(List<Long> id);
}
