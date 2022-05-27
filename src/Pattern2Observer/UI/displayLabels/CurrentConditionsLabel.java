package Pattern2Observer.UI.displayLabels;

import Pattern2Observer.displauClasses.CurrentConditionsDisplay;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class CurrentConditionsLabel extends JLabel{
    public CurrentConditionsLabel(CurrentConditionsDisplay display) {
        Map<String, Double> result = display.display();
        String text = "<html>Current conditions:<br>"+"    Temperature:"+result.get("Temperature")+
                "<br>     Humidity:" + result.get("Humidity")+"</html>";
//        String text = "<html><h2>What is Google Labs?</h2>" +
//                "<font face=’verdana’ size = 2>" +
//                " Google Labs is a playground <br>" +
//                " where our more adventurous users can play around with <br>" +
//                " prototypes of some of our wild and crazy ideas and <br>" +
//                " offer feedback directly to the engineers who developed<br>" +
//                " them. Please note that Labs is the first phase in <br>" +
//                " a lengthy product development process and none of this <br>" +
//                " stuff is guaranteed to make it onto Google.com. <br>" +
//                " While some of our crazy ideas might grow into the <br>" +
//                " next Gmail or iGoogle, others might turn out to be, <br>" +
//                " well, just plain crazy.</html>";
        setText(text);
        setFont(new Font(null, Font.PLAIN, 10));
    }
}
