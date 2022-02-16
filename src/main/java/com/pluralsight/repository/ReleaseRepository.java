package com.pluralsight.repository;

import com.pluralsight.entity.Release;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleaseRepository extends CrudRepository<Release, Long> {
}
