package com.fyd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/29 17:15
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void doService() {
        System.out.println("doService");
        userRepository.doRepository();
    }
}
