
package app;

import java.util.ArrayList;

public class Conductor extends Persona{

    public Conductor(ArrayList di, ArrayList numDoc, ArrayList nombre, ArrayList edad, ArrayList email, ArrayList numBus, ArrayList Placa) {
        super(di, numDoc, nombre, edad, email, numBus, Placa);
    }

    @Override
    public void GuardarDi(String dis) {
    super.di.add(dis);
    }

    @Override
    public void GuardarNumDoc(String numDocs) {
        super.numDoc.add(numDocs);
    }

    @Override
    public void GuardarNombre(String nombres) {
        this.nombre.add(nombres);
    }

    @Override
    public void GuardarEdad(String edades) {
        this.edad.add(edades);
    }

    @Override
    public void GuardarEmail(String emails) {
    this.email.add(emails);
    }

    @Override
    public void GuardarNumBus(String numBuses) {
       this.numBus.add(numBuses); 
    }

    @Override
    public void GuardarPlaca(String placas) {
        this.Placa.add(placas);
    }

    @Override
    public void EliminarDi(String dis) {
       super.di.remove(dis); }

    @Override
    public void EliminarNumDoc(String numDocs) {
        super.numDoc.remove(numDocs); }

    @Override
    public void EliminarNombre(String nombres) {
        super.nombre.remove(nombres);
    }

    @Override
    public void EliminarEdad(String edades) {
        super.edad.remove(edades);
    }

    @Override
    public void EliminarEmail(String emails) {
        super.email.remove(emails);
    }

    @Override
    public void EliminarNumBus(String numBuses) {
        super.numBus.remove(numBuses); }

    @Override
    public void EliminarPlacas(String placas) {
        super.Placa.remove(placas);
    }

    @Override
    public String BuscarDi(String dis) {
         String buscardi="";
            if (super.di.contains(dis)==true) {
            buscardi = super.di.get(super.di.indexOf(dis)).toString();
        } else {
          buscardi="No Existe";
        }
            return buscardi;
    
    }

    @Override
    public String BuscarNumDoc(String numDocs) {
        String buscarNumDoc="";
            if (super.numDoc.contains(numDocs)==true) {
            buscarNumDoc = super.numDoc.get(super.numDoc.indexOf(numDocs)).toString();
        } else {
          buscarNumDoc="No Existe";
        }
            return buscarNumDoc;
    
    }

    @Override
    public String BuscarNombre(String nombres) {
        String buscarNombre="";
            if (super.nombre.contains(nombres)==true) {
            buscarNombre = super.nombre.get(super.nombre.indexOf(nombres)).toString();
        } else {
          buscarNombre="No Existe";
        }
            return buscarNombre;
    
    }


    @Override
    public String BuscarrEdad(String edades) {
         String buscarEdad="";
            if (super.edad.contains(edades)==true) {
            buscarEdad = super.edad.get(super.edad.indexOf(edades)).toString();
        } else {
          buscarEdad="No Existe";
        }
            return buscarEdad;
    
    }

    @Override
    public String BuscarEmail(String emails) {
        String buscarEmail="";
            if (super.email.contains(emails)==true) {
            buscarEmail = super.email.get(super.email.indexOf(emails)).toString();
        } else {
          buscarEmail="No Existe";
        }
            return buscarEmail;
    
    }

    @Override
    public String BuscarNumBus(String numBuses) {
        String buscarNumBUs="";
            if (super.numBus.contains(numBuses)==true) {
            buscarNumBUs = super.numBus.get(super.numBus.indexOf(numBuses)).toString();
        } else {
          buscarNumBUs="No Existe";
        }
            return buscarNumBUs;
    
    }
    @Override
    public String BuscarPlaca(String placas) {
       String buscarPlaca="";
            if (super.Placa.contains(placas)==true) {
            buscarPlaca = super.Placa.get(super.Placa.indexOf(placas)).toString();
        } else {
          buscarPlaca="No Existe";
        }
            return buscarPlaca;
    
    }
}
