package coms.DemoSpringBootApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.DemoSpringBootApp.beans.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
