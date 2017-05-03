package com.wuchaofei.springboot.dao;

import com.wuchaofei.springboot.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 创建Dao接口, springboot 将接口类会自动注解到spring容器中，不需要我吗做任何配置，只需要继承JpaRepository 即可：
 * 其中第二个参数为Id的类型
 * Created by cofco on 2017/5/3.
 */
public interface GirlDao extends JpaRepository<Girl,Integer>{
}
