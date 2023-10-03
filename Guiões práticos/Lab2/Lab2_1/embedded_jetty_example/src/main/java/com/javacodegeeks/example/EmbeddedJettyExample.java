package com.javacodegeeks.example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
//import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;

import org.apache.commons.lang3.StringEscapeUtils;

public class EmbeddedJettyExample {

      public static void main(String[] args) throws Exception {

            Server server = new Server(8680);

            ServletHandler servletHandler = new ServletHandler();
            server.setHandler(servletHandler);

            servletHandler.addServletWithMapping(HelloServlet.class, "/");

            server.start();
            server.join();

      }

      public static class HelloServlet extends HttpServlet {

            protected void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException 
            {
                  String paramMessage = request.getParameter("msg");

                  String unescaped = StringEscapeUtils.unescapeHtml4(paramMessage);

                  response.setContentType("text/html");
                  response.setStatus(HttpServletResponse.SC_OK);

                  if(paramMessage == null)
                  {
                        response.getWriter().println("<h1>New Hello Simple Servlet</h1>");
                  }
                  else
                  {
                        response.getWriter().println(unescaped);
                  }
                  
            }
      }
}