import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;

public class Download extends JFrame{

   static Calendar cal = Calendar.getInstance();
   static String[] Days = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
   public static String Zipcode, location, today, weather, temp, sunrise, sunset, tonight, ttemp, dtemp, ttemp2, tomorrow, dayafter2morrow;//Create the string variable that will hold the zipcode
   
   public static void main(String[] args){
      //Display the frame
      Download frame = new Download();
}
   
   
    static void scraper(String zip) throws IOException{

      String website = "http://i.wund.com/cgi-bin/findweather/getForecast?brand=iphone&query=" + zip;
      // Make a URL to the web page
      URL url = new URL(website);
   
      // Get the input stream through URL Connection
      URLConnection con = url.openConnection();
      InputStream is =con.getInputStream();
      
       // Once you have the Input Stream, it's just plain old Java IO stuff.
   
      // For this case, since you are interested in getting plain-text web page
      // I'll use a reader and output the text content to System.out.
   
      // For binary content, it's better to directly read the bytes from stream and write
      // to the target file.
   
   
       BufferedReader br = new BufferedReader(new InputStreamReader(is));
   
       String line = null;
       String  loc = "<title>";
       String div = "<div>";
       
       int i = 0;
   
       // read each line of the HTML and parse the city, zipcode, temperature, Sunrise, and Sunset. Also find tonights, tomorrow's, and tommorow night's temperature and weather.
       while ((line = br.readLine()) != null){
          i++;
          //get substring of the city and zipcode
          if (line.contains(loc)){
             location = line.substring(line.lastIndexOf(loc) + 7, line.lastIndexOf(")") + 1);
             
}
          //get the current temperature
          if (i == 83){
             temp = line.substring(line.indexOf("<b>") + 3, line.lastIndexOf("</b>")) + "�F";
}
          //get the weather conditions
          if (i == 87){
             weather = line.substring(line.indexOf(div) + 5, line.lastIndexOf("<"));
}
          //get the sunrise time
          if (line.contains("Sunrise:")){
             sunrise = "Sunrise: " + line.substring(line.indexOf("<b>") + 3, line.lastIndexOf("</b>"));

}
          //get the sunset time
          if (line.contains("Sunset:")){
             sunset = "Sunset: " + line.substring(line.indexOf("<b>") + 3, line.lastIndexOf("</b>"));
}
         //get tonight's, tommorow's, and tomorrow night's weather conditions
          if (line.contains("Tonight</span><br />")){
             line = br.readLine();
             tonight = line.substring(line.indexOf(div)+5, line.indexOf('.')+1);
             for (int x = 0; x<7; x++){
               line = br.readLine();
}             
             tomorrow = line.substring(line.indexOf(div)+5, line.indexOf('.')+1);
             for (int x = 0; x<7; x++){
               line = br.readLine();
}             
             dayafter2morrow = line.substring(line.indexOf(div)+5, line.indexOf('.')+1);                                 
}
          //get tonight's, tomorrow's, and tomorrow night's temperatures
          if (line.contains("<div>Today</div>")){
             line = br.readLine();
             line = br.readLine();
             ttemp = line.substring(line.lastIndexOf('"')+ 2, line.lastIndexOf('&'))+ "�F" ;
             for (int x = 0; x<7; x++){
               line = br.readLine();
}             
             dtemp = line.substring(25, line.indexOf('&')) + "�F";
             for (int x = 0; x<7; x++){
               line = br.readLine();
}             
             ttemp2 = line.substring(line.lastIndexOf('"')+ 2, line.lastIndexOf('&'))+ "�F" ; 
}                                                                 
}   
}
       
   //create 4 JPanels with GridBagLayout
   JPanel p = new JPanel(new GridBagLayout());
   JPanel forecast1 = new JPanel(new GridBagLayout());
   JPanel forecast2 = new JPanel(new GridBagLayout());
   JPanel forecast3 = new JPanel(new GridBagLayout());
   //Create 15 final JLabels that will show contents after an action Event
   final JLabel jl1 = new JLabel();//Create JLable
   final JLabel jl2 = new JLabel();//Create JLable
   final JLabel jl3 = new JLabel();//Create JLable
   final JLabel jl4 = new JLabel();//Create JLable
   final JLabel jl5 = new JLabel();//Create JLable
   final JLabel jl6 = new JLabel();//Create JLable
   final JLabel jl7 = new JLabel();//Create JLable
   final JLabel jl8 = new JLabel();//Create JLable
   final JLabel jl9 = new JLabel();//Create JLable
   final JLabel jl10 = new JLabel();//Create JLable
   final JLabel jl11 = new JLabel();//Create JLable
   final JLabel jl12 = new JLabel();//Create JLable
   final JLabel jl13 = new JLabel();//Create JLable
   final JLabel jl14 = new JLabel();//Create JLable
   final JLabel jl15 = new JLabel();//Create JLable
   JButton jb = new JButton("Search");//Create Search Button
   JTextField tf = new JTextField(10);//Create Zip code text field
   
   
   
   // Create the JFrame
   public Download(){
      super("Weather Forecast");
      setVisible(true);
      setSize(1000,800);
      setResizable(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      GridBagConstraints c = new GridBagConstraints();
      GridBagConstraints gbc = new GridBagConstraints();
      //add an action listener so the user can press enter using the JButton
      jb.addActionListener(new ActionListener()
      {
      
         public void actionPerformed(ActionEvent e)
         {
            String Zipcode = tf.getText();
            //create a try catch block to catch IOException
            try{
               //call the scraper method
               scraper(Zipcode);
               //set the text to all of the JLabels
               jl1.setText(location);
               jl2.setText("Currently");
               jl3.setText("Tonight");
               jl4.setText(Days[cal.get(Calendar.DAY_OF_WEEK)]);
               jl5.setText(Days[cal.get(Calendar.DAY_OF_WEEK)] + " night");
               jl6.setText(temp);
               jl7.setText(weather);
               jl8.setText(sunrise);
               jl9.setText(sunset);
               jl10.setText(tonight);
               jl11.setText(ttemp);
               jl12.setText(tomorrow);
               jl13.setText(dtemp);
               jl14.setText(dayafter2morrow);
               jl15.setText(ttemp2);
}        catch(IOException io){
            JOptionPane.showMessageDialog(null, "Nice valid zipcode you have there. Please try again..");
}
}
});
      
      //add an action listener so the user can press enter
      tf.addActionListener(new ActionListener(){
      
        public void actionPerformed(ActionEvent e){
         //get the text into the text field and set it to Zipcode
         String Zipcode = tf.getText();
         //create a try catch block to catch IOException
         try{
            //call the scraper method
            scraper(Zipcode);
            //set all the text to all of the JLabels
            jl1.setText(location);
            jl2.setText("Currently");
            jl3.setText("Tonight");
            jl4.setText(Days[cal.get(Calendar.DAY_OF_WEEK)]);
            jl5.setText(Days[cal.get(Calendar.DAY_OF_WEEK)] + " night");
            jl6.setText(temp);
            jl7.setText(weather);
            jl8.setText(sunrise);
            jl9.setText(sunset);
            jl10.setText(tonight);
            jl11.setText(ttemp);
            jl12.setText(tomorrow);
            jl13.setText(dtemp);
            jl14.setText(dayafter2morrow);
            jl15.setText(ttemp2);
}        catch(IOException io){
            JOptionPane.showMessageDialog(null, "Nice valid zipcode you have there. Please try again..");
}
}
}); 
      p.add(new JLabel("Enter Zipcode:"));
      //add the text field to the JFrame
      p.add(tf);     
      //add the JButton to the JPanel
      p.add(jb);
      //create insets(Spacing) for current weather
      c.insets = new Insets(10,10,10,10);
      //create insets(Spacing) for tonight's, tomorrow's, and tomorrow night's weather
      gbc.insets = new Insets(0,0,0,0);
      c.gridx = 0;
      c.gridy = 2;
      //add all JLabels to the frame at specific locations
      p.add(jl1,c);
      c.gridx = 0;
      c.gridy = 3;
      p.add(jl2, c);
      gbc.gridx = 0;
      gbc.gridy = 4;
      p.add(jl6, gbc);
      gbc.gridx = 0;
      gbc.gridy = 5;
      p.add(jl7,gbc);
      gbc.gridx = 0;
      gbc.gridy = 6;
      p.add(jl8, gbc);
      gbc.gridx = 0;
      gbc.gridy = 7;
      p.add(jl9, gbc);
      gbc.gridx = 0;
      gbc.gridy = 0;
      forecast1.add(jl3, gbc);
      gbc.gridx = 0;
      gbc.gridy = 1;
      forecast1.add(jl10, gbc);
      gbc.gridx = 0;
      gbc.gridy = 2;
      forecast1.add(jl11, gbc);
      gbc.gridx = 0;
      gbc.gridy = 0;
      forecast2.add(jl4, gbc);
      gbc.gridx = 0;
      gbc.gridy = 1;
      forecast2.add(jl12, gbc);
      gbc.gridx = 0;
      gbc.gridy = 2;
      forecast2.add(jl13, gbc);
      gbc.gridx = 0;
      gbc.gridy = 0;
      forecast3.add(jl5, gbc);
      gbc.gridx = 0;
      gbc.gridy = 1;
      forecast3.add(jl14, gbc);
      gbc.gridx = 0;
      gbc.gridy = 2;
      forecast3.add(jl15, gbc); 
      //add the JPanels to the JFrame
      add(p,BorderLayout.NORTH);
      add(forecast1, BorderLayout.WEST);
      add(forecast2, BorderLayout.CENTER);
      add(forecast3, BorderLayout.EAST);
}   
}