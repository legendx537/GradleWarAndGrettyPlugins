package com.legend.gradle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/coupon")
public class CouponServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.getWriter().print("SUPERSALE");
        } catch (IOException e) {
            // Handle the IOException
            e.getMessage();
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String coupon = request.getParameter("coupon");
            request.setAttribute("discount", "Discount for coupon " + coupon + " is 50%");
            request.getRequestDispatcher("response.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            // Handle the ServletException or IOException
            e.getMessage();
        }
    }
}