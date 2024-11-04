package com.tuantn.AndyHotel.service.interfac;

import com.tuantn.AndyHotel.dto.Response;
import com.tuantn.AndyHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}
