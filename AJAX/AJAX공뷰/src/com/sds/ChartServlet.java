package com.sds;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class ChartServlet
 */
@WebServlet({ "/ChartServlet", "/chart" })
public class ChartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		// make json data
		JSONArray ja = new JSONArray();
		Random r = new Random();
		for(int i=0; i<10; i++) {
			int temp = r.nextInt(10)+1;
			JSONObject jo = new JSONObject();
			jo.put("rank",i+1);
			jo.put("keyword","김서겸"+temp);
			if(temp%2 == 0) {
				jo.put("type","<img src="+"up.jpg"+">");
			}else {
			jo.put("type","<img src="+"down.jpg"+">");
			}
			jo.put("cnt",temp);
			ja.add(jo);
		}
		//and response client		
		out.print(ja.toJSONString());
		
		out.close();
	}

}
