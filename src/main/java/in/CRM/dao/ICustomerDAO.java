package in.CRM.dao;

import org.springframework.data.repository.CrudRepository;

import in.CRM.model.Customer;

public interface ICustomerDAO extends CrudRepository<Customer, Integer> {

}
