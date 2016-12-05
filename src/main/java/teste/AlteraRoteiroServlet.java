/*
 * MIT License
 *
 * Copyright (c) 2016 José Nascimento <joseaugustodearaujonascimento@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package teste;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author José Nascimento <joseaugustodearaujonascimento@gmail.com>
 */
@WebServlet("/alteraRoteiro")
public class AlteraRoteiroServlet extends HttpServlet {

    public static ArrayList<Roteiro> dao = ListaRoteiroServlet.dao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        String pId = req.getParameter("id");
        Roteiro roteiro;

        if (pId == null) {

            roteiro = new Roteiro();

        } else {

            int id = Integer.parseInt(pId);

            roteiro = dao.get(id);

        }

        req.setAttribute("roteiro", roteiro);

        req.getRequestDispatcher("cadastraRoteiro.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        String id = req.getParameter("id");
        String descricao = req.getParameter("descricao");

        Roteiro roteiro = new Roteiro();

        if (id == null || id.trim().length() == 0) {
            roteiro = new Roteiro();
            roteiro.setId(Long.valueOf(dao.size()));
        } else {
            roteiro = dao.get((int) Integer.parseInt(id));
            roteiro.setId(Long.parseLong(id));
        }

        roteiro.setDescricao(descricao);

        dao.add(roteiro);

        resp.sendRedirect("roteiro");

    }
}
