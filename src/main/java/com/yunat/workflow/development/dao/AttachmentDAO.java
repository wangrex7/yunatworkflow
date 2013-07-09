package com.yunat.workflow.development.dao;

import java.util.List;

import com.yunat.workflow.development.pojo.Attachment;


/**
 * <p>开发中心附件表相关DAO接口</p>
 *
 * @author 邱路平 - luping.qiu@huaat.com
 * @version 1.0 Created on Jun 26, 2013 6:18:59 PM
 */
public interface AttachmentDAO {
	
	/**
	 * <p>根据任务id获取所有相关附件信息</p>
	 * 
	 * @param task_id
	 * @return
	 * @return: List<Attachment>
	 * @author: 邱路平 - luping.qiu@huaat.com
	 * @date: Created on Jul 4, 2013 4:20:04 PM
	 */
	public List<Attachment> queryAttachmentByTaskId(String task_id);
	
}
