import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Tudien", urlPatterns = "/translate")
public class Tudien extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "xin chao");
        dictionary.put("what", "trai sao");
        dictionary.put("how", "the nao");
        dictionary.put("book", "quyen vo");
        dictionary.put("computer", "may tinh");
        String search = request.getParameter("txtSearch");
        PrintWriter write = response.getWriter();
        write.println("<html>");
        String result = dictionary.get(search);
        if(result != null){
            write.println("Word: " + search);
            write.println("Result:" + result);
        }else {
            write.println("Not found");
        }
        write.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
