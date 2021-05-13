package cn.liumouren.example.seata.storage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.liumouren.example.seata.storage.entity.Storage;

/**
 * (Storage)表服务接口
 *
 * @author daniel liu
 */
public interface StorageService extends IService<Storage> {

    public void subtract(String id, int count);

}
