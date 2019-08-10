package com.iamvickyav.indiantowns;

import com.iamvickyav.indiantowns.model.PagedSearchRequest;
import com.iamvickyav.indiantowns.model.SearchRequest;
import com.iamvickyav.indiantowns.solr.IndianTownRepo;
import com.iamvickyav.indiantowns.solr.model.IndianTown;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IndianTownsAPIController {

    @Autowired
    IndianTownRepo repo;

    @RequestMapping(value = "/india/town/all", method = RequestMethod.GET)
    Page<IndianTown> findAllIndianTown(@RequestParam(required = true) Integer page, @RequestParam(required = true) Integer size) {
        Page<IndianTown> pagedResult = repo.findAll(new PageRequest(page, size));
        return pagedResult;
    }

    @RequestMapping(value = "/india/town/paged/search", method = RequestMethod.GET)
    Page<IndianTown> searchIndianTown(@ModelAttribute PagedSearchRequest searchRequest) {

        Page<IndianTown> townList;

        if (searchRequest.getDistrict() != null)
            townList = repo.findAllByStateAndDistrict(searchRequest.getState(), searchRequest.getDistrict(),
                    new PageRequest(searchRequest.getPage(), searchRequest.getSize()));
        else
            townList = repo.findAllByState(searchRequest.getState(),
                    new PageRequest(searchRequest.getPage(), searchRequest.getSize()));
        return townList;
    }

    @RequestMapping(value = "/india/town/search", method = RequestMethod.GET)
    List<IndianTown> searchIndianTown(@ModelAttribute SearchRequest searchRequest) {

        List<IndianTown> townList;

        if (searchRequest.getDistrict() != null)
            townList = repo.findAllByStateAndDistrict(searchRequest.getState(), searchRequest.getDistrict());
        else
            townList = repo.findAllByState(searchRequest.getState());
        return townList;
    }
}
