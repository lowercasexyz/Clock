import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class MyFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeformate;
    JLabel timelabel;
    String time;
    JLabel daylabel;
    String day;
    SimpleDateFormat dayformate;
    SimpleDateFormat dateformate;
    JLabel datelabel;
    String date;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// to Exit the application
        this.setTitle("Clock");//we can set whatever we want it will get show up on the top of window
        this.setLayout(new FlowLayout());//A flow layout arranges components in a directional flow, much like
        // lines of text in a paragraph
        //this.setSize(400,300);
        this.setPreferredSize(new Dimension(400, 300));
        this.getContentPane().setBackground(Color.black);
        this.pack();
        this.setResizable(false);
        this.setVisible(true);


        timeformate = new SimpleDateFormat("hh:mm:ss a");
        timelabel = new JLabel();
        timelabel.setFont(new Font("Verdana",Font.PLAIN,57));
        timelabel.setForeground(Color.GREEN);
        timelabel.setBackground(Color.black);
        timelabel.setOpaque(true);

        this.add(timelabel);


        dayformate = new SimpleDateFormat("EEEE");
        daylabel =new JLabel();
        daylabel.setFont(new Font("Verdana",Font.PLAIN,37));
        daylabel.setForeground(Color.GREEN);
        daylabel.setBackground(Color.black);
        daylabel.setOpaque(true);



        this.add(daylabel);

        dateformate = new SimpleDateFormat("dd MMMM,yyyy");
        datelabel =new JLabel();
        datelabel.setFont(new Font("Verdana",Font.PLAIN,37));
        datelabel.setForeground(Color.GREEN);
        datelabel.setBackground(Color.black);
        datelabel.setOpaque(true);



        this.add(datelabel);




        setTime();
    }
    public void setTime() {
        while(true) {
            time = timeformate.format(Calendar.getInstance().getTime());
            timelabel.setText(time);

            day = dayformate.format(Calendar.getInstance().getTime());
            daylabel.setText(day);

            date = dateformate.format(Calendar.getInstance().getTime());
            datelabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



