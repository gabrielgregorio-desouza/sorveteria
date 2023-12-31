package com.uefs.sigsorveterias;

import com.uefs.sigsorveterias.dao.DAO;
import com.uefs.sigsorveterias.model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication  {
   

    public static void main(String[] args) throws Exception{
       
        DAO.getClienteDAO().create(new Cliente("A", "123"));
        DAO.getClienteDAO().create(new Cliente("B", "456"));
        Cliente cliente = DAO.getClienteDAO().create(new Cliente("C", "789"));
        DAO.getClienteDAO().create(new Cliente("D", "741"));

        logger.info(DAO.getClienteDAO().findMany());

        logger.info(cliente);
        cliente.setNome("Rafael Tosta");
        DAO.getClienteDAO().update(cliente);

       logger.info(DAO.getClienteDAO().findMany());

        logger.info(DAO.getClienteDAO().findById(4));
       logger.info(DAO.getClienteDAO().findById(1));

        DAO.getClienteDAO().delete(new Cliente("D", "741"));

       logger.info(DAO.getClienteDAO().findMany());

        logger.info(DAO.getClienteDAO().findById(1));
    }
}
