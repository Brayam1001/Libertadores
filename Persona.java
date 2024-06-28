
package app;

import java.util.ArrayList;

public abstract class Persona {
    
    
ArrayList di;
ArrayList numDoc;
ArrayList nombre;
ArrayList edad;
ArrayList email;
ArrayList numBus;
ArrayList Placa;

    public Persona(ArrayList di, ArrayList numDoc, ArrayList nombre, ArrayList edad, ArrayList email, ArrayList numBus, ArrayList Placa) {
        this.di = di;
        this.numDoc = numDoc;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.numBus = numBus;
        this.Placa = Placa;
    }

    public ArrayList getDi() {
        return di;
    }

    public void setDi(ArrayList di) {
        this.di = di;
    }

    public ArrayList getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(ArrayList numDoc) {
        this.numDoc = numDoc;
    }

    public ArrayList getNombre() {
        return nombre;
    }

    public void setNombre(ArrayList nombre) {
        this.nombre = nombre;
    }

    public ArrayList getEdad() {
        return edad;
    }

    public void setEdad(ArrayList edad) {
        this.edad = edad;
    }

    public ArrayList getEmail() {
        return email;
    }

    public void setEmail(ArrayList email) {
        this.email = email;
    }

    public ArrayList getNumBus() {
        return numBus;
    }

    public void setNumBus(ArrayList numBus) {
        this.numBus = numBus;
    }

    public ArrayList getPlaca() {
        return Placa;
    }

    public void setPlaca(ArrayList Placa) {
        this.Placa = Placa;
    }

public abstract void GuardarDi(String dis);
public abstract void GuardarNumDoc (String numDocs);
public abstract void GuardarNombre(String nombres);
public abstract void GuardarEdad(String edades);   
public abstract void GuardarEmail (String emails);
public abstract void GuardarNumBus (String numBuses);
public abstract void GuardarPlaca (String placas);
public abstract void EliminarDi(String dis);
public abstract void EliminarNumDoc (String numDocs);
public abstract void EliminarNombre(String nombres);
public abstract void EliminarEdad(String edades);   
public abstract void EliminarEmail (String emails);
public abstract void EliminarNumBus (String numBuses);
public abstract void EliminarPlacas(String placas);
public abstract String BuscarDi(String dis);
public abstract String BuscarNumDoc (String numDocs);
public abstract String BuscarNombre(String nombres);
public abstract String BuscarrEdad(String edades);   
public abstract String BuscarEmail (String emails);
public abstract String BuscarNumBus (String numBuses);
public abstract String BuscarPlaca (String placas);

}
