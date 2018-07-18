package fun.lww.springbootmybatisgenerator.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import fun.lww.springbootmybatisgenerator.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author lqh
 * @since 2018-07-18
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    List<User> findAll();
}