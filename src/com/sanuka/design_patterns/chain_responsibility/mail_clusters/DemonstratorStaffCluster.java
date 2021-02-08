package com.sanuka.design_patterns.chain_responsibility.mail_clusters;

import com.sanuka.design_patterns.chain_responsibility.Mail;
import com.sanuka.design_patterns.chain_responsibility.constants.MailAccessLevels;

public class DemonstratorStaffCluster extends Handler {
    @Override
    public Mail addReceivers(Mail mail) {
        mail.setReceivers(dataStore.getDemonstratorStaff());

        if(mail.getMailAccessLevel() == MailAccessLevels.FACULTY_DEMONSTRATOR_STAFF) {
            return mail;
        } else {
            return successor.addReceivers(mail);
        }
    }
}
