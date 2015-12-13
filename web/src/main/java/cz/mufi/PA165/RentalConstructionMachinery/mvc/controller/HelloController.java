package cz.mufi.PA165.RentalConstructionMachinery.mvc.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController implements InitializingBean {

    protected final Log logger = LogFactory.getLog(getClass());

    @RequestMapping("/hello")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String now = (new Date()).toString();
        logger.info("Returning hello view with " + now);
        request.setAttribute("baseUrl", request.getContextPath());

        logger.info("CCCCCCCCCCCCCCCCCCCCCCC");
        logger.info("CCCCCCCCCCCCCCCCCCCCCCC");
        logger.info("CCCCCCCCCCCCCCCCCCCCCCC");
        logger.info("CCCCCCCCCCCCCCCCCCCCCCC");
        logger.info("CCCCCCCCCCCCCCCCCCCCCCC");

        return new ModelAndView("hello", "now", now);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("CCCCCCCCCCCCCCCCCCCCCCC");
        logger.info("CCCCCCCCCCCCCCCCCCCCCCC");
        logger.info("CCCCCCCCCCCCCCCCCCCCCCC");
        logger.info("CCCCCCCCCCCCCCCCCCCCCCC");
        logger.info("CCCCCCCCCCCCCCCCCCCCCCC");

    }

}
