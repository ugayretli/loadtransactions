package com.mediasol.loadtransactions.gpc.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mediasol.loadtransactions.entity.HlavickaVypisu;
import com.mediasol.loadtransactions.gpc.Process.GPCProcessor;
import com.mediasol.loadtransactions.output.OutputHlavickaATransakceToMongoDB;
import com.mediasol.loadtransactions.output.OutputHlavickaATransakceToStdout;

@Component
public class GPCFileIO {

	@Autowired
	GPCProcessor gpcProcessor;

	@Autowired
	OutputHlavickaATransakceToStdout gpcOutputHlavickaATransakce;	
	@Autowired	
	OutputHlavickaATransakceToMongoDB outputHlavickaATransakceToMongoDB;

	static final String GPC_EXTENSION = "gpc";

	public void readFileNames(String inputdir) {

		Stream<Path> filesStream = null;
		Path inputpath = Paths.get(inputdir);

		try {

			System.out.println("Reding Files under " + inputdir);
			filesStream = Files.list(inputpath);

			List<String> fileList = filesStream.filter(Files::isRegularFile).map(x -> x.toString())
					.collect(Collectors.toList());

			for (String fileName : fileList) {

				System.out.println("----------------------------------------------------------");
				System.out.println(fileName);
				String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1);

				if (fileExt.equals(GPC_EXTENSION)) {
					System.out.println("Choosing GPC Parser");
					readFile(fileName);
				}
			}
			filesStream.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (inputpath == null)
			System.out.println("Input directory does not exist " + inputdir);

	}

	public void readFile(String argfileName) {

		try (BufferedReader br = new BufferedReader(new FileReader(argfileName))) {

			String l;
			while ((l = br.readLine()) != null) {
				// System.out.println("line:" + l);
				if (gpcProcessor.parseGPCTransaction(l, HlavickaVypisu.getInstance()) == false) {
					System.out.println("Can not parse GPCTransaction!! Line content: " + l);
				}

			}
		} catch (NullPointerException e) {
			System.out.println("ERROR:Filename property does not exist: " + e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println("ERROR:Filename property does not exist: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("ERROR:Filename property does not exist: " + e.getMessage());
		} finally {
			gpcOutputHlavickaATransakce.PrintHlavickaATransakce(HlavickaVypisu.getInstance());
			outputHlavickaATransakceToMongoDB.writeHlavickaATransakce(HlavickaVypisu.getInstance());
			GPCProcessor.firstAccount = true;
			OutputHlavickaATransakceToStdout.countOfAccounts = 0;
		}
	}

	public void printTransaction(String transaction) {
		try {
			System.out.println(transaction);
		} catch (NullPointerException e) {
			System.out.println("ERROR:Filename property does not exist: " + e.getMessage());
		}
	}

}
