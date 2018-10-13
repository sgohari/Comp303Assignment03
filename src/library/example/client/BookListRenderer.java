package library.example.client;

import javax.swing.*;
import java.awt.*;
import javax.json.JsonObject;

public class BookListRenderer extends JLabel implements ListCellRenderer<Object> {
	private static final long serialVersionUID = 1L;

	@Override
     public Component getListCellRendererComponent(
       JList<?> list,           
       Object value,            
       int index,               
       boolean isSelected,      
       boolean cellHasFocus)  {
         JsonObject jsono = (JsonObject) value;
         this.setText(jsono.getString("title"));
         
         if (isSelected) {
             setBackground(list.getSelectionBackground());
             setForeground(list.getSelectionForeground());
         } else {
             setBackground(list.getBackground());
             setForeground(list.getForeground());
         }
         setEnabled(list.isEnabled());
         setFont(list.getFont());
         setOpaque(true);
         return this;
     }
 }