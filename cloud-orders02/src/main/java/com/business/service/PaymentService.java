package com.business.service;

import com.business.vo.Payment;
import org.apache.ibatis.annotations.Param;
public interface PaymentService {

    int create(Payment payment);

    Payment queryById(@Param("id") long id);
}
