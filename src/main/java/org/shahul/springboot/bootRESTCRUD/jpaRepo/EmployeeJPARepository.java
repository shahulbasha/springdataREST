package org.shahul.springboot.bootRESTCRUD.jpaRepo;

import org.shahul.springboot.bootRESTCRUD.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path="members")
public interface EmployeeJPARepository extends JpaRepository<Employee, Integer>{

}
