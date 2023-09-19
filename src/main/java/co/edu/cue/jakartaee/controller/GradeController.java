package co.edu.cue.jakartaee.controller;

import co.edu.cue.jakartaee.domain.enums.Career;
import co.edu.cue.jakartaee.domain.model.Grade;
import co.edu.cue.jakartaee.repositories.impl.GradeRepositoryLogicImpl;
import co.edu.cue.jakartaee.services.GradeService;
import co.edu.cue.jakartaee.services.impl.GradeServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "gradeController", value = "/grade-form")
public class GradeController extends HttpServlet {
    private GradeRepositoryLogicImpl gradeRepository;
    private GradeService service;

    public GradeController() {
        gradeRepository = new GradeRepositoryLogicImpl();
        service = new GradeServiceImpl(gradeRepository);
    }

    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Students</h1>");
        out.println(service.listar());
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        Integer name = Integer.parseInt(req.getParameter("grade"));
        Grade grade = new Grade(4, name);
        service.guardar(grade);
        System.out.println(service.listar());

        try (PrintWriter out = resp.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("    <head>");
            out.println("        <meta charset=\"UTF-8\">");
            out.println("        <title>Resultado form</title>");
            out.println("    </head>");
            out.println("    <body>");
            out.println("        <h1>Resultado form!</h1>");

            out.println("        <ul>");
            out.println("            <li>Grade: " + name + "</li>");
            out.println("        </ul>");
            out.println("    </body>");
            out.println("</html>");
        }
    }

    public void destroy() {
    }
}
