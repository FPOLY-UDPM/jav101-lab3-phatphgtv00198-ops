package servlet;
import dao.StudentDAO;
import entity.SinhVien;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;
@WebServlet("/SinhVien")
public class SinhVienServlet extends HttpServlet {
    private StudentDAO dao = new StudentDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<SinhVien> list = dao.findAll();
        req.setAttribute("students", list);
        req.getRequestDispatcher("/views/SinhVien.jsp").forward(req, resp);
    }
}