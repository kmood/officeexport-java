package com.project.basic.service;

import com.core.hprose.service.HproseAttribute;
import com.core.hprose.service.HproseDetailAttribute;
import com.core.hprose.service.HproseServer;
import com.core.utils.JsonBinder;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.project.basic.mapper.EntityModelMapper;
import com.project.workflow.service.WorkflowService;
import org.activiti.bpmn.model.FlowElement;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.ServletContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: SunBC
 * @Date: 2019/3/19 15:23
 * @Description:
 */
//@Service
public class AopWorkflowCommonService {
    @Autowired
    private EntityModelMapper entityModelMapper;
    @Autowired
    private ServletContext servletContext;
    @Autowired
    private WorkflowService workflowService;
//    @Value("${XMGL_XMXX_PROCDEFID}")
    private String XMGL_XMXX_PROCDEFID;


    private static final Logger logger = Logger.getLogger(AopWorkflowCommonService.class);
    private static final Gson jsonBinder = JsonBinder.buildNormalBinderAndHandlerMap("yyyy-MM-dd");


    /**
     *
     * @Title listCjr
     * @Description TODO
     * @param pageNo
     * @param pageSize
     * @param isFinished
     * @return
     * @author SunBC
     * @time 2018年8月14日 上午10:01:27
     */
    @HproseAttribute.MethodAttribute(method = "listCjrByTable(Integer pageNo,Integer pageSize, String isFinished,String userid,String tableComment)", description = "获取申请列表(创建人)")
    @HproseDetailAttribute.MethodDetailAttribute(argsName = "pageNo#pageSize#isFinished#userid#tableComment", argsDes = "页码#每页数量#已办或待办（0：待办  1：已办）#用户id#表注释", eg = "")
    public Object listCjrByTable(Integer pageNo,Integer pageSize, String isFinished,String userid,String tableComment) {
        String cond=" ";
        String tableName = entityModelMapper.selectTableName(tableComment, null);

        cond += " and QJRID ='"+userid + "'";
        if (StringUtils.equals(isFinished, "0")) {
            cond += " and SHZT='0' ";
        } else {
            cond += " and SHZT!='0' ";
        }
        if(pageNo > 0 ) PageHelper.startPage(pageNo, pageSize);
        List<Map<String, Object>> dataList = entityModelMapper.selectByTableNameAndId(tableName, null, null, cond);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(dataList);
        return pageInfo;
    }
    /**
     * description:
     * @auther: SunBC
     * @date: 2019/1/29 13:26
     */
    @HproseAttribute.MethodAttribute(method = "listOthersByTable(Integer pageNo,Integer pageSize, String isFinished,String taskName,String userid,String tableComment)", description = "获取申请列表(非创建人)")
    @HproseDetailAttribute.MethodDetailAttribute(argsName = "pageNo#pageSize#isfinished#taskName#userid#tableComment", argsDes = "页码#每页数量#已办或待办（0：待办  1：已办）#任务名称 #用户id#表注释", eg = "")
    public Object listOthersByTable(Integer pageNo,Integer pageSize, String isFinished,String taskName,String userid,String tableComment) {
        List<String> ids = null;
        String cond="  ";
        String idsreal=null;
        String tableName = entityModelMapper.selectTableName(tableComment, null);
        PageInfo<Map<String, Object>> pageInfo = null;
        String key = tableName.toUpperCase();
        if (StringUtils.equals(isFinished, "1")) {
            ids = workflowService.findHistoryTask(key, userid, taskName);
        } else {
            ids = workflowService.findCurrentTask(key, userid, taskName);
        }
        cond+=" and ID in "+packageIN(ids);
        if(pageNo > 0 ) PageHelper.startPage(pageNo, pageSize);
        List<Map<String, Object>> dataList = entityModelMapper.selectByTableNameAndId(tableName, null, null, cond);
        pageInfo = new PageInfo<>(dataList);
        return pageInfo;
    }

    public  String  packageIN(List<String> strList) {
        if (CollectionUtils.isEmpty(strList)) return "('')";
        return strList.toString().replace(", ","','").replace("[","('").replace("]","') ");
    }
    /**获取流程信息
     * description:  约定工作流节点id是递增的
     * @auther: SunBC
     * @date: 2019/3/19 15:26
     */
    @HproseAttribute.MethodAttribute(method = "getWorkflowInfo(String sjid,String workFlowType)", description = "查看项目信息工作流详情")
    @HproseDetailAttribute.MethodDetailAttribute(argsName = "id#workFlowType", argsDes = "数据id#工作流类型（请假：RS_KQ_QJXX）", eg = "")
    public Object getWorkflowInfo(String sjid,String workFlowType) {
        List<Map<String, Object>> resultList = new ArrayList<>();
        Map<String, Object> proccessControlvariables = workflowService.getVariables(workFlowType + "." + sjid);
        List<Map<String, Object>> historyList = workflowService.findHistoryCompletedTask(workFlowType, sjid);
        List<Map<String, Object>> currentList = workflowService.findCurrentRunningTask(workFlowType, sjid);
        String procDefid = "";
        switch (workFlowType) {
            case "XMGL_XMXX":
                procDefid = XMGL_XMXX_PROCDEFID;
                break;
            default:
                break;
        }
        List<FlowElement> list2 = workflowService.getWorkflowPointRetrunFlowElements(procDefid);
        if(CollectionUtils.isEmpty(historyList) && CollectionUtils.isEmpty(currentList)){
            return null;
        }
        resultList.addAll(historyList);
        resultList.addAll(currentList);
        List<String> nameList = new ArrayList<>();
        int lastIndexOf = 0 ;
        if (currentList == null || currentList.size() == 0) return resultList;
        String taskid = (String)currentList.get(0).get("taskId");
        for (int i = 0; i < list2.size(); i++) {
            FlowElement flowElement = list2.get(i);
            String taskid_ = flowElement.getId();
            if(taskid_.compareTo(taskid)>0){
                Map<String, Object> map2 = new HashMap<>();
                map2.put("lzzt", 0);
                map2.put("taskName", flowElement.getName());
                map2.put("assignee", "");
                resultList.add(map2);
            }
        }
        return resultList;
    }
    /**流程回退起点，约定提交申请id为_2,审核状态未提交为0
     * description:
     * @auther: SunBC
     * @date: 2019/3/19 15:26
     */
    @Transactional
    @HproseAttribute.MethodAttribute(method = "processRollBackStart(String sjid,String workFlowType)", description = "基础——流程回退到起点")
    @HproseDetailAttribute.MethodDetailAttribute(argsName = "sjid#workFlowType", argsDes = "数据id#工作流类型(RS_KQ_QJXX)", eg = "由于资产盘点都用一张表，故设备为ZCGL_PD_BMPD_SB,办公为ZCGL_PD_BMPD_BG")
    public String processRollBackStart(String sjid, String type) throws Exception {
        workflowService.executeCommandJumpByActivityId(type + "." + sjid, "_2");
        entityModelMapper.updateSql("update "+type+" set SHZT = '0' where ID = '"+sjid+"'");
        return "";
    }
    /**流程回退
     * description:
     * @auther: SunBC
     * @date: 2019/3/19 15:30
     */
    public Object saveNewDeploye(String processName) {
        String rootPath = HproseServer.rootPath;
        workflowService.saveNewDeploye(rootPath +
                "WEB-INF/classes/liucheng/"+processName+".bpmn", processName,processName+".bpmn");
        return "";
    }
}
