package com.MarketPlace.MarketAppPoo.repository;

import org.springframework.stereotype.Repository;
import com.MarketPlace.MarketAppPoo.model.ModelUser;
import org.springframework.data.jpa.repository.JpaRepository;



import java.util.List;
import java.util.Optional;



@Repository
public interface UserRepository extends JpaRepository<ModelUser, Integer> {


    Optional<ModelUser> findByEmail(String email);



}

