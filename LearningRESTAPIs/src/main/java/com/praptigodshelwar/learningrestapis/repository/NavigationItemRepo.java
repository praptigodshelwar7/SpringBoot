package com.praptigodshelwar.learningrestapis.repository;

import com.praptigodshelwar.learningrestapis.entity.NavigationItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NavigationItemRepo extends JpaRepository<NavigationItems,Long> {
}
