package org.poetryLibrary.SQLServerRepository.Repository;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.impl.NoOpLog;
import org.apache.commons.logging.impl.SimpleLog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.poetryLibrary.SQLServerRepository.Entities.*;
import org.poetryLibrary.SQLServerRepository.Utils.Validtion;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

public class SQLRepository {
    private SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

    public List <Poet>AllPoet(Integer page){
        Session session=sessionFactory.openSession();
        StoredProcedureQuery query=session.createStoredProcedureQuery("get.allPoet",Poet.class);
        if (Validtion.validNumber(page)) {
            query.registerStoredProcedureParameter("size",Integer.class,ParameterMode.IN);
            query.setParameter("size", page);
        }
        query.execute();
        return query.getResultList();

    }

    public List<Poem>Allpoem(Integer page){
        Session session=sessionFactory.openSession();
        StoredProcedureQuery query=session.createStoredProcedureQuery("[get].[allpoemInfo]",Poem.class);
        if (Validtion.validNumber(page)) {
            query.registerStoredProcedureParameter("size",Integer.class,ParameterMode.IN);
            query.setParameter("size", page);
        }
        query.execute();
        return query.getResultList();

    }

    public List<BarsOnly>Poem(String poemName){
        Session session=sessionFactory.openSession();
        StoredProcedureQuery query=session.createStoredProcedureQuery("[get].[Poem]",BarsOnly.class);
        if (Validtion.validText(poemName)) {
            query.registerStoredProcedureParameter("poem",String.class,ParameterMode.IN);
            query.setParameter("poem", Validtion.normalize(poemName));
        }
        query.execute();
        return query.getResultList();

    }

    public List<PoemInfo>PoemInfo(String poemName) {
        Session session=sessionFactory.openSession();
        StoredProcedureQuery query=session.createStoredProcedureQuery("[get].[poemInfo]",PoemInfo.class);
        if (Validtion.validText(poemName)) {
            query.registerStoredProcedureParameter("name",String.class,ParameterMode.IN);
            query.setParameter("name", Validtion.normalize(poemName));
        }
        query.execute();
        return query.getResultList();
    }

    public bar Bar(){

        Session session=sessionFactory.openSession();
        StoredProcedureQuery query=session.createStoredProcedureQuery("[get].[randomBar]",bar.class);

            query.registerStoredProcedureParameter("random",Integer.class,ParameterMode.IN);
            query.setParameter("random", Validtion.random());

        query.execute();
        return (bar) query.getSingleResult();
    }

    public PoetInfo PoetInfo(String poetName){
        PoetInfo poet=new PoetInfo();
        Session session=sessionFactory.openSession();
        StoredProcedureQuery query=session.createStoredProcedureQuery("[get].[allPoet]",Poet.class);
        if (Validtion.validText(poetName)) {
            query.registerStoredProcedureParameter("size",Integer.class,ParameterMode.IN);
            query.setParameter("size", 1);
            query.registerStoredProcedureParameter("name",String.class,ParameterMode.IN);
            query.setParameter("name", Validtion.normalize(poetName));
        }
        query.execute();

        poet.setPoet((Poet) query.getSingleResult());

        query=session.createStoredProcedureQuery("[get].[poetInfo]",album.class);
        if (Validtion.validText(poetName)) {
            query.registerStoredProcedureParameter("name",String.class,ParameterMode.IN);
            query.setParameter("name", Validtion.normalize(poetName));
        }
        query.execute();
        poet.setAlbum(query.getResultList());
        LogFactory.getLog("4bd4ll4h").info(poet.getAlbum().size());

        for (album album :poet.getAlbum()){
            query=session.createStoredProcedureQuery("[get].[albumInfo]",AlbumPoem.class);
            if (Validtion.validText(poetName)) {
                query.registerStoredProcedureParameter("albumName",String.class,ParameterMode.IN);
                query.setParameter("albumName", Validtion.normalize(album.getAlbumName()));
            }
            query.execute();
            album.setAlbumPoems(query.getResultList());
        }
        album album=new album("Poem with no album");
        query=session.createStoredProcedureQuery("[get].[albumInfo]",AlbumPoem.class);
        if (Validtion.validText(poetName)) {
            query.registerStoredProcedureParameter("albumName",String.class,ParameterMode.IN);
            query.setParameter("albumName", Validtion.normalize(album.getAlbumName()));
            query.registerStoredProcedureParameter("poetName",String.class,ParameterMode.IN);
            query.setParameter("poetName", Validtion.normalize(poetName));
        }
        query.execute();
        album.setAlbumPoems(query.getResultList());
        poet.getAlbum().add(album);
        return poet;
    }

}
