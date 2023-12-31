package url;

import java.util.ArrayList;
import java.util.HashMap;

public class ModelView {
    String[] view;
    HashMap<String, Object> data=new HashMap<String, Object>();
    HashMap<String, Object> session = new HashMap<String, Object>();
    ArrayList<String> sessionRemove = new ArrayList<String>();
    boolean json;
    boolean invalidateSession;

/*-----------------------------------Fonctions prérequis--------------------------------------- */
/// Getters and setters
    public String[] getView() {
        return this.view;
    }

    public void setView(String[] nouveau)
    throws Exception {
        if(nouveau==null) {
            throw new Exception("Nom de vue null lors de l'instanciation de ModelView");
        } else if(nouveau.length==0) {
            throw new Exception("Veuillez entrer un nom de vue");
        }
        this.view=nouveau;
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }

    public HashMap<String, Object> getSession() {
        return session;
    }

    public void setSession(HashMap<String, Object> nouveau)
    throws Exception {
        if(nouveau==null||nouveau.size()==0) {
            throw new Exception("Veuillez entrer des variables de sessions");
        } 
        this.session = nouveau;
    }

    public boolean isJson() {
        return json;
    }

    public void setJson(boolean nouveau) {
        this.json = nouveau;
    }

    public ArrayList<String> getSessionRemove() {
        return sessionRemove;
    }

    public void setSessionRemove(ArrayList<String> nouveau)
    throws Exception {
        if(nouveau==null) {
            throw new Exception("Veuillez definir des sessions a supprimer");
        }
        this.sessionRemove = nouveau;
    }

    public boolean isInvalidateSession() {
        return invalidateSession;
    }

    public void setInvalidateSession(boolean invalidateSession) {
        this.invalidateSession = invalidateSession;
    }

/// Constructeurs
    public ModelView(String...view)
    throws Exception {
        this.setView(view);
    }

/*---------------------------------------------Fonctions principales------------------------------------------- */
/// Add item
    public void addItem(String key, Object value) {
        this.getData().put(key, value);
    }

/// Ajouter session
    public void addSession(String key, Object value) {
        this.getSession().put(key, value);
    }

/// Effacer une session
    public void removeSession(String key) {
        this.getSessionRemove().add(key);
    }
}
