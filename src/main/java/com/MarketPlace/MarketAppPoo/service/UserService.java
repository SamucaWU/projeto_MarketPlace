package com.MarketPlace.MarketAppPoo.service;

import com.MarketPlace.MarketAppPoo.model.ModelUser;
import com.MarketPlace.MarketAppPoo.model.Produtos;
import com.MarketPlace.MarketAppPoo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> b093e86f6bc61f37116c141fa5527bce07251149
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(ModelUser modelUser){
        userRepository.save(modelUser);
<<<<<<< HEAD
    } // Método feito para cadastrar pessoas
    public List<ModelUser> listarUsuarios(){ return (List<ModelUser>) userRepository.findAll();
    }
=======
    }// Método feito para cadastrar pessoas
>>>>>>> b093e86f6bc61f37116c141fa5527bce07251149
}
