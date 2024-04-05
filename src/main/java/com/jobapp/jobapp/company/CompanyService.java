package com.jobapp.jobapp.company;

import java.util.List;
import java.util.Optional;

public interface CompanyService{
    List<Company> getAllCompanies();
    void updateCompany(Company company, Long id);

    Company getCompanyById(Long id);

    boolean deleteCompanyById(Long id);
    void CreateCompany(Company company);

}
