package com.example.accessingdatarest;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "persons", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

	List<Person> findByLastName(@Param("name") String name);

}


/*
 * @RepositoryRestResource
 * 
 * direct Spring MVC to create RESTful endpoints at /people
 * 
 * not required for a repository to be exported. 
 * It is used only to change the export details, 
 * default value of /persons 대신 /people 
 */


/*
 * [PagingAndSortingRepository]
 * 
 * 
 */