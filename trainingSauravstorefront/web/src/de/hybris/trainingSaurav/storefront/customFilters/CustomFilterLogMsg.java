package de.hybris.trainingSaurav.storefront.customFilters;

import org.apache.log4j.Logger;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class CustomFilterLogMsg extends GenericFilterBean {

    Logger LOG=Logger.getLogger(CustomFilterLogMsg.class.getName());
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        LOG.info("Pre Request actions...");

        filterChain.doFilter(request, response);

        LOG.info("Post request actions...");
    }
}
