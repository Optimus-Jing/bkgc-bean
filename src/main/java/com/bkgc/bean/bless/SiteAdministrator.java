package com.bkgc.bean.bless;
import java.sql.Timestamp;

public class SiteAdministrator 
{
	
    private String id;
    /**
    * 编号
    */
	public String getId() {
	    return this.id;
    }
    /**
    * 编号
    */
	public void setId(String id) {
		this.id = id;
	}
    private String name;
    /**
    * 姓名
    */
	public String getName() {
	    return this.name;
    }
    /**
    * 姓名
    */
	public void setName(String name) {
		this.name = name;
	}
    
    private String phone;
    /**
    * 电话
    */
	public String getPhone() {
	    return this.phone;
    }
    /**
    * 电话
    */
	public void setPhone(String phone) {
		this.phone = phone;
	}
    
    private String email;
    /**
    * 邮箱
    */
	public String getEmail() {
	    return this.email;
    }
    /**
    * 邮箱
    */
	public void setEmail(String email) {
		this.email = email;
	}
    
    private String loginId;
    /**
    * 登录账户编号
    */
	public String getLoginId() {
	    return this.loginId;
    }
    /**
    * 登录账户编号
    */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
    
    private String roleId;
    /**
    * 角色编号
    */
	public String getRoleId() {
	    return this.roleId;
    }
    /**
    * 角色编号
    */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
    
    private String createAdminId;
    /**
    * 创建人
    */
	public String getCreateAdminId() {
	    return this.createAdminId;
    }
    /**
    * 创建人
    */
	public void setCreateAdminId(String createAdminId) {
		this.createAdminId = createAdminId;
	}
    
    private Timestamp createTime;
    /**
    * 创建时间
    */
	public Timestamp getCreateTime() {
	    return this.createTime;
    }
    /**
    * 创建时间
    */
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
    private String roleName;
    /**
    * 角色名称
    */
	public String getRoleName() {
	    return this.roleName;
    }
    /**
    * 角色名称
    */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
    
    private int status;
    /**
    * 允许登录状态(0允许1不允许)
    */
	public int getStatus() {
	    return this.status;
    }
    /**
    * 允许登录状态(0允许1不允许)
    */
	public void setStatus(int status) {
		this.status = status;
	}
	
    private String userName;
    /**
    * 用户名
    */
	public String getUserName() {
	    return this.userName;
    }
    /**
    * 用户名
    */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	private String guid;
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
}

