/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package member;

import jenis_member.JenisMember;

/**
 *
 * @author HD-PC
 */
public class Member {
    public String id;
    public String nama;
    private JenisMember jenisMember;
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setJenisMember(JenisMember jenisMember) {
        this.jenisMember = jenisMember;
    }
    
    public JenisMember getJenisMember() {
        return jenisMember;
    }
}
