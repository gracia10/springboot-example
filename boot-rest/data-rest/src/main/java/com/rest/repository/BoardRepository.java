package com.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import com.rest.domain.Board;
import com.rest.domain.projection.BoardOnlyContainTitle;

@RepositoryRestResource(excerptProjection = BoardOnlyContainTitle.class)
public interface BoardRepository extends JpaRepository<Board, Long>{
	
	@Override
	@PreAuthorize("hasRole('ADMIN')")
	<S extends Board> S save(S entity);

	@RestResource(path="query",exported = false)
	List<Board> findByTitle(@Param("title") String title);
}
