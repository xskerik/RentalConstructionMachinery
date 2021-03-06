package cz.mufi.PA165.RentalConstructionMachinery.facade;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cz.mufi.PA165.RentalConstructionMachinery.domain.Customer;
import cz.mufi.PA165.RentalConstructionMachinery.dto.CustomerDTO;
import cz.mufi.PA165.RentalConstructionMachinery.service.BeanMappingService;
import cz.mufi.PA165.RentalConstructionMachinery.service.CustomerServiceImpl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author tomas
 */
@Component
@Transactional
public class CustomerFacadeImpl implements CustomerFacade {

    @Autowired
    private CustomerServiceImpl customerService;

    @Autowired
    private BeanMappingService mappingService;

    @Override
    public CustomerDTO createNewCustomer(CustomerDTO customerDTO) {
        Customer c ;
         c = customerService.createCustomer(mappingService.map(customerDTO, Customer.class));
         return mappingService.map(c, CustomerDTO.class);
    }

    @Override
    public void deleteCustomer(CustomerDTO customerDTO) {
        Customer customer = mappingService.map(customerDTO, Customer.class);
        customerService.deleteCustomer(customer);
    }

    /**
     * update customer
     * @param customerDTO
     */
    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        Customer customer = mappingService.map(customerDTO, Customer.class);
        customerService.updateCustomer(customer);
        
    }

    /**
     * get all customers
     * @return
     */
    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> list ;
              list = customerService.findAll();
        List<CustomerDTO> customerDtoList = new ArrayList<CustomerDTO>();
        for(Customer customerTmp:list){
            customerDtoList.add(mappingService.map(customerTmp, CustomerDTO.class));
        }
        return customerDtoList;
    }

    /**
     * find customer by id
     * @param id
     * @return
     */
    @Override
    public CustomerDTO findById(Long id) {
         Customer customerTmp = customerService.findCustomerById(id);
         return mappingService.map(customerTmp, CustomerDTO.class);
         
    }
}