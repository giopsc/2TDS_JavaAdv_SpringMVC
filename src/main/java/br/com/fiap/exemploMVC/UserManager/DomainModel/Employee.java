package br.com.fiap.exemploMVC.UserManager.DomainModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private @Getter @Setter Long id;
    private @Getter @Setter String name;
    private @Getter @Setter String email;

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
