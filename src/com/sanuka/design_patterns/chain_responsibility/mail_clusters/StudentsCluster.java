package com.sanuka.design_patterns.chain_responsibility.mail_clusters;

import com.sanuka.design_patterns.chain_responsibility.Mail;
import com.sanuka.design_patterns.chain_responsibility.constants.MailAccessLevels;

public class StudentsCluster extends Handler {@Override
    public Mail addReceivers(Mail mail) {
        mail.setReceivers(dataStore.getStudents());

        if(mail.getMailAccessLevel() == MailAccessLevels.FACULTY_STUDENTS) {
            return mail;
        } else {
            return successor.addReceivers(mail);
        }
    }
}
