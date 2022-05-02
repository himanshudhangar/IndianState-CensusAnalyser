package com.BridgeCensusAnalyser;

import static org.junit.Assert.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import org.junit.Test;

public class StateCensusAnalyserTest {

	@Test
	public void test() {
		
		StateCensusCSV read = new StateCensusCSV();
			String fileName = "IndianStateCensusData";
	}
			 @Test
			    public void checkStateCensusCSVFile_Matches_NumberOfRecords() throws IOException, CensusAnalyserException  {
			        String filePathRead = "D:\\workplace\\IndianStatesCensusData.csv";

			        int count = read.readNoOfRecords(filePathRead);
				assertEquals(37, count);
			 }
			 
			 @Test
			    public void checkStateCensusCSVFile_Not_Matches_NumberOfRecords() throws IOException, CensusAnalyserException  {
			        String filePathRead = "D:\\workplace\\IndianStatesCensusData.csv";

			        int count = read.readNoOfRecords(filePathRead);
					assertEquals(37, count);
			 }
			 
			 @Test
			    public void checkStateCensusCSVFile_has_Delimiter_Correct_Or_Incorrect_ShouldThrowException() throws CensusAnalyserException {
			        String filePathRead = "D:\\workplace\\IndianStatesCensusData.csv";
			        String delimiter = ".";
			        try {
			            if(delimiter.equals(",")) 
			                assertTrue(read.readDelimiter(filePathRead, delimiter));
			            else
			                assertFalse(read.readDelimiter(filePathRead, delimiter));
			        } catch (IOException e) {
			            e.printStackTrace();
			        }
			 }
			 
			        @Test
			        public void checkStateCensusCSVFile_has_Header_Correct_Or_Incorrect_ShouldThrowException() {
			            List<String> listName = new ArrayList();
			            String filePathRead = "D:\\workplace\\IndianStatesCensus.csv";
			               listName.add("S.No");
					       listName.add("State");
					       listName.add("Population");
					       listName.add("Increase");
					       listName.add("Area(Km2)");
					       listName.add("Density");
					       listName.add("Sex-Ratio");
					       listName.add("Literacy");
			            try {
			                boolean flag = read.readHeader(filePathRead, listName);
			                if(flag)
			                    assertTrue(flag);
			                else
			                    assertFalse(flag);
			            } catch (IOException | CustomException e) {
			                e.printStackTrace();
			            }
			        }		
	}


