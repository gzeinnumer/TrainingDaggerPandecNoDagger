package com.gzeinnumer.trainingdaggerpandecnodagger;

public class ProsesSession {
    SessionManager sessionManager;

    public ProsesSession(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    int getIdFromProsesSession(){
        return sessionManager.getId();
    }
}
