package edu.mum.cs544.ecommerce.dbservice.repository;

import org.springframework.web.bind.annotation.PostMapping;

public interface UsersServiceShowcase {
    @PostMapping("/checkToken")
    boolean checkToken();
}
