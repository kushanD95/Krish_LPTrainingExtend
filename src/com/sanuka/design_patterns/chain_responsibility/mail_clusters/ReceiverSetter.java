package com.sanuka.design_patterns.chain_responsibility.mail_clusters;

import com.sanuka.design_patterns.chain_responsibility.Mail;

public class ReceiverSetter extends Handler {
    @Override
    public Mail addReceivers(Mail mail) {
        return successor.addReceivers(mail);
    }
}
