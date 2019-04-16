import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Katrina Balestino
 * Amber Kirk
 */
public class MovieViewer extends JFrame implements ActionListener{
    private JComboBox movieComboBox;
    private JComboBox genreComboBox;
    private final HashMap movieSubItems;
    private JLabel titleLabel;
    private JButton m1Button;
    private JButton m2Button;
    private JButton m3Button;
    private JButton randomButton;
    private JPanel selectorPanel;
    private JPanel buttonPanel;
    private final MovieCntl movieCntl;
    private String tempMovie;
    private int tempIndex;

    public MovieViewer(MovieCntl movieCntl, int startIndex){
        this.movieSubItems = new HashMap();
        this.movieCntl = movieCntl;
        display();
    }
    
    private void display() {
        setTitle("Genie Movie Selector");
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new JPanel(new GridLayout(2, 0)));       
        
        //Set ComboBox
        selectorPanel = new JPanel(new GridLayout(3, 0, 0, 20));
        selectorPanel.setForeground(Color.YELLOW);
        titleLabel = new JLabel("GENIE MOVIE SELECTOR");
        titleLabel.setForeground(Color.YELLOW);
        titleLabel.setFont(new Font("Monaco", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setVerticalAlignment(SwingConstants.CENTER);
        selectorPanel.add(titleLabel);
        selectorPanel.setBackground(Color.BLUE);
        getComboBox();

        //Set buttons
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        m1Button = new JButton("Add Movie Wish #1");
        m1Button.addActionListener(this);
        buttonPanel.add(m1Button);
        m2Button = new JButton("Add Movie Wish #2");
        m2Button.addActionListener(this);
        buttonPanel.add(m2Button);
        m3Button = new JButton("Add Movie Wish #3");
        m3Button.addActionListener(this);
        buttonPanel.add(m3Button);
        randomButton = new JButton("Find Random Movie");
        randomButton.addActionListener(this);
        buttonPanel.add(randomButton);
        buttonPanel.setBackground(Color.BLUE);
        
        getContentPane().add(selectorPanel);
        getContentPane().add(buttonPanel);
    }

    private void getComboBox()
    {
        //Put all genres on array
        String[] genreArray = new String[6];
        for(int i = 0; i < genreArray.length; i++) {
            genreArray[i] = movieCntl.getGenre(i);
        }
        genreComboBox = new JComboBox(genreArray);
        genreComboBox.addActionListener(this);
        genreComboBox.setBackground(Color.BLUE);
        genreComboBox.setForeground(Color.yellow);
        selectorPanel.add(genreComboBox);
        
        //Puts all fantasy movies on array
        String[] movieArrayFantasy = new String[5];
        for(int i = 0; i < movieArrayFantasy.length; i++) {
            movieArrayFantasy[i] = movieCntl.getMovie(i).toString();
        }
        movieSubItems.put(genreArray[1], movieArrayFantasy);
        
        //Puts all animated movies on array
        String[] movieArrayAnimated = new String[5];
        for(int i = 0; i < movieArrayAnimated.length; i++) {
            movieArrayAnimated[i] = movieCntl.getMovie(i + 5).toString();
        }
        movieSubItems.put(genreArray[2], movieArrayAnimated); 
        
        //Puts all musical movies on array
        String[] movieArrayMusicals = new String[5];
        for(int i = 0; i < movieArrayMusicals.length; i++) {
            movieArrayMusicals[i] = movieCntl.getMovie(i + 10).toString();
        }
        movieSubItems.put(genreArray[3], movieArrayMusicals); 
        
        //Puts all romance movies on array
        String[] movieArrayRomance = new String[5];
        for(int i = 0; i < movieArrayAnimated.length; i++) {
            movieArrayRomance[i] = movieCntl.getMovie(i + 15).toString();
        }
        movieSubItems.put(genreArray[4], movieArrayRomance); 
        
        //Puts all comedy movies on array
        String[] movieArrayComedy = new String[5];
        for(int i = 0; i < movieArrayComedy.length; i++) {
            movieArrayComedy[i] = movieCntl.getMovie(i + 20).toString();
        }
        movieSubItems.put(genreArray[5], movieArrayComedy); 
        movieComboBox = new JComboBox();
        movieComboBox.setBackground(Color.BLUE);
        movieComboBox.setForeground(Color.yellow);
        selectorPanel.add(movieComboBox);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Graphics g = getGraphics();
        String item = (String) genreComboBox.getSelectedItem();
        Object o = movieSubItems.get(item);
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Monaco", Font.BOLD, 14));
        if(e.getSource() == m1Button)
        {
            g.setColor(Color.blue);          
            g.fillRect(0, 365, 1000, 20);
            getMovieAfterClick();
            g.setColor(Color.yellow);
            g.drawString("#1: " + tempMovie, 40, 380);
        }
        else if (e.getSource() == m2Button)
        {
            g.setColor(Color.blue);          
            g.fillRect(0, 385, 1000, 20);
            getMovieAfterClick();
            g.setColor(Color.yellow);
            getMovieAfterClick();
            g.drawString("#2: " + tempMovie, 40, 400);
        }
        else if (e.getSource() == m3Button)
        {
            g.setColor(Color.blue);          
            g.fillRect(0, 405, 1000, 20);
            getMovieAfterClick();
            g.setColor(Color.yellow);
            getMovieAfterClick();
            g.drawString("#3: " + tempMovie, 40, 420);
        }
        else if (e.getSource() == randomButton)
        {
            createRandomMovie();
        } 
        else if (o == null) {
            movieComboBox.setModel(new DefaultComboBoxModel());
            tempIndex = movieComboBox.getSelectedIndex();
        }
        else {
            movieComboBox.setModel(new DefaultComboBoxModel((String[]) o));
        }
    } 
    public void getMovieAfterClick() {
        tempMovie = (String) movieComboBox.getSelectedItem().toString();        
    }
    public void createRandomMovie() {
        Graphics g = getGraphics();
        int rand = (int)(Math.random()*25);
        g.setColor(Color.YELLOW);
        g.fillRect(0, 425, 1000, 50);
        g.setColor(Color.BLUE);
        g.setFont(new Font("Monaco", Font.BOLD, 14));
        g.drawString("Random Movie: ", 40, 445);
        g.drawString(movieCntl.getMovie(rand).toString(), 40, 465);
    }
}