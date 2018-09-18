package com.houarizegai.javafxmaterialdesign.java.controllers;

import com.jfoenix.controls.JFXDialog;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML // Root Element
    StackPane root;
    // Nodes
    private StackPane slideShowPane;
    private VBox chackBoxpane;

    // Using to show nodes
    public static JFXDialog slideShowDialog;
    public static JFXDialog  chackBoxDialog;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            slideShowPane = FXMLLoader.load(getClass().getResource("/com/houarizegai/javafxmaterialdesign/resources/views/SlideShow.fxml"));
            chackBoxpane = FXMLLoader.load(getClass().getResource("/com/houarizegai/javafxmaterialdesign/resources/views/chechBoxview.fxml"));


        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        slideShowDialog = new JFXDialog(root, slideShowPane, JFXDialog.DialogTransition.CENTER);
        chackBoxDialog = new JFXDialog(root, chackBoxpane, JFXDialog.DialogTransition.CENTER);

    }

    @FXML
    private void onSlideShow() {
        slideShowDialog.show();
    }

    public void onrecyclerView(MouseEvent mouseEvent) {
        chackBoxDialog.show();
    }
}
