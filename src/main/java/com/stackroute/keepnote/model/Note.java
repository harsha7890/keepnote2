package com.stackroute.keepnote.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/*
 * The class "Note" will be acting as the data model for the note Table in the database. Please
 * note that this class is annotated with @Entity annotation. Hibernate will scan all package for 
 * any Java objects annotated with the @Entity annotation. If it finds any, then it will begin the 
 * process of looking through that particular Java object to recreate it as a table in your database.
 */
@Entity
@Table
public class Note {

    @Id
    @Column(name="id",nullable = false)
    private int id;
    @Column(name="title",nullable = false)
    private String title;
    @Column(name="content",nullable = false)
    private String content;
    @Column(name="status",nullable = false)
    private String status;
    @Column(name="date",nullable = false)
    private LocalDateTime date;
	public Note() {

	}

	public Note(int i, String string, String string2, String string3, LocalDateTime localDate) {
//	    this.id=i;
//	    this.title=string;
//	    this.content=string2;
//	    this.status=string3;
//	    this.date=localDate;
        this.setNoteId(i);
        this.setNoteTitle(string);
        this.setNoteContent(string2);
        this.setNoteStatus(string3);
        this.setCreatedAt(localDate);
	}

	public int getNoteId() {

		return id;
	}

	public String getNoteTitle() {

		return title;
	}

	public String getNoteContent() {

		return content;
	}

	public String getNoteStatus() {

		return status;
	}

	public void setNoteId(int parseInt) {
        this.id=parseInt;
	}

	public void setNoteTitle(String parameter) {
        this.title = parameter;
	}

	public void setNoteContent(String parameter) {
        this.content=parameter;
	}

	public void setNoteStatus(String parameter) {
        this.status=parameter;
	}

	public void setCreatedAt(LocalDateTime now) {
        this.date = now;
	}

}
