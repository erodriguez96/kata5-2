/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5parte2.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import kata5parte2.model.Histogram;
import kata5parte2.model.Mail;
import kata5parte2.view.HistogramDisplay;
import kata5parte2.view.MailHistogramBuilder;
import kata5parte2.view.MailListReaderDB;
/**
 *
 * @author eduardo
 */
public class kata5parte2 {
    private List<Mail> mailList;
    Histogram<String> histogram;

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
        new kata5parte2().execute();
    }

    public void execute() throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
        input();
        process();
        output();
    }

    private void input() throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
        mailList = MailListReaderDB.read();
    }

    private void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }

    private void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
