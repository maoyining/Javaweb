package sevlets;

import java.io.IOException;


import java.io.PrintWriter;
//import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;






public class DealWithServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connectMySQL=null;
	PreparedStatement stat=null;
	ResultSet rs=null;
	int flag=0;
	String bookPrice=null;
	String bookName=null;
	String bookID=null;
	String bookAuthor=null;
	String bookname=null;
	/*public DealWithServlet() {
        super();
        // TODO Auto-generated constructor stub
    }*/
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		response.setContentType("text/html;charset=GB2312");
		PrintWriter out=response.getWriter();
		bookname=request.getParameter("bookname");
		try{
			Class.forName("com.mysql.jdbc.Driver");//加载驱动程序
			connectMySQL  =  DriverManager.getConnection("jdbc:mysql://localhost:3305/student","root","myn13567168626" );
			String sql = "SELECT bookID,bookName,bookPrice,bookAuthor FROM t_book where bookName=bookname";
		    stat = connectMySQL.prepareStatement(sql);
			rs=stat.executeQuery(sql);
			
			if(rs.next())
			{
				bookID = rs.getString("bookID");
				bookName = rs.getString("bookName");
				bookPrice = rs.getString("bookPrice");
				bookAuthor = rs.getString("bookAuthor");
				if(bookName.equals(bookname))
				{	
				//System.out.println("图书名称："+bookPrice);
					flag=1;
					//break;
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}

		finally{
			try{
				rs.close();
				stat.close();
				connectMySQL.close();
			}catch(Exception e){}
		}	
		if(flag==1)
			{
				System.out.println(bookID+' '+bookName+' '+bookPrice+' '+bookAuthor);
				out.println(bookID+' '+bookName+' '+bookPrice+' '+bookAuthor);
			}

	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
