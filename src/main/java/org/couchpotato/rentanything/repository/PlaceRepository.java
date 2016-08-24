package org.couchpotato.rentanything.repository;

import org.couchpotato.rentanything.model.Place;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "places")
public interface PlaceRepository extends PagingAndSortingRepository<Place, Long>
{

}
