package com.bezkoder.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.datajpa.model.Tutorial;
import org.springframework.data.jpa.repository.Query;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	@Query("select distinct t from Tutorial t where t.published = true order by t.id")
	List<Tutorial> findDistinctByPublishedIsTrueOrderByIdAsc(Pageable pageable);
	List<Tutorial> findByPublished(boolean published);
	List<Tutorial> findByTitleContaining(String title);
}
