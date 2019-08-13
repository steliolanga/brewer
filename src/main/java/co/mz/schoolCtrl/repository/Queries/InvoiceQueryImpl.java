//package co.mz.schoolCtrl.repository.Queries;
//
//import java.awt.print.Pageable;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.hibernate.Criteria;
//import org.hibernate.Session;
//import org.hibernate.criterion.Projections;
//import org.hibernate.criterion.Restrictions;
//import org.springframework.data.domain.Page;
//import org.springframework.transaction.annotation.Transactional;
//
//import co.mz.schoolCtrl.model.Invoice;
//import co.mz.schoolCtrl.repository.filter.InvoiceFilter;
//
//public class InvoiceQueryImpl implements InvoiceQuery{
//
//	@PersistenceContext
//	private EntityManager manager;
//	
//	@Override
//	@Transactional(readOnly = true)
//	public Page<Invoice> filterInvoice(InvoiceFilter filtro, Pageable pageable) {
//		Criteria criteria = manager.unwrap(Session.class).createCriteria(Invoice.class);
//		
//		int paginaAtual = pageable.getNumberOfPages();
//		int totalRegistrosPorPagina = 20;
//		int primeiroRegistro = paginaAtual * totalRegistrosPorPagina;
//		
//		criteria.setFirstResult(primeiroRegistro);
//		criteria.setMaxResults(totalRegistrosPorPagina);
//		
//		adicionarFiltro(filtro, criteria);
//		
//		//return new PageImpl<>();
//		return null;
//	}
//	
//	private Long total(InvoiceFilter filtro) {
//		Criteria criteria = manager.unwrap(Session.class).createCriteria(Invoice.class);
//		adicionarFiltro(filtro, criteria);
//		criteria.setProjection(Projections.rowCount());
//		return (Long) criteria.uniqueResult();
//	}
//
//	private void adicionarFiltro(InvoiceFilter filtro, Criteria criteria) {
//		if (filtro != null) {
//		
//			if (isServicePresent(filtro)) {
//				criteria.add(Restrictions.eq("service", filtro.getService()));
//			}
//			
//			if (isClassPresent(filtro)) {
//				criteria.add(Restrictions.eq("classe", filtro.getMatricula().getGrade()));
//			}
//
//			
////			if (filtro.getValorDe() != null) {
////				criteria.add(Restrictions.ge("valor", filtro.getValorDe()));
////			}
////
////			if (filtro.getValorAte() != null) {
////				criteria.add(Restrictions.le("valor", filtro.getValorAte()));
////			}
//		}
//	}
//	
//	private boolean isServicePresent(InvoiceFilter filtro) {
//		return filtro.getService() != null && filtro.getService().getId() != null;
//	}
//	private boolean isClassPresent(InvoiceFilter filtro) {
//		return filtro.getMatricula().getGrade() != null && filtro.getMatricula().getGrade().getId() != null;
//	}
//
//
//
//
//}
