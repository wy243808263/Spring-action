package cn.itcast.s2sh0808.result;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.ServletDispatcherResult;
import org.apache.struts2.dispatcher.StrutsResultSupport;

import com.opensymphony.xwork2.ActionInvocation;

public class Java0909Result extends StrutsResultSupport{

	@Override
	protected void doExecute(String finalLocation, ActionInvocation invocation)
			throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaa");
        RequestDispatcher dispatcher = request.getRequestDispatcher(finalLocation);
        dispatcher.forward(request, response);
	}

}
