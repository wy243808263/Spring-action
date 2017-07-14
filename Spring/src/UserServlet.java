import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qhit.mapper.UserMapper;
import com.qhit.model.Member;

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = -7691912418825361506L;

	ApplicationContext context;
	UserMapper mapper;

	@Override
	public void init() throws ServletException {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		mapper = (UserMapper) context.getBean("userDao");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		if ("list".equals(cmd)) {
			list(request, response);
		} else if ("find".equals(cmd)) {
			find(request, response);
		} else if ("update".equals(cmd)) {
			update(request, response);
		} else if ("del".equals(cmd)) {
			del(request, response);
		}
	}

	/**
	 * 根据编号修改会员信息
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");

		// 获取提交表单信息
		String userName = new String(request.getParameter("userName").getBytes("ISO-8859-1"), "UTF-8");
		String sex = request.getParameter("sex");
		String userNo = new String(request.getParameter("userNo").getBytes("ISO-8859-1"), "UTF-8");
		String age = request.getParameter("age");
		String address = new String(request.getParameter("address").getBytes("ISO-8859-1"), "UTF-8");
		String userCard = request.getParameter("userCard");
		String userID = request.getParameter("userID");
		String joinDate = request.getParameter("joinDate");
		String telePhone = request.getParameter("telePhone");

		Member member = new Member();
		member.setJoinDate(joinDate);
		member.setUserName(userName);
		member.setAge(Integer.valueOf(age));
		member.setUserID(userID);
		member.setTelePhone(telePhone);
		member.setUserNo(userNo);
		member.setAddress(address);
		member.setUserCard(userCard);
		member.setSex(sex);
		if (id.isEmpty()) {
			mapper.insertUser(member);
		} else {
			member.setId(Integer.valueOf(id));
			mapper.updateUser(member);
		}
		response.sendRedirect("UserServlet?cmd=list");
	}

	/**
	 * 根据编号查询会员信息
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void find(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		if (!id.isEmpty()) {
			Member member = mapper.selectUserById(Integer.valueOf(id));
			request.setAttribute("member", member);
		}
		request.getRequestDispatcher("find.jsp").forward(request, response);
	}

	/**
	 * 根据编号删除会员信息
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void del(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id = request.getParameter("id");
		if (!id.isEmpty()) {
			mapper.delUser(Integer.valueOf(id));
		}
		response.sendRedirect("UserServlet?cmd=list");
	}

	/**
	 * 显示会员列表
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Member> members = mapper.selectAllUser();
		request.setAttribute("members", members);
		request.getRequestDispatcher("list.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}