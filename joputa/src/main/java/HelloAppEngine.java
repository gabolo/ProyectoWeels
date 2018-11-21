import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiNamespace;

@Api(name= "Hello App Engine!\\r\\n" , namespace= @ApiNamespace(ownerDomain = "co.edu.unisabana", ownerName = "daniel"))
public class HelloAppEngine extends HttpServlet {

  
  }
