package ma.cigma.pfe.Controller;

import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.service.IFactureService;

public class FactureController {

    IFactureService fservice;

    public void setFservice(IFactureService fservice) {
        this.fservice = fservice;
    }


/*
    public void setFservice(IFactureService fservice) {
        this.fservice = fservice;
    }

 */

    public void save(Facture f){
        fservice.save(f);
    }
}
