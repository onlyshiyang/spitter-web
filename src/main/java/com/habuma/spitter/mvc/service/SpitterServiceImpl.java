package com.habuma.spitter.mvc.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.habuma.spitter.mvc.domain.Spitter;
import com.habuma.spitter.mvc.domain.Spittle;

@Service
public class SpitterServiceImpl implements SpitterService {
  
  private List<Spittle> cacheSpittleForTest = new ArrayList<Spittle>();
  
  private List<Spitter> cacheSpitterForTest = new ArrayList<Spitter>();
  
  public SpitterServiceImpl(){
    initialCache();
  }

  public void saveSpittle(Spittle spittle) {
    spittle.setWhen(new Date());
  }

  public List<Spittle> getRecentSpittles(int count) {
    for (Spittle spittle : cacheSpittleForTest){
      System.out.println("******* DEBUG : " + spittle.toString());
    }
    return cacheSpittleForTest;
  }

  public void saveSpitter(Spitter spitter) {
    
  }

  public Spitter getSpitter(long id) {
    return cacheSpitterForTest.get(0);
  }

  public void startFollowing(Spitter follower, Spitter followee) {
    // TODO Auto-generated method stub
  }

  public List<Spittle> getSpittlesForSpitter(Spitter spitter) {
    return cacheSpittleForTest; 
  }

  public List<Spittle> getSpittlesForSpitter(String username) {
    return cacheSpittleForTest;
  }

  public Spitter getSpitter(String username) {
    return cacheSpitterForTest.get(0);
  }

  public void deleteSpittle(long id) {

  }

  public List<Spitter> getAllSpitters() {
    return cacheSpitterForTest;
  }

  public Spittle getSpittleById(long id) {
    return cacheSpittleForTest.get(0);
  }
  
  private void initialCache(){
    
    Spittle spittleRecord = new Spittle();
    spittleRecord.setId(1);
    spittleRecord.setSpitter(1);
    spittleRecord.setText("This is Jack who want to send spittle.");
    spittleRecord.setWhen(new Date());
    cacheSpittleForTest.add(spittleRecord);
    
    spittleRecord = new Spittle();
    spittleRecord.setId(2);
    spittleRecord.setSpitter(1);
    spittleRecord.setText("This is Jack who is doing spittle.");
    spittleRecord.setWhen(new Date());
    cacheSpittleForTest.add(spittleRecord);
    
    spittleRecord = new Spittle();
    spittleRecord.setId(3);
    spittleRecord.setSpitter(1);
    spittleRecord.setText("This is Jack who complete the spittle.");
    spittleRecord.setWhen(new Date());
    cacheSpittleForTest.add(spittleRecord);
    
    spittleRecord = new Spittle();
    spittleRecord.setId(4);
    spittleRecord.setSpitter(2);
    spittleRecord.setText("This is Paul who want to send spittle.");
    spittleRecord.setWhen(new Date());
    cacheSpittleForTest.add(spittleRecord);
    
    spittleRecord = new Spittle();
    spittleRecord.setId(5);
    spittleRecord.setSpitter(2);
    spittleRecord.setText("This is Paul who is doing spittle.");
    spittleRecord.setWhen(new Date());
    cacheSpittleForTest.add(spittleRecord);
    
    spittleRecord = new Spittle();
    spittleRecord.setId(6);
    spittleRecord.setSpitter(2);
    spittleRecord.setText("This is Paul who complete the spittle.");
    spittleRecord.setWhen(new Date());
    cacheSpittleForTest.add(spittleRecord);
    
    cacheSpitterForTest.add(new Spitter(1, "Jack", "Jack", "Jack Danny", cacheSpittleForTest.subList(0, 2), "jack.danny@gmail.com", true));
    cacheSpitterForTest.add(new Spitter(2, "Paul", "Paul", "Paul Allen", cacheSpittleForTest.subList(3, 5), "paul.allen@gmail.com", true));
  }
}
