package br.com.fiap.exemploMVC.UserManager.Service;

import br.com.fiap.exemploMVC.UserManager.DataSource.EmployeeRepository;
import br.com.fiap.exemploMVC.UserManager.DomainModel.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Properties;

@AllArgsConstructor
@Service
public class EmployeeServiceImplementation implements EmployeeService {

    private EmployeeRepository repo;

    @Override
    @Transactional( propagation = Propagation.REQUIRED )
    public Employee save( final Employee employee ){
        // Sempre utilizar "this" para referenciar objeto local
        return this.repo.save( employee );
    }

    @Override
    @Transactional( propagation = Propagation.REQUIRED )
    public void delete( final Employee employee ){
        this.repo.delete( employee );
    }


    @Override
    @Transactional( propagation = Propagation.REQUIRED )
    public void deleteById( final Long id ){
        this.repo.deleteById(id);
    }
    // "final" alterna o escopo de singleton, para prototype.
    // • Estudar escopos do Spring

    @Transactional( propagation = Propagation.NEVER )
    public Optional<Employee> findById( final Long id ){
        return this.repo.findById( id );
    }
}
