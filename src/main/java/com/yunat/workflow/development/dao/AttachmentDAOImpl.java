/**
 * 文件名：AttachmentDAOImpl.java
 *
 * 创建人：邱路平 - luping.qiu@huaat.com
 *
 * 创建时间：Jul 4, 2013 4:20:57 PM
 *
 * 版权所有：杭州数云信息技术有限公司
 */
package com.yunat.workflow.development.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yunat.workflow.development.pojo.Attachment;

/**
 * <p>开发中心附件表相关DAO接口实现</p>
 *
 * @author 邱路平 - luping.qiu@huaat.com
 * @version 1.0 Created on Jul 4, 2013 4:20:57 PM
 */
@Repository
public class AttachmentDAOImpl implements AttachmentDAO {

	@Autowired
	private SessionFactory sessionFactory;
	/**
	 * <p>根据任务id获取所有相关附件信息</p>
	 * 
	 * @see com.yunat.workflow.development.dao.AttachmentDAO#queryAttachmentByTaskId(java.lang.String)
	 * @author: 邱路平 - luping.qiu@huaat.com 
	 * @date: Created on Jul 4, 2013 4:20:57 PM
	 */
	public List<Attachment> queryAttachmentByTaskId(String task_id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Attachment t where t.task_id=:task_id");
		query.setParameter("task_id", task_id);
		List<Attachment> list= query.list();
		return list;
	}

}
