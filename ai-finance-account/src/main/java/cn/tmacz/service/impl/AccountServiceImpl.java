package cn.tmacz.service.impl;

import cn.tmacz.service.mapper.AccountMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl {

    @Autowired
    private AccountMapper accountMapper;

    @GlobalTransactional(name = "debit-account", rollbackFor = Exception.class)
    public void debit(Long userId, BigDecimal amount) {
        // 扣减余额（本地事务）
        accountMapper.debit(userId, amount);
        // 可能调用其他服务（如交易服务记录流水）
        // 如果其他服务失败，Seata会回滚本地操作
    }
}