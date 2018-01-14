/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5parte2.view;

import java.util.List;
import kata5parte2.model.Histogram;
import kata5parte2.model.Mail;

/**
 *
 * @author eduardo
 */
public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> mail) {
        Histogram<String> histo = new Histogram<>();
        for (Mail mail1 : mail) histo.increment(mail1.getDomain());
        return histo;
    }
}
