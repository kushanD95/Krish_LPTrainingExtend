package com.sanuka.design_patterns.chain_responsibility.mail_clusters;

import com.sanuka.design_patterns.chain_responsibility.Mail;
import com.sanuka.design_patterns.chain_responsibility.data_store.DataStore;

public abstract class Handler {
    Handler successor;
    DataStore dataStore = new DataStore();

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract Mail addReceivers(Mail mail);
}
