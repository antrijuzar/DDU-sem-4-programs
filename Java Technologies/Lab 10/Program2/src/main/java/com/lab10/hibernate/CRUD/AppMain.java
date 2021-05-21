package com.lab10.hibernate.CRUD;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class AppMain {
	public final static Logger LOGGER = Logger.getLogger(AppMain.class);
	
	public static void main(String a[]) {
		LOGGER.info(".......Hibernate Crud Operations Example.......\n");
		 
        LOGGER.info("\n=======CREATE RECORDS=======\n");
        DbOperations.createRecord();
        
        LOGGER.info("\n=======READ RECORDS=======\n");
        List viewStudents = DbOperations.displayRecords();
        if (viewStudents != null && viewStudents.size() > 0) {
			for(Object studObj : viewStudents) {
				LOGGER.info(studObj.toString());
			}
		}
        
        LOGGER.info("\n=======UPDATE RECORDS=======\n");
        int updateId = 1;
        DbOperations.updateRecord(updateId);
        LOGGER.info("\n=======READ RECORDS AFTER UPDATION=======\n");
        List updateStudent = DbOperations.displayRecords();
        if (updateStudent != null && updateStudent.size() > 0) {
			for(Object studObj : updateStudent) {
				LOGGER.info(studObj.toString());
			}
		}
        
        LOGGER.info("\n=======DELETE RECORD=======\n");
        int deleteId = 5;
        DbOperations.deleteRecord(deleteId);
        LOGGER.info("\n=======READ RECORDS AFTER DELETION=======\n");
        List deleteStudentRecord = DbOperations.displayRecords();
        if (deleteStudentRecord != null && deleteStudentRecord.size() > 0) {
			for(Object studObj : deleteStudentRecord) {
				LOGGER.info(studObj.toString());
			}
		}
        
        LOGGER.info("\n=======DELETE ALL RECORDS=======\n");
        DbOperations.deleteAllRecords();
        LOGGER.info("\n=======READ RECORDS AFTER ALL RECORDS DELETION=======");
        List deleteAll = DbOperations.displayRecords();
        if(deleteAll.size() == 0) {
        	LOGGER.info("\nNo Records Are Present In The Database Table!\n");
        }       
        System.exit(0);
	}
}
