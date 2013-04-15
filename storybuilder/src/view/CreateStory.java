/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.uoy.sb.Global;
import controller.UserController;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import model.User;

/**
 *
 * @author Y0199223
 */
public class CreateStory extends javax.swing.JPanel {

    private UserController uc = null;

    /**
     * Creates new form CreateStory1
     */
    public CreateStory() {
        initComponents();
        getChildUser();
    }

    // method to display list of children on story creation page
    private void getChildUser() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pagePanel = new javax.swing.JPanel();
        deletePage = new javax.swing.JButton();
        newPage = new javax.swing.JButton();
        editPage = new javax.swing.JButton();
        pageListScrollPane = new javax.swing.JScrollPane();
        pageList = new javax.swing.JList();
        pagesLabel = new javax.swing.JLabel();
        colorPanel = new javax.swing.JPanel();
        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        assignstoryPanel = new javax.swing.JPanel();
        storyAssignedTo = new javax.swing.JLabel();
        AssignStory = new javax.swing.JLabel();
        childListScroll = new javax.swing.JScrollPane();
        childListModel = new javax.swing.JList();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        buttonPanel = new javax.swing.JPanel();
        saveStory = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        feedback = new javax.swing.JCheckBox();
        storyNamePanel = new javax.swing.JPanel();
        storyName = new javax.swing.JTextField();
        storyTitleLabel = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(650, 650));

        deletePage.setText("Delete Page");

        newPage.setText("New Page");
        newPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPageActionPerformed(evt);
            }
        });

        editPage.setText("Edit Page");
        editPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPageActionPerformed(evt);
            }
        });

        pageList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "page 1", "page 2", "page 3", "page 4", "page 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        pageListScrollPane.setViewportView(pageList);

        pagesLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pagesLabel.setText("Pages:");

        javax.swing.GroupLayout pagePanelLayout = new javax.swing.GroupLayout(pagePanel);
        pagePanel.setLayout(pagePanelLayout);
        pagePanelLayout.setHorizontalGroup(
            pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pagesLabel)
                .addGap(43, 43, 43)
                .addComponent(pageListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(newPage)
                        .addComponent(deletePage, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(editPage))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pagePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deletePage, editPage, newPage});

        pagePanelLayout.setVerticalGroup(
            pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addComponent(newPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deletePage))
                    .addComponent(pagesLabel)
                    .addComponent(pageListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Choose Font:");

        jLabel2.setText("Choose Font Size:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(colorPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        storyAssignedTo.setText("This story is assigned to ");

        AssignStory.setText("Assign this story to: ");

        childListModel.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        childListScroll.setViewportView(childListModel);

        deleteButton.setText("Remove");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout assignstoryPanelLayout = new javax.swing.GroupLayout(assignstoryPanel);
        assignstoryPanel.setLayout(assignstoryPanelLayout);
        assignstoryPanelLayout.setHorizontalGroup(
            assignstoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignstoryPanelLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(assignstoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AssignStory))
                .addGap(28, 28, 28)
                .addGroup(assignstoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignstoryPanelLayout.createSequentialGroup()
                        .addComponent(childListScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(storyAssignedTo))
                .addContainerGap())
        );

        assignstoryPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {childListScroll, jScrollPane1});

        assignstoryPanelLayout.setVerticalGroup(
            assignstoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignstoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(assignstoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignstoryPanelLayout.createSequentialGroup()
                        .addComponent(AssignStory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(assignstoryPanelLayout.createSequentialGroup()
                        .addComponent(storyAssignedTo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(assignstoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(childListScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton))))
                .addGap(61, 61, 61))
        );

        assignstoryPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {childListScroll, jScrollPane1});

        saveStory.setText("Save Story");

        cancel.setText("Cancel");

        feedback.setText("Ask for feedback?");

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(feedback, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveStory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel)
                .addContainerGap())
        );

        buttonPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancel, saveStory});

        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveStory)
                        .addComponent(cancel))
                    .addComponent(feedback, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        storyName.setText("Story Name");

        storyTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        storyTitleLabel.setText("Story Title:");

        javax.swing.GroupLayout storyNamePanelLayout = new javax.swing.GroupLayout(storyNamePanel);
        storyNamePanel.setLayout(storyNamePanelLayout);
        storyNamePanelLayout.setHorizontalGroup(
            storyNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storyNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(storyTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(storyName, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        storyNamePanelLayout.setVerticalGroup(
            storyNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storyNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(storyNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storyName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storyTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(colorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(storyNamePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(assignstoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {assignstoryPanel, buttonPanel, colorPanel, pagePanel, storyNamePanel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(storyNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignstoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void newPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPageActionPerformed

    private void editPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPageActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        Global.container.setDisplay(new AdultHome());
    }//GEN-LAST:event_btnHomeActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AssignStory;
    private javax.swing.JPanel assignstoryPanel;
    private javax.swing.JButton btnHome;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancel;
    private javax.swing.JList childListModel;
    private javax.swing.JScrollPane childListScroll;
    private javax.swing.JPanel colorPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deletePage;
    private javax.swing.JButton editPage;
    private javax.swing.JCheckBox feedback;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newPage;
    private javax.swing.JList pageList;
    private javax.swing.JScrollPane pageListScrollPane;
    private javax.swing.JPanel pagePanel;
    private javax.swing.JLabel pagesLabel;
    private javax.swing.JButton saveStory;
    private javax.swing.JLabel storyAssignedTo;
    private javax.swing.JTextField storyName;
    private javax.swing.JPanel storyNamePanel;
    private javax.swing.JLabel storyTitleLabel;
    // End of variables declaration//GEN-END:variables
}
