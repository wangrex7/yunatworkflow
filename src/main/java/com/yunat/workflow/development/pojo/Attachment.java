/**
 * 文件名：Attachment.java
 *
 * 创建人：邱路平 - luping.qiu@huaat.com
 *
 * 创建时间：Jul 4, 2013 4:05:04 PM
 *
 * 版权所有：杭州数云信息技术有限公司
 */
package com.yunat.workflow.development.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>
 * 附件信息表
 * </p>
 * 
 * @author 邱路平 - luping.qiu@huaat.com
 * @version 1.0 Created on Jul 4, 2013 4:05:04 PM
 */
@Entity
@Table(name = "attachment")
public class Attachment {
	
	@Id
	@Column(name = "fid")
	private String fid = null;
	
	@Column(name = "task_id")
	private String task_id = null;
	
	@Column(name = "file_name")
	private String file_name = null;
	
	@Column(name = "description")
	private String description = null;
	
	public String getFid() {
		return fid;
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
