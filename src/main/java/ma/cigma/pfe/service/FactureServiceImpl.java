package ma.cigma.pfe.service;

import ma.cigma.pfe.dao.IFactureDao;
import ma.cigma.pfe.models.Facture;

public class FactureServiceImpl implements IFactureService {

    IFactureDao fdao;

    public void setFdao(IFactureDao fdao) {
        this.fdao = fdao;
    }

    @Override
    public void save(Facture f) {
        fdao.save(f);
    }

    /*
    public void setFdao(IFactureService fdao) {
        this.fdao = fdao;
    }
*/



}
