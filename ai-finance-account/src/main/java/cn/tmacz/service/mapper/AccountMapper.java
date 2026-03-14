package cn.tmacz.service.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

@Mapper
public interface AccountMapper {
    void debit(Long userId, BigDecimal amount);
}
