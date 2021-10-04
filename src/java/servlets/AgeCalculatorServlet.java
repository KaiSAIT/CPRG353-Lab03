package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // load up a JSP
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // capture the parameters coming in from the POST request
        String userage = request.getParameter("user_age");
        
        // set some attributes in the request object
        // the request object will be passed through to the JSP by the forward() method
        request.setAttribute("userAge", userage);
        
        // validations: if the parameters don't exist or are empty, show the first page again
        if( userage == null || userage.equals("") || !isNumeric(userage) ) {
            
            //  set up a helpful error message for the user
            request.setAttribute("message", "You must give your current age");
            
            // display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
            return;
            
        }
        
        else {
            
            
            request.setAttribute("message", "Your age next birthday will be " + userage);
            
            // display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
            return;
            
        }

    }

    private boolean isNumeric(String userage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
