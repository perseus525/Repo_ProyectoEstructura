/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.BubbleDataModel;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tonio
 */
public class DAOModelTest {
    
    public DAOModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of loadData method, of class DAOModel.
     */
    @Test
    public void testLoadData() throws Exception {
        System.out.println("loadData");
        String archivo = "dataPreliminar.csv";
        DAOModel instance = new DAOModel();
        ArrayList<BubbleDataModel> result = instance.loadData(archivo);
        for(int i = 0; i<result.size();i++){
            System.out.println(result.get(i).getFecha() + " " + result.get(i).getMp() + " " + result.get(i).getHospitalizados());
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
