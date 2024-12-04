package jsp10_jdbc;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.pr")
public class ProductServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 서블릿 주소 추출
		String command = req.getServletPath();
		System.out.println(command); // /ProductMain.pr
		
		if (command.equals("/ProductMain.pr")) {
			RequestDispatcher dis
				= req.getRequestDispatcher("jsp10_jdbc/product_main.jsp");
			dis.forward(req, resp);
		} else if (command.equals("/ProductRegistForm.pr")) {
			RequestDispatcher dis
				= req.getRequestDispatcher("jsp10_jdbc/product_regist_form.jsp");
			dis.forward(req, resp);
		} else if (command.equals("/Product.pr")) {
			int product_id = Integer.parseInt(req.getParameter("product_id"));
			
			ProductDAO dao = new ProductDAO();
			ProductDTO prod = dao.select(product_id);
			req.setAttribute("prod", prod);
			
			String path = "jsp10_jdbc/product_";
			path += prod != null ? "detail.jsp" : "fail.jsp";
			
			RequestDispatcher dis = req.getRequestDispatcher(path);
			dis.forward(req, resp);
			
		} else if (command.equals("/ProductList.pr")) {
			
			ProductDAO dao = new ProductDAO();
			List<ProductDTO> prodList = dao.selectList();
			
			req.setAttribute("prodList", prodList);
			RequestDispatcher dis
				= req.getRequestDispatcher("jsp10_jdbc/product_list.jsp");
			dis.forward(req, resp);
		} else if (command.equals("/ProductRegist.pr")) {
			int product_id = Integer.parseInt(req.getParameter("product_id"));
			String product_name = req.getParameter("product_name");
			int product_price = Integer.parseInt(req.getParameter("product_price"));
			int product_qty = Integer.parseInt(req.getParameter("product_qty"));
			String product_img = req.getParameter("product_img");
			
			ProductDTO prod = new ProductDTO();
			prod.setProduct_id(product_id);
			prod.setProduct_name(product_name);
			prod.setProduct_price(product_price);
			prod.setProduct_qty(product_qty);
			prod.setProduct_img(product_img);
			
			System.out.println(prod);
			
			ProductDAO dao = new ProductDAO();
			int insertCnt = dao.insert(prod);
			
			String path = "jsp10_jdbc/product_";
			path += insertCnt > 0 ? "regist_success.jsp" : "fail.jsp";
			RequestDispatcher dis
				= req.getRequestDispatcher(path);
			
			dis.forward(req, resp);
			
		} else if (command.equals("/ProductDelete.pr")) {
			int product_id = Integer.parseInt(req.getParameter("product_id"));
			
			ProductDAO dao = new ProductDAO();
			int deleteCnt = dao.delete(product_id);
			
			
			
			String path = "jsp10_jdbc/product_";
			path += deleteCnt > 0 ? "regist_success.jsp" : "fail.jsp";
			RequestDispatcher dis
				= req.getRequestDispatcher(path);
			
			dis.forward(req, resp);
		}
		
		
		
	}
	
	
	
	
	
}
