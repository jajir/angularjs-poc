package cz.equa.sandbox.angular.poc;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Singleton;

@Singleton
public class SimpleHttpServlet extends HttpServlet {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
	    IOException {
	final Writer w = resp.getWriter();
	w.write("<html>");
	w.write("<body>");
	w.write("<h1>Ahoj lidi!");
	w.write("</h1>");
	w.write("</body>");
	w.write("</html>");
	w.flush();
	super.doGet(req, resp);
    }

}
