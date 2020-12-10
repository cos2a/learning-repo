package io.ukihsoroy.gatling.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * 任务实体类
 * @author K.O
 */
@Entity
@Table(name = "t_task")
public class Task {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "executor_batch")
    private String executorBatch;

    @Column(name = "upload_table_id")
    private Integer uploadTableId;

    @Column(name = "origin_datasource_name")
    private String originDatasourceName;

    @Column(name = "origin_schema_name")
    private String originSchemaName;

    @Column(name = "origin_table_name")
    private String originTableName;

    @Column(name = "target_datasource_name")
    private String targetDatasourceName;

    @Column(name = "target_schema_name")
    private String targetSchemaName;

    @Column(name = "target_table_name")
    private String targetTableName;

    @Column(name = "target_table_type")
    private String targetTableType;

    @Column(name = "data_sync_type")
    private String dataSyncType;

    @Column(name = "testing_strategy_id")
    private Integer testingStrategyId;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "task_status")
    private Integer taskStatus;

    @Column(name = "task_report")
    private String taskReport;

    @Column(name = "enable")
    private Integer enable;

    @Column(name = "version")
    private Integer version;

    @Column(name = "gmt_created")
    private Date gmtCreated;

    @Column(name = "gmt_updated")
    private Date gmtUpdated;

    public Task() {
    }

    public Task(Integer id, String executorBatch, Integer uploadTableId, String originDatasourceName, String originSchemaName, String originTableName, String targetDatasourceName, String targetSchemaName, String targetTableName, String targetTableType, String dataSyncType, Integer testingStrategyId, Date startTime, Date endTime, Integer taskStatus, String taskReport, Integer enable, Integer version, Date gmtCreated, Date gmtUpdated) {
        this.id = id;
        this.executorBatch = executorBatch;
        this.uploadTableId = uploadTableId;
        this.originDatasourceName = originDatasourceName;
        this.originSchemaName = originSchemaName;
        this.originTableName = originTableName;
        this.targetDatasourceName = targetDatasourceName;
        this.targetSchemaName = targetSchemaName;
        this.targetTableName = targetTableName;
        this.targetTableType = targetTableType;
        this.dataSyncType = dataSyncType;
        this.testingStrategyId = testingStrategyId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.taskStatus = taskStatus;
        this.taskReport = taskReport;
        this.enable = enable;
        this.version = version;
        this.gmtCreated = gmtCreated;
        this.gmtUpdated = gmtUpdated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExecutorBatch() {
        return executorBatch;
    }

    public void setExecutorBatch(String executorBatch) {
        this.executorBatch = executorBatch;
    }

    public Integer getUploadTableId() {
        return uploadTableId;
    }

    public void setUploadTableId(Integer uploadTableId) {
        this.uploadTableId = uploadTableId;
    }

    public String getOriginDatasourceName() {
        return originDatasourceName;
    }

    public void setOriginDatasourceName(String originDatasourceName) {
        this.originDatasourceName = originDatasourceName;
    }

    public String getOriginSchemaName() {
        return originSchemaName;
    }

    public void setOriginSchemaName(String originSchemaName) {
        this.originSchemaName = originSchemaName;
    }

    public String getOriginTableName() {
        return originTableName;
    }

    public void setOriginTableName(String originTableName) {
        this.originTableName = originTableName;
    }

    public String getTargetDatasourceName() {
        return targetDatasourceName;
    }

    public void setTargetDatasourceName(String targetDatasourceName) {
        this.targetDatasourceName = targetDatasourceName;
    }

    public String getTargetSchemaName() {
        return targetSchemaName;
    }

    public void setTargetSchemaName(String targetSchemaName) {
        this.targetSchemaName = targetSchemaName;
    }

    public String getTargetTableName() {
        return targetTableName;
    }

    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    public String getTargetTableType() {
        return targetTableType;
    }

    public void setTargetTableType(String targetTableType) {
        this.targetTableType = targetTableType;
    }

    public String getDataSyncType() {
        return dataSyncType;
    }

    public void setDataSyncType(String dataSyncType) {
        this.dataSyncType = dataSyncType;
    }

    public Integer getTestingStrategyId() {
        return testingStrategyId;
    }

    public void setTestingStrategyId(Integer testingStrategyId) {
        this.testingStrategyId = testingStrategyId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskReport() {
        return taskReport;
    }

    public void setTaskReport(String taskReport) {
        this.taskReport = taskReport;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtUpdated() {
        return gmtUpdated;
    }

    public void setGmtUpdated(Date gmtUpdated) {
        this.gmtUpdated = gmtUpdated;
    }
}
