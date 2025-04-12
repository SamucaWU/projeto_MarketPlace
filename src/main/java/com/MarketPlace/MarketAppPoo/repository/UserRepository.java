package com.MarketPlace.MarketAppPoo.repository;

import org.springframework.stereotype.Repository;
import com.MarketPlace.MarketAppPoo.model.ModelUser;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface UserRepository extends JpaRepository<ModelUser, Integer> {

}

