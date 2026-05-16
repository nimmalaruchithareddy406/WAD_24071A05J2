import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PercentageServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String name = request.getParameter("name");

        int m1 = Integer.parseInt(request.getParameter("m1"));
        int m2 = Integer.parseInt(request.getParameter("m2"));
        int m3 = Integer.parseInt(request.getParameter("m3"));

        int total = m1 + m2 + m3;

        double percentage = total / 3.0;

        String result;

        if (percentage >= 35) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");

        out.println("<title>Result</title>");

        out.println("<style>");
        out.println("body { font-family: Arial; background-color:#f2f2f2; margin:0; }");
        out.println(".container { width:500px; background:white; margin:80px auto; padding:25px; border-radius:8px; box-shadow:0 0 8px gray; text-align:center; }");
        out.println("h2 { color:#2563eb; }");
        out.println("p { font-size:18px; }");
        out.println("a { background:#2563eb; color:white; padding:10px 20px; text-decoration:none; display:inline-block; margin-top:15px; }");
        out.println("footer { background:#222; color:white; text-align:center; padding:12px; margin-top:50px; }");
        out.println("</style>");

        out.println("</head>");

        out.println("<body>");

        out.println("<div class='container'>");

        out.println("<h2>Student Result</h2>");

        out.println("<p>Name: " + name + "</p>");

        out.println("<p>Total Marks: " + total + "</p>");

        out.println("<p>Percentage: " + percentage + "%</p>");

        out.println("<p>Result: " + result + "</p>");

        out.println("<a href='index.html'>Go Back</a>");

        out.println("</div>");

        out.println("<footer>");
        out.println("copyright@24071A05J2");
        out.println("</footer>");

        out.println("</body>");
        out.println("</html>");
    }
}