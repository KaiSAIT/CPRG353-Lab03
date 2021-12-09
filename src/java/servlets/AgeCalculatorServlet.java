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
        String userage = request.getParameter("userAge");
        
        // set some attributes in the request object
        // the request object will be passed through to the JSP by the forward() method
        request.setAttribute("userAge", userage);
        
        // validations: if the parameters don't exist or are empty, show the first page again
        if( userage == null || userage.equals("") ) {
            
            //  set up a helpful error message for the user
            request.setAttribute("message", "You must give your current age");
            
            // display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
            return;
            
        }
        
        else {
            // check if user enter a number and display their age, if not a number, give them a message
            try {
                int userageInt = Integer.parseInt(userage);
                request.setAttribute("message", "Your age next birthday will be " + (userageInt + 1));
            } catch (NumberFormatException e) {
                request.setAttribute("message", "You must enter a number.");
            }
            
            // display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
            return;
            
        }

    }
    
}
