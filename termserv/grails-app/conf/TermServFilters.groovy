public class TermServFilters {

  def filters = {
    tenantDomainResolutionFilter(controller: '*', action: '*') {
      before = {
        // String scheme = request.getScheme();
        // String serverName = request.getServerName();
        // int portNumber = request.getServerPort();
        // String contextPath = request.getContextPath();
        // String servletPath = request.getServletPath();
        // String pathInfo = request.getPathInfo();
        // String query = request.getQueryString();
        log.debug("tenantDomainResolutionFilter domain=${request.getServerName()}");
        return true
      }
    }
  }
}
