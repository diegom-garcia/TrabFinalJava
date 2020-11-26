/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import DB.HibernateUtil;
import DB.Login;
import Form.LoginActionForm;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import testelogin.vo.Usuario;

/**
 *
 * @author User
 */
public class LoginAction extends org.apache.struts.action.Action {

   /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            
            throws Exception {
        LoginActionForm formBean = (LoginActionForm) form;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Login login = (Login) session.createQuery("FROM LOGIN WHERE USUARIO = " + formBean.getUsuario() +"AND SENHA = " + formBean.getSenha()).uniqueResult();
        if (login != null) {
            //Usuario usuario = new Usuario(formBean.getUsuario(), formBean.getSenha());
           // request.getSession().setAttribute("usuario", usuario);
           session.flush();
           session.close();
            return mapping.findForward(SUCCESS);
        }else{
            session.flush();
            session.close();
            request.getSession().invalidate();
            return mapping.findForward(FAILURE);
        }
        
    }
}
