/**
 * 文件名：Attachment.java
 *
 * 创建人：邱路平 - luping.qiu@huaat.com
 *
 * 创建时间：Jul 4, 2013 4:05:04 PM
 *
 * 版权所有：杭州数云信息技术有限公司
 */
package com.yunat.workflow.development.domain;


/**
 * <p>
 * 附件信息表
 * </p>
 * 
 * @author 邱路平 - luping.qiu@huaat.com
 * @version 1.0 Created on Jul 4, 2013 4:05:04 PM
 */
public class AttachmentDomain {
	
	private String fid = null;
	
	private String task_id = null;
	
	private String file_name = null;
	
	private String description = null;
	
	private String task_name = null;
	
	public String getFid() {
		return fid;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getTask_id() {
		return task_id;
	}

	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
