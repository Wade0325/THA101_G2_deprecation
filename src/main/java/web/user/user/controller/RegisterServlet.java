package web.user.user.controller;

import static core.util.CommonUtil.json2Pojo;
import static core.util.CommonUtil.writePojo2Json;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import core.util.CommonUtil;
import web.user.user.entity.User;
import web.user.user.service.UserService;


@WebServlet("/user/register2")
public class RegisterServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private UserService service;

	@Override
	public void init() throws ServletException {
		service = CommonUtil.getBean(getServletContext(), UserService.class);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		User user = json2Pojo(request, User.class);
		if (user == null) {
			user = new User();
			user.setMessage("無會員資訊");
			user.setSuccessful(false);
			writePojo2Json(response, user);
			return;
		}

		user = service.register(user);
		writePojo2Json(response, user);
	}
}
