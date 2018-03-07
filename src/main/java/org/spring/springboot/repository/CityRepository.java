package org.spring.springboot.repository;

import org.spring.springboot.domain.City;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Irving Wei on 06/03/2018.
 */
@Repository
public interface CityRepository extends ElasticsearchRepository<City,Long> {


}
