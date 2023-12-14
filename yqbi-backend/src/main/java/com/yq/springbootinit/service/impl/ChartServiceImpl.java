package com.yq.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yq.springbootinit.model.entity.Chart;
import com.yq.springbootinit.service.ChartService;
import com.yq.springbootinit.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author lyq15935020250
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2023-12-11 23:32:17
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




