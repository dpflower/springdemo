package springdemo.servlet;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import springdemo.entity.UserInfo;
import springdemo.service.UserService;

/**
 * Servlet implementation class UserList
 */
public class UserList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext servletContext = this.getServletContext();  
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);  
        UserService userService = (UserService) context.getBean("userService");  
        List<UserInfo> users = userService.getUsers();

        ServletOutputStream outputStream = response.getOutputStream();
        OutputStreamWriter ow = new OutputStreamWriter(outputStream,"UTF8");  
        ow.write("<html><body>");
        for (UserInfo userInfo : users) {
			ow.write(userInfo.toString());
			ow.write("<br />");
		}
        ow.write("</body></html>");              
        ow.flush(); 
        ow.close();  

        
	}

}
