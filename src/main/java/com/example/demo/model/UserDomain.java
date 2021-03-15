package com.example.demo.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDomain {

	 /** 主键编号 */
    private Integer uid;
    /** 用户名 */
    private String username;
    /** 密码 */
    private String password;
    /** email */
    private String email;
    /** 昵称 */
    private String nickname;
    /** 年龄 */
    private Integer age;
    /** 性别 */
    private String sex;
    /** 是否有效 */
    private Integer invalidFlag;
    /** 创建时间 */
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdDate;
    /** 最后修改时间 */
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedDate;
    /** 创建人 */
    private String createdUser;
    /** 最后修改人 */
    private String updatedUser;
	
}
