import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WhetherAppGUI extends JFrame {
    public WhetherAppGUI() {

        super("Previsão do Tempo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 650);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        addGuiComponets();
    }

    private void addGuiComponets(){
        JTextField searchTextField = new JTextField();
        searchTextField.setBounds(15,15,351,45);
        searchTextField.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(searchTextField);

        JButton searchButton = new JButton(loadImage("src/assests/search.png"));

        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375,13,47,45);
        add(searchButton);

        JLabel wheatherConditionImage = new JLabel(loadImage("src/assests/cloudy.png"));
        wheatherConditionImage.setBounds(0,125,450,217);
        add(wheatherConditionImage);

        JLabel temperatureText = new JLabel("10 C");
        temperatureText.setBounds(0,350,450,48);
        temperatureText.setFont(new Font("Dialog", Font.BOLD, 48));

        temperatureText.setHorizontalAlignment(SwingConstants.CENTER);
        add(temperatureText);

        JLabel weatherConditionDescription = new JLabel("Cloudy");
        weatherConditionDescription.setBounds(0,450,450,36);
        weatherConditionDescription.setFont(new Font("Dialog", Font.PLAIN,32));
        weatherConditionDescription.setHorizontalAlignment(SwingConstants.CENTER);
        add(weatherConditionDescription);

        JLabel humidityImage = new JLabel(loadImage("src/assests/humidity.png"));
        humidityImage.setBounds(15,500,74,66);
        add(humidityImage);

        JLabel humidityText = new JLabel("<html><b>Humidity</b> 100%</html>");
        humidityText.setBounds(90,500,85,55);
        humidityText.setFont(new Font("Dialog", Font.PLAIN,16));
        add(humidityText);

        JLabel windSpeedImage = new JLabel(loadImage("src/assests/windspeed.png"));
        windSpeedImage.setBounds(220,500,74,66);
        add(windSpeedImage);

        JLabel windSpeedText = new JLabel("<html><b>WindSpeed</b> 15km/h</html>");
        windSpeedText.setBounds(310,500,85,55);
        windSpeedText.setFont(new Font("Dialog", Font.PLAIN,16));
        add(windSpeedText);
    }
    private ImageIcon loadImage(String resourcePath){
        try{
            BufferedImage image = ImageIO.read(new File(resourcePath));
            return new ImageIcon(image);
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Arquivo não encontrado");
        return null;
    }

}

// https://www.youtube.com/watch?v=8ZcEYv2ezWc parei em 11 minutos
// https://www.youtube.com/watch?v=8ZcEYv2ezWc parei em 14 minutos (1/12/23)
// https://www.youtube.com/watch?v=8ZcEYv2ezWc parei em 21 minutos (2/12/23)