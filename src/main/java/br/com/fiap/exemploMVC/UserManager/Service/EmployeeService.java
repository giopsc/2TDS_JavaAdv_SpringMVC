package br.com.fiap.exemploMVC.UserManager.Service;

import br.com.fiap.exemploMVC.UserManager.DomainModel.Employee;

public interface EmployeeService {
    Employee save(Employee employee);

    void delete(Employee employee);

    // "final" alterna o escopo de singleton, para prototype.
    void deleteById(Long id);
}
