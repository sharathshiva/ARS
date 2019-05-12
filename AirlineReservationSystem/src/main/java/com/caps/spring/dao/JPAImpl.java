package com.caps.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.caps.spring.beans.BookDTO;
import com.caps.spring.beans.FlightDTO;
import com.caps.spring.beans.UserDTO;


@Repository
public class JPAImpl  implements UserDAO,FlightDAO,BookDAO{
	
	@PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public UserDTO login(UserDTO userdto) {
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		String hql="from User us where us.username=:name and us.password=:pass";
		Query query=entityManager.createQuery(hql);

		query.setParameter("name",userdto.getUsername() );
		query.setParameter("pass", userdto.getPassword());


		List  allUsers=null;
		UserDTO dto=null;
		try {
			allUsers = query.getResultList();
			for (Object object : allUsers) {
				dto=(UserDTO)object;
				return dto;
			}

		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
		return dto;

	}

	@Override
	public boolean createUser(UserDTO userdto) {
		boolean state = false;
		try {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(userdto);
			em.getTransaction().commit();
			state = true;
		}catch(Exception e) {
			e.printStackTrace();
			state = false;
		}
		return state;
	}

	@Override
	public boolean deleteUser(String email) {
		boolean status=false;
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
			String hql="Delete from User  where email=?";
			Query query=entityManager.createQuery(hql);
			
			query.setParameter(1,email);
			List  allUsers=null;
			try {
				allUsers = query.getResultList();
					status=true;
				
			}
			catch (Exception e) {
				e.printStackTrace();
				transaction.rollback();
			}
			finally {

				entityManager.close();
			}
		
			return status;

	}

	@Override
	public boolean updateUser(UserDTO userdto) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
		
		
			UserDTO userdto1=em.find(UserDTO.class,userdto.getEmail() );
			if(userdto1.getEmail().equals(userdto.getEmail()))  {
				userdto1.setUsername(userdto.getUsername());
				userdto1.setPassword(userdto.getPassword());
				userdto1.setMobileNo(userdto.getMobileNo());
				userdto1.setEmail(userdto.getEmail());
				userdto1.setAddress(userdto.getAddress());
				userdto1.setAddress2(userdto.getAddress2());
				userdto1.setCity(userdto.getCity());
				userdto1.setState(userdto.getState());
				userdto1.setZipcode(userdto.getZipcode());
				em.getTransaction().commit();
				return true;
			}else
			{
				return false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}

		em.close();

		return false;

	}

	@Override
	public List<UserDTO> listOfUsers() {
		List<UserDTO> userList=null;
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		String hql="SELECT user FROM UserDTO user";
		Query query=entityManager.createQuery(hql);

		try {
			userList = query.getResultList();
			transaction.commit();
			return userList;
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();

		return userList;
	}

	@Override
	public boolean updateflight(FlightDTO flightdto) {
		boolean state = false;
		try {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(flightdto);
			em.getTransaction().commit();
			state = true;
		}catch(Exception e) {
			e.printStackTrace();
			state = false;
		}
		return state;
	}
	
	@Override
	public boolean deleteFlight(String flightno) {
		boolean status=false;
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		FlightDTO flightdto=null;
		try {
			flightdto=em.find(FlightDTO.class,flightno);
			em.remove(flightdto);
			status=true;
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		em.close();

		return status;
	}

	@Override
	public FlightDTO searchFlight(String flightno) {

		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		FlightDTO flightdto=null;
		try {
			flightdto=entityManager.find(FlightDTO.class,flightno );
			return flightdto;
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();

		return flightdto;

	}

	@Override
	public List<FlightDTO> listOfFlights() {
		List<FlightDTO> flightlist=null;
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		String hql="SELECT flights FROM FlightDTO flights";
		Query query=entityManager.createQuery(hql);

		try {
			flightlist = query.getResultList();
			transaction.commit();
			return flightlist;
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();

		return flightlist;
	}

	@Override
	public boolean book(BookDTO bookdto) {
		boolean status=false;
		EntityManager entityManager =emf.createEntityManager();
		entityManager.getTransaction().begin();
		try
		{
			entityManager.persist(bookdto);

			entityManager.getTransaction().commit();
			status= true;
		}catch (Exception e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}

		entityManager.close();
		return status;
	}

	@Override
	public boolean deletebooking(int bookingId) {
		boolean status=false;
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		FlightDTO flightdto=null;
		try {
			flightdto=entityManager.find(FlightDTO.class,bookingId );
			entityManager.remove(flightdto);
			status=true;
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();

		return status;
	}

	@Override
	public BookDTO searchBookingId(String bookingId) {
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		BookDTO bookdto=null;
		try {
			bookdto=entityManager.find(BookDTO.class,bookingId);
			return bookdto;
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();

		return bookdto;
	}

	@Override
	public List<BookDTO> listofbooking() {
		List<BookDTO> bookdto=null;
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		String hql="SELECT book FROM  Booking book";
		Query query=entityManager.createQuery(hql);

		try {
			bookdto= query.getResultList();
			transaction.commit();
			return bookdto;
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();


		return bookdto;
	}

	

}
