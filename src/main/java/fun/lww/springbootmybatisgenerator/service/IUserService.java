package fun.lww.springbootmybatisgenerator.service;

import com.baomidou.mybatisplus.service.IService;
import fun.lww.springbootmybatisgenerator.entity.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lqh
 * @since 2018-07-18
 */
public interface IUserService extends IService<User> {

    List<User> findAll();
}
