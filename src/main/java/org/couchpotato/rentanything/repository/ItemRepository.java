/**
 *
 */
package org.couchpotato.rentanything.repository;

import java.util.List;

import org.couchpotato.rentanything.model.Item;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author jabhi
 *
 */
@RepositoryRestResource(collectionResourceRel = "items")
public interface ItemRepository extends PagingAndSortingRepository<Item, Long>
{

	List<Item> getItemsForUsername(@Param("username") String username);
	List<Item> getItemsForPlace(@Param("placeId") String placeId);

}
