package web.user.user.dao;

import core.dao.CoreDao;
import web.user.user.entity.User;

public interface UserDao extends CoreDao<User, Integer> {

	User selectByAccount(String useraccount);

	User selectForLogin(String useraccount, String userpassword);

}
