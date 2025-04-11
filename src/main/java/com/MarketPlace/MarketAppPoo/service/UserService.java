package com.MarketPlace.MarketAppPoo.service;

import com.MarketPlace.MarketAppPoo.model.ModelUser;
import com.MarketPlace.MarketAppPoo.model.Produtos;
import com.MarketPlace.MarketAppPoo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(ModelUser modelUser){
        userRepository.save(modelUser);
    }// Método feito para cadastrar pessoas
}
