package cn.liumouren.example.seata.storage.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.liumouren.example.seata.storage.dao.StorageDao;
import cn.liumouren.example.seata.storage.entity.Storage;
import cn.liumouren.example.seata.storage.service.StorageService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * (Storage)表服务实现类
 *
 * @author daniel liu
 */
@Service("storageService")
public class StorageServiceImpl extends ServiceImpl<StorageDao, Storage> implements StorageService {

    /**
     * 减库存
     */
    @Override
    public void subtract(String id, int count) {
        super.update(new LambdaUpdateWrapper<Storage>()
                .eq(Storage::getCommodityCode, id)
                .setSql("`count` = `count` - " + count));
    }

}
