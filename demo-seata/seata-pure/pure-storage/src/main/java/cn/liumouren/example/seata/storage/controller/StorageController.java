package cn.liumouren.example.seata.storage.controller;

import cn.liumouren.example.common.entity.R;
import cn.liumouren.example.seata.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Storage)表控制层
 *
 * @author daniel liu
 */
@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private StorageService storageService;

    @PutMapping("/{id}/{count}")
    public R reduceInventory(@PathVariable String id, @PathVariable int count) {
        storageService.subtract(id, count);
        return R.ok("ok");
    }

}
