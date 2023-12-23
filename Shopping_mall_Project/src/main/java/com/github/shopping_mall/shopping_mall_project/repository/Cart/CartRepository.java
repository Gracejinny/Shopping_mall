package com.github.shopping_mall.shopping_mall_project.repository.Cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<CartEntity, Integer> {
    CartEntity findByEmail(String email);
}
