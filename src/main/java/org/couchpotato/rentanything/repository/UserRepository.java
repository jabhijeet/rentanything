
package org.couchpotato.rentanything.repository;

import java.util.List;

import org.couchpotato.rentanything.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long>
{

	List<User> findByUsername(@Param("username") String username);

}