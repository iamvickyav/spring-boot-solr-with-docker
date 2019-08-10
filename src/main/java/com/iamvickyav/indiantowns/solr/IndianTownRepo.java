package com.iamvickyav.indiantowns.solr;

import com.iamvickyav.indiantowns.solr.model.IndianTown;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

public interface IndianTownRepo extends SolrCrudRepository<IndianTown, String> {

    List<IndianTown> findAllByState(String state);

    List<IndianTown> findAllByStateAndDistrict(String state, String district);

    Page<IndianTown> findAllByState(String state, PageRequest page);

    Page<IndianTown> findAllByStateAndDistrict(String state, String district, PageRequest page);
}
