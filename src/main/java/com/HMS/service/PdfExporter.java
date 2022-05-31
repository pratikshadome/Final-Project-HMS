package com.HMS.service;




import java.awt.Color;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.HMS.entity.PatientSummary;
import com.lowagie.text.*;
import com.lowagie.text.DocumentException;

import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfCell;
import com.lowagie.text.pdf.PdfWriter;

public class PdfExporter {
private List<PatientSummary> listsummary;


public PdfExporter(List<PatientSummary> listsummary) {
	this.listsummary=listsummary;
}
public void writeTableHeader(PdfPTable table) {
	
	PdfPCell cell=new PdfPCell();
	cell.setBackgroundColor(Color.LIGHT_GRAY);
	cell.setPadding(5);
	
	Font font=FontFactory.getFont(FontFactory.HELVETICA);
	font.setColor(Color.WHITE);
	cell.setPhrase(new Phrase("Patient Id"));
	table.addCell(cell);
	
	cell.setPhrase(new Phrase("Patient Name"));
	table.addCell(cell);
	
	cell.setPhrase(new Phrase("Doctor Name"));
	table.addCell(cell);
	
	cell.setPhrase(new Phrase("Disease Detected "));
	table.addCell(cell);
	cell.setPhrase(new Phrase("Description"));
	table.addCell(cell);
	
	cell.setPhrase(new Phrase("Visit Again On Date"));
	table.addCell(cell);
	
}
public void writeTableData(PdfPTable table) {
	for(PatientSummary summary:listsummary) {
		table.addCell(String.valueOf(summary.getSummary_id()));
		table.addCell(String.valueOf(summary.getPatient_Name()));
		table.addCell(String.valueOf(summary.getDoctor_Name()));
		table.addCell(String.valueOf(summary.getDisease_detected()));
		table.addCell(String.valueOf(summary.getDescription()));
		table.addCell(String.valueOf(summary.getVisit_again_on()));
		
	}
}

public void export(HttpServletResponse response) throws DocumentException, IOException   {
	Document document=new Document(PageSize.A4);
	PdfWriter.getInstance(document, response.getOutputStream());
	document.open();
	
	Font font=FontFactory.getFont(FontFactory.HELVETICA_BOLD);
	font.setColor(Color.GREEN);
	font.setSize(20);
	Paragraph title=new Paragraph("Patient Prescription",font);
	title.setAlignment(Paragraph.ALIGN_CENTER);
	document.add(title);
	//document.add(new Paragraph("List of all Students"));
	PdfPTable table=new PdfPTable(7);
	//table.setWidthPercentage(100);
	table.setSpacingBefore(20);
	//table.setHeaderRows(6);
	//table.setWidths(new float[] {1.5f,3.5f,3.0f,3.0f,1.5f,3.0f,3.0f});
	writeTableHeader(table);
	writeTableData(table);

	document.add(table);
	document.close();
}
}