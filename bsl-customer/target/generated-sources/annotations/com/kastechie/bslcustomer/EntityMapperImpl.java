package com.kastechie.bslcustomer;

import com.kastechie.model.Customer;
import com.kastechie.model.CustomerEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-21T09:53:29+0200",
    comments = "version: 1.6.0.Beta1, compiler: Eclipse JDT (IDE) 3.33.0.v20230213-1046, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class EntityMapperImpl implements EntityMapper {

    @Override
    public CustomerEntity mapToCustomerEntity(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setCity( customer.getCity() );
        customerEntity.setCustomerName( customer.getCustomerName() );
        customerEntity.setPhoneNumber( customer.getPhoneNumber() );
        customerEntity.setPostalCode( String.valueOf( customer.getPostalCode() ) );
        customerEntity.setProvince( customer.getProvince() );

        return customerEntity;
    }

    @Override
    public Customer mapToCustomer(CustomerEntity customerEntity) {
        if ( customerEntity == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( customerEntity.getCustomerId() );
        customer.setCustomerName( customerEntity.getCustomerName() );
        customer.setCity( customerEntity.getCity() );
        customer.setProvince( customerEntity.getProvince() );
        if ( customerEntity.getPostalCode() != null ) {
            customer.setPostalCode( Integer.parseInt( customerEntity.getPostalCode() ) );
        }
        customer.setPhoneNumber( customerEntity.getPhoneNumber() );

        return customer;
    }
}
