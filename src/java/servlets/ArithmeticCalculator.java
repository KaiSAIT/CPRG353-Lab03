package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculator extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // load up a JSP
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // capture the parameters coming in from the POST request
        int firstnumber = Integer.parseInt(request.getParameter("first_number"));
        int secondnumber = Integer.parseInt(request.getParameter("second_number"));
        
        // set some attributes in the request object
        // the request object will be passed through to the JSP by the forward() method
        request.setAttribute("firstNumber", firstnumber);
        request.setAttribute("firstNumber", firstnumber);
        
        // validations: if the parameters don't exist or are empty, show the first page again
        if( firstnumber == null || firstnumber.equals("") || secondnumber == null || secondnumber.equals("")) {
            
            //  set up a helpful error message for the user
            request.setAttribute("message", "Result: invalid");
            
            // display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;
            
        }

    }
    
}
