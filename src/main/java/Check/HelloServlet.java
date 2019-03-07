package Check;
/** Проверяю Session */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Получаем сессию
        HttpSession session = request.getSession();
        //Получаем объект name
        String name = (String) session.getAttribute("name");

        PrintWriter out = response.getWriter();
        try {
            //Если объект ранее не установлен
            if (name == null) {
                session.setAttribute("name", "Tom Soyer");
                out.println("Session data are set");
            } else {
                out.println("Name: " + name);
                session.removeAttribute("name");
            }
        } finally {
            out.close();
        }
    }
}
