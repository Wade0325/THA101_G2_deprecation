package web.user.user.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import core.pojo.Core;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User extends Core {
	/**
	 * 會員
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer userId;
    private String userAccount;
    private String userPassword;
    private String userName;
    private String userGender;
    private Date userBirth;
    private String userTel;
    private String userAddr;
    private String userEmail;
    private Byte userPic;
    private String userRep;
    private String userBan;
    private Date userCreateTime;
    private Date userUpdateTime;
    private String userStatus;
}
