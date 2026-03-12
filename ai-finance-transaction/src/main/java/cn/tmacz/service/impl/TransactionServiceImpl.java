package cn.tmacz.service.impl;

import cn.tmacz.service.TransactionService;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

//    @Autowired
//    private AccountClient accountClient;
//
//    @GlobalTransactional
//    public void createTransaction(TransactionDTO dto) {
//        // 保存本地交易记录
//        transactionMapper.insert(dto);
//        // 调用账户服务扣款
//        R result = accountClient.debit(dto.getUserId(), dto.getAmount());
//        if (result.getCode() != 200) {
//            throw new RuntimeException("扣款失败");
//        }
//        // 其他业务...
//    }

}
