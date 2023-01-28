package ojc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ControllerExceptionHandler {

	/**
	 * Controller�������� �߻��ϴ� ������ ��Ƽ� �޼���� ó��
	 * �����߻� -> error.jsp �ε�
	 */
	@ExceptionHandler(Exception.class)
	public ModelAndView handleError(Exception e) {
		//�����Ϳ� �� ���ÿ� ���� 
		ModelAndView mav = new ModelAndView("error/error"); //view ���
		mav.addObject("errorMsg", e.getMessage()); //view�� ���� ������
		return mav;
	}

}
