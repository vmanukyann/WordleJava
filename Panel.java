import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

class Panel extends JPanel {

    public List<List<JPanel>>boxes= new ArrayList<>();

    public Panel(){
        
        setLayout(null);
        setBackground(Color.WHITE);
        int boxWidth = 50;
        int boxBuffer = 50;
        int topbuffer = 50;

        for (int row = 0; row<5; row++){

            List<JPanel> boxRow = new ArrayList<>();    

            for (int col = 0; col < 5; col++){
                
                int xaxis = col*(boxWidth+ boxBuffer) + topbuffer;
                int yaxis = row*(boxBuffer + boxWidth) + topbuffer;

                JPanel background = new JPanel();
                background.setBackground(Color.LIGHT_GRAY);
                background.setBounds(xaxis, yaxis, boxWidth, boxWidth);
                add(background);

                JPanel box = new JPanel();
                box.setBackground(Color.WHITE);
                box.setBounds(xaxis+2, yaxis+2, boxWidth-4, boxWidth-4);
                add(box);

                boxRow.add(box);
            }
            boxes.add(boxRow);
        }
    }
}