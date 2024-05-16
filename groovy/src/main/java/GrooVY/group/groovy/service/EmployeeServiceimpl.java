package GrooVY.group.groovy.service;

import GrooVY.group.groovy.Entity.newEmployee;
import GrooVY.group.groovy.repository.newEmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceimpl implements EmployeeService{
    private final newEmployeeRepository newEmployeeRepository;
    @Override
    public newEmployee saveEmployee(newEmployee employee) {
        return newEmployeeRepository.save(employee);
    }
}
