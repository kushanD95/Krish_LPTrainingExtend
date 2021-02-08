package com.sanuka.design_patterns.chain_responsibility.mail_clusters;

import com.sanuka.design_patterns.chain_responsibility.Mail;
import com.sanuka.design_patterns.chain_responsibility.constants.MailAccessLevels;

public class NonAcademicStaffCluster extends Handler {
    @Override
    public Mail addReceivers(Mail mail) {
        mail.setReceivers(dataStore.getNonAcademicStaff());

        if(mail.getMailAccessLevel() == MailAccessLevels.FACULTY_NON_ACADEMIC_STAFF) {
            return mail;
        } else {
            return successor.addReceivers(mail);
        }
    }
}
