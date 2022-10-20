package com.business.dao;

import com.business.vo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PaymentDao {
   int create(Payment payment);

   Payment queryById(@Param("id") long id);
}

