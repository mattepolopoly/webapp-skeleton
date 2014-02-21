package servlets;

import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(urlPatterns={"/servlet/*"})
public class TestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        request.setAttribute("exampleMessage", "Hello world!");
        request.setAttribute("queryString", request.getQueryString());
        request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request, response);
    }

}