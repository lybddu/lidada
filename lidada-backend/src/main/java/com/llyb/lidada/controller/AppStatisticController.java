package com.llyb.lidada.controller;

import com.llyb.lidada.common.BaseResponse;
import com.llyb.lidada.common.ErrorCode;
import com.llyb.lidada.common.ResultUtils;
import com.llyb.lidada.exception.ThrowUtils;
import com.llyb.lidada.mapper.UserAnswerMapper;
import com.llyb.lidada.model.dto.statistic.AppAnswerCountDTO;
import com.llyb.lidada.model.dto.statistic.AppAnswerResultCountDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * App 统计分析接口
 *
 * @author <a href="https://github.com/lybddui">程序员鱼皮</a>
 * @from <a href="https://yupi.icu"></a>
 */
@RestController
@RequestMapping("/app/statistic")
@Slf4j
public class AppStatisticController {

    @Resource
    private UserAnswerMapper userAnswerMapper;

    /**
     * 热门应用及回答数统计（top 10）
     *
     * @return
     */
    @GetMapping("/answer_count")
    public BaseResponse<List<AppAnswerCountDTO>> getAppAnswerCount() {
        return ResultUtils.success(userAnswerMapper.doAppAnswerCount());
    }

    /**
     * 某应用回答结果分布统计
     *
     * @param appId
     * @return
     */
    @GetMapping("/answer_result_count")
    public BaseResponse<List<AppAnswerResultCountDTO>> getAppAnswerResultCount(Long appId) {
        ThrowUtils.throwIf(appId == null || appId <= 0, ErrorCode.PARAMS_ERROR);
        return ResultUtils.success(userAnswerMapper.doAppAnswerResultCount(appId));
    }
}