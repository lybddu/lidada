package com.llyb.lidada.scoring;

import com.llyb.lidada.model.entity.App;
import com.llyb.lidada.model.entity.UserAnswer;


import java.util.List;

/**
 * 评分策略
 *
 * @author <a href="https://github.com/lybddui">程序员</a>
 * @from <a href="https://www.code-nav.cn">编程导航学习圈</a>
 */
public interface ScoringStrategy {

    /**
     * 执行评分
     *
     * @param choices
     * @param app
     * @return
     * @throws Exception
     */
    UserAnswer doScore(List<String> choices, App app) throws Exception;
}