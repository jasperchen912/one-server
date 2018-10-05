package com.jc.one.component.saying.service.impl;

import com.jc.one.component.saying.entity.Saying;
import com.jc.one.component.saying.mapper.SayingMapper;
import com.jc.one.component.saying.service.ISayingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author woolheia
 * @since 2018-10-05
 */
@Service
public class SayingServiceImpl extends ServiceImpl<SayingMapper, Saying> implements ISayingService {

}
