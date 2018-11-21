import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiIssuer;
import com.google.api.server.spi.config.ApiNamespace;
@Api(
	    name = "facade",
	    version = "v1",
	    namespace =
	    @ApiNamespace(
	        ownerDomain = "echo.example.com",
	        ownerName = "echo.example.com",
	        packagePath = ""
	    ),
	     issuers = {
	        @ApiIssuer(
	            name = "firebase",
	            issuer = "https://securetoken.google.com/wheels-221901",
	            jwksUri =
	                "https://www.googleapis.com/service_accounts/v1/metadata/x509/securetoken@system"
	                    + ".gserviceaccount.com"
	        )
	    }
	)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");

    response.getWriter().print("Hello App Engine!\r\n");

  }
}