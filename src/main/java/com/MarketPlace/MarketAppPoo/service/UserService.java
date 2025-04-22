package com.MarketPlace.MarketAppPoo.service;

import com.MarketPlace.MarketAppPoo.model.ModelUser;
import com.MarketPlace.MarketAppPoo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    // Atualização de usuário com segurança (opcional: verificar se a senha mudou)
    public void salvar(ModelUser modelUser) {
        modelUser.setSenha(passwordEncoder.encode(modelUser.getSenha()));
        userRepository.save(modelUser);
         }

    public ModelUser buscarPorEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }

}
