package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

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
        String firstnumber = request.getParameter("first_number");
        String secondnumber = request.getParameter("second_number");
        String add = request.getParameter("add");
        String subtract = request.getParameter("subtract");
        String multiply = request.getParameter("multiply");
        String modulus = request.getParameter("modulus");
        
        // set some attributes in the request object
        // the request object will be passed through to the JSP by the forward() method
        request.setAttribute("firstNumber", firstnumber);
        request.setAttribute("secondNumber", secondnumber);
        request.setAttribute("add", add);
        request.setAttribute("subtract", subtract);
        request.setAttribute("multiply", multiply);
        request.setAttribute("modulus", modulus);
        
        // validations: if the parameters don't exist or are empty, show the first page again
        if( firstnumber == null || firstnumber.equals("") || secondnumber == null || secondnumber.equals("") ) {
            
            //  set up a helpful error message for the user
            request.setAttribute("message", "Result: invalid");
            
            // display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;
            
        }
        else {
            
            //try to see if user inputted a number, if not display error message
            try {
                int firstNumberInt = Integer.parseInt(firstnumber);
                int secondNumberInt = Integer.parseInt(secondnumber);
            } catch (NumberFormatException e) {
                request.setAttribute("message", "Invalid.");
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            }
            
        }
        
  
    }
    
}
