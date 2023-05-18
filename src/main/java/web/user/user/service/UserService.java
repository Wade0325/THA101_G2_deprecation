package web.user.user.service;

import core.service.CoreService;
import web.user.user.entity.User;


public interface UserService extends CoreService {
	
	User register(User user);


}
