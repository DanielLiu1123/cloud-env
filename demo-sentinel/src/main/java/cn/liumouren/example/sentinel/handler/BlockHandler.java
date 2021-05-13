package cn.liumouren.example.sentinel.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author Daniel Liu
 */
public class BlockHandler {
    public static String handlerException(BlockException exception) {
        return "自定义降级处理: " + exception.getMessage();
    }
}
