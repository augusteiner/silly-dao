package teste;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/removerRoteiro")
public class RemoveRoteiroServlet extends HttpServlet {

    public static ArrayList<Roteiro> lista = ListaRoteiroServlet.dao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        String pId = req.getParameter("id");

        if (pId == null) {


        } else {

            int id = Integer.parseInt(pId);

            lista.remove(id);

            resp.sendRedirect("roteiro");

        }

    }

}
