package com.anand.userservice;

import com.anand.userservice.users.dto.DisplayUserDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class UserServiceApplicationTests {

    @Test
    void testCreateDisplayUserDTO()
    {
        var displayUser = new DisplayUserDto();
        assertNotNull(displayUser);
    }

}
