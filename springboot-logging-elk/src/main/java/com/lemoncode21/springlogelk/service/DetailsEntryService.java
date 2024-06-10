package com.lemoncode21.springlogelk.service;

import com.lemoncode21.springlogelk.entity.DetailsEntry;
import com.lemoncode21.springlogelk.repository.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DetailsEntryService {
    @Autowired
private DetailsRepository detailsRepository;
    public List<DetailsEntry> getAll() { return detailsRepository.findAll();}
}
