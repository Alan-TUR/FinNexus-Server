package cn.tmacz.feign;

@FeignClient(name = "account-service")
public interface AccountClient {
    @GetMapping("/account/info/{userId}")
    R<AccountVO> getAccountInfo(@PathVariable("userId") Long userId);
}@RestController
@RequestMapping("/ai")
public class AIController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/chat")
    public R<String> chat(@RequestBody ChatRequest request) {
        // 调用大模型（这里模拟）
        String reply = chatService.callAI(request.getPrompt());
        // 异步记录对话历史（通过MQ）
        chatService.recordHistoryAsync(request, reply);
        return R.success(reply);
    }
}