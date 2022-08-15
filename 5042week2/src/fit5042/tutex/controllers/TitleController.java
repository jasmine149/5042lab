/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.tutex.controllers;

import javax.inject.Named;

import fit5042.tutex.entities.Property;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.context.FacesContext;

/**
 *
 * @author Guan
 */
@FacesConfig
@Named("titleController")
@RequestScoped
public class TitleController {

    private String pageTitle;

    public TitleController() {
        // Set the page title 
        pageTitle = "Real Estate Agency";
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }
    
    @PostConstruct
    public void init() {
    	pageTitle = "Real Estate Agency";
    }
}
