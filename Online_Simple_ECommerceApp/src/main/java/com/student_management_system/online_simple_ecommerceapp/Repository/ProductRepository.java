package com.student_management_system.online_simple_ecommerceapp.Repository;

import com.student_management_system.online_simple_ecommerceapp.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>
{

}
