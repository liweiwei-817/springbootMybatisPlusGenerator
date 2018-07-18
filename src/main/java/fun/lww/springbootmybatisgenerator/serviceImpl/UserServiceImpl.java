package fun.lww.springbootmybatisgenerator.serviceImpl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import fun.lww.springbootmybatisgenerator.entity.User;
import fun.lww.springbootmybatisgenerator.mapper.UserMapper;
import fun.lww.springbootmybatisgenerator.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lqh
 * @since 2018-07-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
