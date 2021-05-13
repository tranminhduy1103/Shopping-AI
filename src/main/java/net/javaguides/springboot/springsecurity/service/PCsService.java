package net.javaguides.springboot.springsecurity.service;

import net.javaguides.springboot.springsecurity.Entity.PCs.PCs;
import net.javaguides.springboot.springsecurity.repository.PcsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PCsService {

    @Autowired
    private PcsRepository pcsRepo;

    public PCs findById(Long Id) { return pcsRepo.findById(Id).get(); }
}
