package com.modelo.relatorios.service;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.List;

import com.modelo.relatorios.model.Cliente;

public class ClientesRelatorios {
	
	public ClientesRelatorios() {
	}
	
	public void imprimirRelatorio(String endArquivo, List<Cliente> clientes) throws Exception {
		
		JasperReport report = JasperCompileManager.compileReport(endArquivo + "/src/main/java/com/modelo/relatorios/jasper/Clientes.jrxml");
		
		JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(clientes));
		
		JasperExportManager.exportReportToPdfFile(print, endArquivo + "/src/main/resources/static/relatorios/Clientes.pdf");
	}

}













