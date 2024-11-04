package com.tuantn.AndyHotel.service.interfac;

import com.tuantn.AndyHotel.dto.LoginRequest;
import com.tuantn.AndyHotel.dto.Response;
import com.tuantn.AndyHotel.entity.User;

public interface IUserService {

    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}
