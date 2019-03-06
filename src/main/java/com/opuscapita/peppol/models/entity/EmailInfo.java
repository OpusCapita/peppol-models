package com.opuscapita.peppol.models.entity;

import com.opuscapita.peppol.models.utils.TimeStampUtils;

import javax.persistence.*;
import java.sql.Timestamp;

//@Entity
//@Table(name = "emails")
public class EmailInfo implements Comparable<EmailInfo> {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @OneToOne
    @JoinColumn(name = "file_id")
    private FileInfo relatedFile;

    @Column(name = "ts")
    private Timestamp timestamp;

    @Column(name = "status")
    private String status;

    @Column(name = "mail_file")
    private String mailFilePath;

    @Override
    public int compareTo(EmailInfo other) {
        return TimeStampUtils.compare(this.getTimestamp(), other.getTimestamp());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FileInfo getRelatedFile() {
        return relatedFile;
    }

    public void setRelatedFile(FileInfo relatedFile) {
        this.relatedFile = relatedFile;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMailFilePath() {
        return mailFilePath;
    }

    public void setMailFilePath(String mailFilePath) {
        this.mailFilePath = mailFilePath;
    }

}
