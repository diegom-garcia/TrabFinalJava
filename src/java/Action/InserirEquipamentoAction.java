/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import DB.Departamentos;
import DB.Equipamentos;
import DB.HibernateUtil;
import DB.Inventario;
import Form.InserirEquipamentoActionForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DIEGO
 */
public class InserirEquipamentoAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

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
        InserirEquipamentoActionForm formBean = (InserirEquipamentoActionForm) form;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Equipamentos equipamentos = (Equipamentos) session.createQuery("FROM Equipamentos where chave_equip = " + formBean.getNomeEquip());
        //Departamentos departamento = (Departamentos) session.createQuery("FROM DEPARTAMENTOS where ID_DEPARTAMENTO = " + 1);
        //Inventario inventario = new Inventario(formBean.getIdEquip(),equipamentos );
        //session.save(inventario);
        transaction.commit();
        session.flush();
        session.close();
        return mapping.findForward(SUCCESS);
    }
}
