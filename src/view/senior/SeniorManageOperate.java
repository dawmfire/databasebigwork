/*
 * Created by JFormDesigner on Sun May 21 04:21:46 CST 2023
 */

package view.senior;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


/**
 * @author unknown
 */
public class SeniorManageOperate extends JFrame {
    public SeniorManageOperate() {
        initComponents();
    }

    private void panel4AncestorAdded(AncestorEvent e) {
        PartInformationManager part=new PartInformationManager();
        panel4.add(part.getPanel1());
    }
    

    private void panel1AncestorAdded(AncestorEvent e) {
        // TODO add your code here
        AdministratorManager ad = new AdministratorManager();
        panel1.add(ad.getPanel1());
    }

    private void panel2AncestorAdded(AncestorEvent e) {
        WarehouseInformationManager ware = new WarehouseInformationManager();
        panel2.add(ware.getPanel1());
        // TODO add your code here
    }

    private void panel3AncestorAdded(AncestorEvent e) {
        // TODO add your code here
        InOutBoundRecords record = new InOutBoundRecords();
        panel3.add(record.getPanel1());
    }

    private void panel5AncestorAdded(AncestorEvent e) {
        // TODO add your code here
        PersonalInformationManager personal = new PersonalInformationManager();
        panel5.add(personal.getPanel1());
    }

    private void tabbedPane1AncestorAdded(AncestorEvent e) {
        // TODO add your code here
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();

        //======== this ========
        setMinimumSize(new Dimension(800, 800));
        setVisible(true);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== tabbedPane1 ========
        {
            tabbedPane1.setMinimumSize(new Dimension(800, 800));
            tabbedPane1.addAncestorListener(new AncestorListener() {
                @Override
                public void ancestorAdded(AncestorEvent e) {
                    tabbedPane1AncestorAdded(e);
                }
                @Override
                public void ancestorMoved(AncestorEvent e) {}
                @Override
                public void ancestorRemoved(AncestorEvent e) {}
            });

            //======== panel1 ========
            {
                panel1.addAncestorListener(new AncestorListener() {
                    @Override
                    public void ancestorAdded(AncestorEvent e) {
                        panel1AncestorAdded(e);
                    }
                    @Override
                    public void ancestorMoved(AncestorEvent e) {}
                    @Override
                    public void ancestorRemoved(AncestorEvent e) {}
                });
                panel1.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel1.getComponentCount(); i++) {
                        Rectangle bounds = panel1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel1.setMinimumSize(preferredSize);
                    panel1.setPreferredSize(preferredSize);
                }
            }
            tabbedPane1.addTab("\u7ba1\u7406\u5458\u4fe1\u606f", panel1);

            //======== panel2 ========
            {
                panel2.addAncestorListener(new AncestorListener() {
                    @Override
                    public void ancestorAdded(AncestorEvent e) {
                        panel2AncestorAdded(e);
                    }
                    @Override
                    public void ancestorMoved(AncestorEvent e) {}
                    @Override
                    public void ancestorRemoved(AncestorEvent e) {}
                });
                panel2.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel2.getComponentCount(); i++) {
                        Rectangle bounds = panel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel2.setMinimumSize(preferredSize);
                    panel2.setPreferredSize(preferredSize);
                }
            }
            tabbedPane1.addTab("\u5e93\u623f\u4fe1\u606f", panel2);

            //======== panel3 ========
            {
                panel3.addAncestorListener(new AncestorListener() {
                    @Override
                    public void ancestorAdded(AncestorEvent e) {
                        panel3AncestorAdded(e);
                    }
                    @Override
                    public void ancestorMoved(AncestorEvent e) {}
                    @Override
                    public void ancestorRemoved(AncestorEvent e) {}
                });
                panel3.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel3.getComponentCount(); i++) {
                        Rectangle bounds = panel3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel3.setMinimumSize(preferredSize);
                    panel3.setPreferredSize(preferredSize);
                }
            }
            tabbedPane1.addTab("\u51fa\u5165\u5e93\u8bb0\u5f55", panel3);

            //======== panel4 ========
            {
                panel4.addAncestorListener(new AncestorListener() {
                    @Override
                    public void ancestorAdded(AncestorEvent e) {
                        panel4AncestorAdded(e);
                    }
                    @Override
                    public void ancestorMoved(AncestorEvent e) {}
                    @Override
                    public void ancestorRemoved(AncestorEvent e) {}
                });
                panel4.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel4.getComponentCount(); i++) {
                        Rectangle bounds = panel4.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel4.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel4.setMinimumSize(preferredSize);
                    panel4.setPreferredSize(preferredSize);
                }
            }
            tabbedPane1.addTab("\u96f6\u4ef6\u4fe1\u606f", panel4);

            //======== panel5 ========
            {
                panel5.addAncestorListener(new AncestorListener() {
                    @Override
                    public void ancestorAdded(AncestorEvent e) {
                        panel5AncestorAdded(e);
                    }
                    @Override
                    public void ancestorMoved(AncestorEvent e) {}
                    @Override
                    public void ancestorRemoved(AncestorEvent e) {}
                });
                panel5.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel5.getComponentCount(); i++) {
                        Rectangle bounds = panel5.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel5.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel5.setMinimumSize(preferredSize);
                    panel5.setPreferredSize(preferredSize);
                }
            }
            tabbedPane1.addTab("\u4e2a\u4eba\u4fe1\u606f", panel5);

            tabbedPane1.setSelectedIndex(0);
        }
        contentPane.add(tabbedPane1);
        tabbedPane1.setBounds(0, 0, 925, 690);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
