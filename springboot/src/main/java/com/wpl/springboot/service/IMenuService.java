package com.wpl.springboot.service;

import com.wpl.springboot.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wpl
 * @since 2022-04-08
 */
public interface IMenuService extends IService<Menu> {

    List<Menu> findMenus(String name);
}
