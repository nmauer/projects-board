package de.nmauer.services;

import de.nmauer.data.Company;
import de.nmauer.data.CompanyRepository;
import de.nmauer.data.User;
import de.nmauer.data.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.Optional;

public class CompanyService {

    private final CompanyRepository repository;

    public CompanyService(CompanyRepository repository) {
        this.repository = repository;
    }

    public Optional<Company> get(Long id) {
        return repository.findById(id);
    }

    public Company update(Company entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Company> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Company> list(Pageable pageable, Specification<Company> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
