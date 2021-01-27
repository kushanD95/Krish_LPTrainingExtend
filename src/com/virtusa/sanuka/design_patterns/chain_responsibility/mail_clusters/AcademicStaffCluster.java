package com.virtusa.sanuka.design_patterns.chain_responsibility.mail_clusters;

import com.virtusa.sanuka.design_patterns.chain_responsibility.Mail;
import com.virtusa.sanuka.design_patterns.chain_responsibility.constants.MailAccessLevels;

public class AcademicStaffCluster extends Handler {

    @Override
    public Mail addReceivers(Mail mail) {
        mail.setReceivers(dataStore.getAcademicStaff());
        if(mail.getMailAccessLevel() == MailAccessLevels.FACULTY_ACADEMIC_STAFF) {
            //return mail;
        }
        return mail;
    }
}
