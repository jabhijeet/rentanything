package org.couchpotato.rentanything.repository;

import java.util.List;

import org.couchpotato.rentanything.model.Remark;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "remarks")
public interface RemarkRepository extends PagingAndSortingRepository<Remark, Long>
{

	List<Remark> getRemarksForUsername(@Param("username") String username);
	List<Remark> getRemarksForItem(@Param("id") String id);
}
