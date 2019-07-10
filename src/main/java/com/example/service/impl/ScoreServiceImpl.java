package com.example.service.impl;

import com.example.entity.Score;
import com.example.mapper.ScoreMapper;
import com.example.service.ScoreService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhuBin
 * @since 2019-07-10
 */
@Service
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, Score> implements ScoreService {

}
