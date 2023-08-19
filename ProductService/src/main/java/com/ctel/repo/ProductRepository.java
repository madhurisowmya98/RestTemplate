package com.ctel.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ctel.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

	@Query(value = "SELECT id from product ORDER BY id DESC LIMIT 1", nativeQuery = true)
	String fetchId();

	@Query(value = "SELECT * FROM product u WHERE u.name = ?1", nativeQuery = true)
	Optional<Product> findByPname(String pname);
}
