package exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ExcetionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        if (e instanceof MyException) {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("msg", e.getMessage());
            modelAndView.setViewName("error.jsp");
            return modelAndView;
        }

        return null;
    }
}
