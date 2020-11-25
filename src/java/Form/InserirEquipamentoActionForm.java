/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import DB.Departamentos;
import DB.HibernateUtil;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.hibernate.Session;

/**
 *
 * @author DIEGO
 */
public class InserirEquipamentoActionForm extends org.apache.struts.action.ActionForm {

    private String nomeEquip;
    private int idEquip;
    private int qtdeEquip;
    private List<Departamentos> departamentos;
    private int departamento;

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }
    
    public List<Departamentos> getDepartamentos(){
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        departamentos = session.createQuery("from DEPARTAMENTOS").list();
//        session.close();
        departamentos.add(new Departamentos());
        return departamentos;
    }
    
    /**
     *
     */
    public InserirEquipamentoActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getNomeEquip() == null || getNomeEquip().equals("")) {
            errors.add("nomeEquip", new ActionMessage("error.nomeEquip.required"));
        }
//        if (getIdEquip() > 1) {
//            errors.add("idEquip", new ActionMessage("error.idEquip.required"));
//        }
        if (getQtdeEquip() > 1) {
            errors.add("qtdeEquip", new ActionMessage("error.qtdeEquip.required"));
        }
        return errors;
    }

    public String getNomeEquip() {
        return nomeEquip;
    }

    public void setNomeEquip(String nomeEquip) {
        this.nomeEquip = nomeEquip;
    }

    public int getIdEquip() {
        return idEquip;
    }

    public void setIdEquip(int idEquip) {
        this.idEquip = idEquip;
    }

    public int getQtdeEquip() {
        return qtdeEquip;
    }

    public void setQtdeEquip(int qtdeEquip) {
        this.qtdeEquip = qtdeEquip;
    }
}
