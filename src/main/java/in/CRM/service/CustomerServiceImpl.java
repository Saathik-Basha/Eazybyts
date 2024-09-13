package in.CRM.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.CRM.dao.ICustomerDAO;
import in.CRM.model.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDAO repo;

	@Override
	public List<Customer> getCustomers() {
		return (List<Customer>) repo.findAll();
	}

	@Override
	public void saveCustomer(Customer customer) {
		customer.setDate(LocalDate.now());
		repo.save(customer);
	}

	@Override
	public Customer getCustomer(Integer customerId) {
		Optional<Customer> optional = repo.findById(customerId);
		return optional.get();
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		repo.deleteById(customerId);
	}
}
