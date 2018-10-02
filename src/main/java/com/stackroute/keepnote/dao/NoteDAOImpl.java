package com.stackroute.keepnote.dao;

import com.stackroute.keepnote.model.Note;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/*
 * This class is implementing the NoteDAO interface. This class has to be annotated with @Repository
 * annotation.
 * @Repository - is an annotation that marks the specific class as a Data Access Object, thus 
 * 				 clarifying it's role.
 * @Transactional - The transactional annotation itself defines the scope of a single database 
 * 					transaction. The database transaction happens inside the scope of a persistence 
 * 					context.  
 * */
@Repository("NoteDAO")
@Transactional
public class NoteDAOImpl implements NoteDAO {

	/*
	 * Autowiring should be implemented for the SessionFactory.
	 */
	@Autowired
    private SessionFactory sessionFactory;
    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

//    @SuppressWarnings("unchecked")


//    public void persist(T entity) {
//        getSession().persist(entity);
//    }
//
//    public void delete(T entity) {
//        getSession().delete(entity);
//    }
//
//    protected Criteria createEntityCriteria(){
//        return getSession().createCriteria(persistentClass);
//    }
	
	public NoteDAOImpl(SessionFactory sessionFactory) {

	}

	/*
	 * Save the note in the database(note) table.
	 */
        private NoteDAO dao;
	public boolean saveNote(Note note) {
        try {
            getSession().persist(note);
            getSession().getTransaction().commit();
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

	/*
	 * Remove the note from the database(note) table.
	 */

	public boolean deleteNote(int noteId) {
		try {
            getSession().delete(noteId);
        return true;
		}
		catch (Exception e){
		    return false;
        }

	}

	/*
	 * retrieve all existing notes sorted by created Date in descending
	 * order(showing latest note first)
	 */
	public List<Note> getAllNotes() {
//        List<Note> notes = getSession().createSQLQuery("select contents").list();
        Criteria criteria = getSession().createCriteria(Note.class).addOrder(Order.desc());
        return (List<Note>) criteria.list();
	}

	/*
	 * retrieve specific note from the database(note) table
	 */
	public Note getNoteById(int noteId) {

	}

	/* Update existing note */

	public boolean UpdateNote(Note note) {
		return false;

	}

}
