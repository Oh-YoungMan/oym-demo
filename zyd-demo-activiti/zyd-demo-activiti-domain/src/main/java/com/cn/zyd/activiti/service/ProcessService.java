package com.cn.zyd.activiti.service;

import com.cn.zyd.activiti.dto.CommentDto;
import com.cn.zyd.activiti.dto.HistoricProcessInstanceDto;
import com.cn.zyd.activiti.dto.ProcessStartDto;
import com.cn.zyd.activiti.query.ProcessQuery;

import java.util.List;

/**
 * @author zyd
 * @date 2019/10/2 15:42
 * @desc
 */
public interface ProcessService {

    String startProcess(ProcessStartDto processStartDto);

    /**
     * 关闭流程
     */
    void closeProcess(String processInstanceId, String reason);

    /**
     * 用户查看自己发起的流程实例
     */
    List<HistoricProcessInstanceDto> getHisProcessInstantByUserId(ProcessQuery processQuery);

    /**
     * 根据processInstanceId查看流程的状态
     */
    List<CommentDto> detail(ProcessQuery processQuery);

    /**
     * 查看当前流程执行的任务id
     */
    String getTaskIdByProcessInstantId(ProcessQuery processQuery);

    /**
     * 查看任务是否结束
     */
    Boolean isComplete(String processInstantId);

}
