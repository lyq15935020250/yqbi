package com.yq.springbootinit.model.dto.chart;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建请求
 *
 * @author <a href="https://github.com/liyq">程序员鱼皮</a>
 * @from <a href="https://yq.icu">编程导航知识星球</a>
 */
@Data
public class ChartAddRequest implements Serializable {

    /**
     * 名称
     */
    private String name;

    /**
     * 分析目标
     */
    private String goal;

    /**
     * 图表数据
     */
    private String chartData;

    /**
     * 图标类型
     */
    private String chartType;


    private static final long serialVersionUID = 1L;
}